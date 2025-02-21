package pack;

import java.sql.Connection;
import java.sql.DriverManager;
// PreparedStatement : 선 처리 방식
// 동일한 SQL문을 여러 클라이언트가 빈번하게 사용할 경우 효과적
// ? 연산자를 사용하여 보안을 강화하여 SQL Injection 공격을 방지할 수 있고 가독성도 향상시킬 수 있다.
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DbTest3PreparedStatement {
	private Connection connection=null;
	private PreparedStatement pStatement=null;
	private ResultSet resultset=null;
	
	public DbTest3PreparedStatement() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test","root","123");
			dbProcess();
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(connection!=null)connection.close();
				System.exit(0);
			}catch(Exception e) {e.printStackTrace();}}}
	
	public void dbProcess() {
		// 전체 자료 읽기
		try {
			String sql="SELECT*FROM sangdata";
			pStatement=connection.prepareStatement(sql); // 선처리 방식
			resultset=pStatement.executeQuery(); // SQL 문장을 excute가 아닌 statement에 준다.
			while(resultset.next()) {
				String code=resultset.getString("code");
				String sangpum=resultset.getString("sang");
				int su=resultset.getInt(3);
				int dan=resultset.getInt("dan");
				System.out.println(code+" "+sangpum+" "+su+" "+dan);}
			
			//부분 자료 읽기
			String co = "1";
			// sql="SELECT*FROM sangdata WHERE code="+co; // 문자열 단순 더하기 사용은 시큐어 코딩에 위배됨
			sql="SELECT*FROM sangdata WHERE code=?"; // ?를  사용함
			pStatement=connection.prepareStatement(sql);
			pStatement.setString(1, co); // PreparedStatement의 첫번째 물음표(?)에 co값을 연결
			resultset=pStatement.executeQuery();
			resultset.next();
			System.out.println(resultset.getString("code")+" "+resultset.getString("sang")+" "+resultset.getString("su")+" "+resultset.getString("dan"));
		
			/*// 자료 추가
			String sqlI="INSERT INTO sangdata VALUES(?,?,?,?)";
			pStatement=connection.prepareStatement(sqlI);
			pStatement.setString(1, "5");
			pStatement.setString(2, "카페라떼");
			pStatement.setString(3, "6");
			pStatement.setInt(4, 6000);
			int re = pStatement.executeUpdate();
			if (re==1) System.out.println("추가 성공");
			else System.out.println("추가 실패");*/
			
			/*// 자료 수정
			sql="UPDATE sangdata SET sang=?,su=?,dan=? WHERE code=?";
			pStatement=connection.prepareStatement(sql);
			pStatement.setString(1, "초코모카");
			pStatement.setInt(2, 11);
			pStatement.setInt(3, 5500);
			pStatement.setInt(4, 5);
			if(pStatement.executeUpdate()>0) System.out.println("수정 성공");
			else System.out.println("수정 실패");*/
			
			/*// 자료 삭제
			sql="DELETE FROM sangdata WHERE code=?";
			pStatement=connection.prepareStatement(sql);
			pStatement.setString(1, "5");
			if(pStatement.executeUpdate()>0) System.out.println("삭제 성공");
			else System.out.println("삭제 실패");*/
			
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(connection!=null)connection.close();
				if(pStatement!=null)pStatement.close();
				if(resultset!=null)resultset.close();
			}catch(Exception e) {e.printStackTrace();}}}

	public static void main(String[] args) {new DbTest3PreparedStatement();}
}