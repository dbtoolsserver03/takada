package cn.itcast.mybatis.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class JdbcTest32 {

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
			connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/livan?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true", "root", "123456");

			connection.setAutoCommit(false);

			String sql = "insert into `score_table` (`student_id`, `course_id`, `score`, `update_time`) values (?,'c001',90,'2020/07/19 11:12:17');";
			//获取预处理statement
			preparedStatement = connection.prepareStatement(sql);

			System.out.println(new Date());

			for (int i = 0; i < 100000; i++) {
				//设置参数，第一个参数为sql语句中参数的序号（从1开始），第二个参数为设置的参数值
				preparedStatement.setString(1, "b32"+String.format("%05d",i) );
				preparedStatement.addBatch();
			}

			// 返回值代表收到影响的行数
			int[] result =  preparedStatement.executeBatch();
			connection.commit();
			System.out.println(new Date());

            System.out.println("插入成功 "+result.length);

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
