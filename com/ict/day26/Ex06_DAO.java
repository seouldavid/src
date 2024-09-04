package com.ict.day26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//DAO: "데이터베이스에 접근하기 위한 객체
public class Ex06_DAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int result = 0;

	// 싱글턴 패턴 : 소프트웨어 디자인 패턴 중 하나
	// 생성자가 여러번 호출 되어도 실제 생성 된 객체는 하나이고,
	// 프로그램이 끝날때까지 같은 객체는 하나만 사용 된다.
	// spring은 기본적으로 싱글턴 패턴을 사용

	private static final Ex06_DAO dao = new Ex06_DAO();

	public static Ex06_DAO getInstance() {
		return dao;
	}

	// DB 접속 메서드
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/ictedu_db";
			String user = "ictedu";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			return conn;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return null;
	}

	// 나머지 메서드들은 사용자 요구에 맞는 메서드를 만들면 된다.
	// customer 테이블 전체 데이터 보기 메서드
	public void getSelectAll() {
		try {
			conn = getConnection();
			String sql = "select * from customertbl";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("번호\t이름\t주소\t전화번호");
			while (rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.println(rs.getString(4));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2);
			}
		}
	}

	// customer 테이블 특정 데이터 보기 메서드 (custid(pk)를 받아서 검색)
	public void getSelectOne(int custid) {
		try {
			conn = getConnection();
			String sql = "select * from customertbl where custid= ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, custid);
			rs = pstmt.executeQuery();
			if (rs.isBeforeFirst() ) {
				System.out.println("번호\t이름\t주소\t전화번호");
				while (rs.next()) {
					System.out.print(rs.getInt(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.println(rs.getString(4));
				}
			} else {
				System.out.println("custid 또는 데이터가 없습니다.");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2);
			}
		}
	}

	// customer 테이블 데이터 보기 삽입
	public void getInsert(String name, String address, String phone) {
		try {
			conn = getConnection();
			String sql = "insert into customertbl(name,address,phone) values(?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, address);
			pstmt.setString(3, phone);
			int result = pstmt.executeUpdate();
			if (result>0) {
				getSelectAll();
			}
		} catch (SQLException e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}

	// customer 테이블 특정 데이터 삭제 (custid(pk)를 받아서 검색)
	public void getDelete(int custid) {
		try {
			conn = getConnection();
			String sql = "delete from customertbl where custid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, custid);
			int result = pstmt.executeUpdate();
			if (result>0) {
				getSelectAll();
			}
		} catch (SQLException e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}

	// customer 테이블 특정 데이터 수정
	public void getUpdate(int custid, String name, String address, String phone) {
		try {
			conn = getConnection();
			String sql ="update customertbl set name= ?, address = ?, phone = ? where custid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, address);
			pstmt.setString(3, phone);
			pstmt.setInt(4, custid);
			
			result = pstmt.executeUpdate();
			if (result>0) {
				getSelectAll();
			} else {
				System.out.println("결과 없음 업데이트 실패");
			}
			
		} catch (SQLException e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}

	public boolean isInTable(int custid) {
		try {
			conn = getConnection();
			String sql = "select * from customertbl where custid= ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, custid);
			rs = pstmt.executeQuery();
			return rs.isBeforeFirst();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		System.out.println(e);
		}finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		return false;
	}
}
