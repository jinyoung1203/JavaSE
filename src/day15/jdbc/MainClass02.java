package day15.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainClass02 {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// 1. 드라이버 클래스 정보 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. 데이터베이스 연결
			String url ="jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "hr", "hr");
			
			// 3. 쿼리 수행을 위한 Statement 객체 생성
			stmt = conn.createStatement();
			
			// 4. SQL 쿼리작성
			String sql = "INSERT INTO sales_reps VALUES(2,라이츄,200,0.2)";
		
			
			
			// 5. 쿼리 수행
			int result = stmt.executeUpdate(sql);
			
			//6실행결과 출력하기
			System.out.println("result :" + result );
			
			
			while(rs.next()) {
				String employeeId = rs.getString(1);
				String firstName = rs.getString(2);
				String lastName = rs.getString(3);
				
				System.out.println(employeeId+"/"+firstName+"/"+lastName);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(rs != null)rs.close();
			if(stmt != null)stmt.close();
			if(conn != null)conn.close();
		}
		
	}

}

