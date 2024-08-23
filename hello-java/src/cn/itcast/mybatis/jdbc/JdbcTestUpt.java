package cn.itcast.mybatis.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcTestUpt {

	public static void main(String[] args) {

		//数据库连接
		Connection connection = null;
		//预编译的Statement，使用预编译的Statement提高数据库性能
		PreparedStatement preparedStatement = null;

		
		try {
			//加载数据库驱动
			Class.forName("com.mysql.cj.jdbc.Driver");

			//通过驱动管理类获取数据库链接
			connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true", "root", "123456");
			
			connection.setAutoCommit(false);
			
			//定义sql语句 ?表示占位符
			String sql1 = "update t_emp set sal = sal- ? where first_nm = ?";
			//获取预处理statement
			preparedStatement = connection.prepareStatement(sql1);
			//设置参数，第一个参数为sql语句中参数的序号（从1开始），第二个参数为设置的参数值
			preparedStatement.setInt(1, 10);
			preparedStatement.setString(2, "中島");
			
			//向数据库发出sql执行
			int cnt1 =  preparedStatement.executeUpdate();
			System.out.println(cnt1 + "更新済み");
			
			//定义sql语句 ?表示占位符
			String sql2 = "update t_emp set sal = sal+ ? where first_nm = ?";
			//获取预处理statement
			preparedStatement = connection.prepareStatement(sql2);
			//设置参数，第一个参数为sql语句中参数的序号（从1开始），第二个参数为设置的参数值
			preparedStatement.setInt(1, 10);
			preparedStatement.setString(2, "木村");
			
			//向数据库发出sql执行
			int cnt2 =  preparedStatement.executeUpdate();
			
			connection.commit();
			System.out.println(cnt2 + "更新済み");
			
		} catch (Exception e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO 自動生成された catch ブロック
				e1.printStackTrace();
			}
		}finally{

			if(preparedStatement!=null){
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(connection!=null){
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}


	}
}
