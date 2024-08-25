package cn.itcast.mybatis.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcTest1 {

	public static void main(String[] args) {

		//数据库连接
		Connection connection = null;
		//预编译的Statement，使用预编译的Statement提高数据库性能
		PreparedStatement preparedStatement = null;
		//结果 集
		ResultSet resultSet = null;

		try {

			
			//加载数据库驱动
			Class.forName("com.mysql.cj.jdbc.Driver");

			//通过驱动管理类获取数据库链接
			connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/testz3?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true", "root", "123456");
			//定义sql语句 ?表示占位符
			String sql = "select  name , salary sal from   TEACHER  where   name like '%a%'";
			//获取预处理statement
			preparedStatement = connection.prepareStatement(sql);
			//向数据库发出sql执行查询，查询出结果集
			resultSet =  preparedStatement.executeQuery();
			//遍历查询结果集
			while(resultSet.next()){
				System.out.println(resultSet.getString("name")+"  "+resultSet.getString("sal"));
			}
			
			System.out.println(" finish ");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			//释放资源
			if(resultSet!=null){
				try {
					resultSet.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
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
