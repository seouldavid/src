package com.ict.day25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex05_JDBC {
	// customer 테이블에 6, 이강인, 대한민국 제주도, 010-1234-7890을 삽입
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/ictedu_db";
			String user = "ictedu";
			String password = "1111";
			
			conn = DriverManager.getConnection(url,user,password);
			String sql =String.format("update customertbl set name ='둘리', address = '서울 방학동' where name = '장미란'");
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if (result>0) {
				
				System.out.println("업데이트 성공");
				sql = "select * from customertbl";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					System.out.print(rs.getInt(1)+"\t\t");
					System.out.print(rs.getString(2)+"\t\t");
					System.out.print(rs.getString(3)+"\t\t");
					System.out.println(rs.getString(4)+"\t\t");
				}
			} 
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		
	}
}
