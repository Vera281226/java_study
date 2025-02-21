package pack;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class DbTest2curd {
	private Connection connection=null;
	private Statement statement=null;
	private ResultSet resultset=null;
	private Properties properties=new Properties(); // properties 확장자 파일 읽기용
	public DbTest2curd() {
		try {
			// 보안 목적으로 별도의 properties 파일로 만들어 저장 시킨 후 읽어온다 secure coding 가이드 라인을 따름
			properties.load(new FileInputStream("C:/work/jsou/java_normal/src/pack/dbinfo.properties"));
			Class.forName(properties.getProperty("driver"));
			connection=DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("user"),properties.getProperty("passwd"));
			dbProcess();
			System.out.println("종료");
		} catch (Exception e) {e.printStackTrace();}
		finally {
				try {
				if(connection!=null) connection.close();
				} catch (Exception e) {e.printStackTrace();}
		}
	}
	private void dbProcess() { // 각 기능은 별도의 메소드들로 만들어 주는 것이 좋다
		try {
			statement=connection.createStatement();
			
			// connection.setAutoCommit(false); // Transaction 수동 자동 Commit 끄기
			// insert, update, delete등의 작업으로 Transaction 시작 COMMIT, ROLLBACK으로 Transaction 종료
			// connection.setAutoCommit(true); // 다시 Transaction 자동 Commit 켜기
			
			// SELECT 뿐만 아니라 INSERT, DELETE, UPDATE에도 쿼리 수행 성공한 횟수만큼 반환값이 있다
			// 자료 추가 Auto Commit (Transaction)
			// String sqlI="INSERT INTO sangdata VALUES(5,'새우깡',2,1000)"; // 숫자를 ''로 둘러줘도 된다
			// statement.executeUpdate(sqlI); // SELECT 이외에 INSERT,UPDATE,DELETE는 excuteUpdate 사용
					
			// 자료 수정 
			/*String sqlU="UPDATE sangdata SET sang='허니칩', su=17 WHERE code=5";
			int upResult=statement.executeUpdate(sqlU);
			System.out.println("쿼리 수행 성공 횟수 : "+upResult);
			if (upResult>0) System.out.println("수정 성공");
			else System.out.println("수정 실패");*/
			
			// 자료 삭제
			String sqlD="DELETE FROM sangdata WHERE code=5";
			int delResult=statement.executeUpdate(sqlD);
			if (delResult>0) System.out.println("삭제 성공");
			else System.out.println("삭제 실패");
			
			// 자료 읽기
			String sqlS="SELECT*FROM sangdata";
			resultset=statement.executeQuery(sqlS);
			int count=0;
			while(resultset.next()) {
				System.out.println(resultset.getString("code")+"\t"+resultset.getString("sang")+"\t"+resultset.getString("su")+"\t"+resultset.getString("dan"));
				count++;
			}
			System.out.println("건수 : "+count);
			}catch(Exception e) {e.printStackTrace();}
				finally {
					try {
						if(resultset!=null) resultset.close();
						if(statement!=null) statement.close();
						if(connection!=null) connection.close();
						} catch (Exception e) {e.printStackTrace();}
					}	
	}
	public static void main(String[] args) {new DbTest2curd();}
}