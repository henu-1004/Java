package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//PreparedStatement실습하기
public class PreparedInsertTest {
	
	public static void main(String[] args) {
		
		//DB정보
		String host = "jdbc:oracle:thin:@localhost:1521:xe"; //고유한 주소체계임
		String user = "sho5223";
		String pass = "1234";
		
		try {
			//데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			//SQL실행객체 생성(PreparedStatement)
			String sql = "insert into user1 values (?,?,?,?)"; //쿼리 파라미터를 사용한 SQL(준비된 쿼리 > Prepared의 이유)
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			//각 쿼리 파라미터를 바인딩
			psmt.setString(1, "P101"); 
			psmt.setString(2, "김유신");
			psmt.setString(3, "010-1222-3333");
			psmt.setInt(4, 34);
			
			//SQL 실행
			psmt.executeUpdate();//Insert,Delete,Update는 executeUpdate() 실행
			
			
			//결과처리(SELECT의 경우)
			
			//데이터 베이스 종료
			psmt.close();
			conn.close();
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Insert완료...");
	}
	
}
