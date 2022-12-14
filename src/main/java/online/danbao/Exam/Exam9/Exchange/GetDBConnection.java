package online.danbao.Exam.Exam9.Exchange;


import java.sql.*;

import java.sql.Connection;

public class GetDBConnection {
	public static Connection connectDB(String id,String pwd) {
		try {
			Class.forName("con.mysql.cj.jdbc.Driver");
		}catch(Exception e) {} // 加载驱动 jdbc.Driver
		Connection con =null;
		String url = "jdbc:mysql://localhost:3306/scsstudy?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai";
		try {
			con=DriverManager.getConnection(url,id,pwd);//连接
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		return con;
	}
}
