package pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbTest1 {
	private Connection connection = null;	// DBMS 연결 지원
	private Statement statement = null;	// SQL문 실행 지원
	private ResultSet resultset = null;	// SELECT 결과 접근 가능
	// 생성자를 통한 연결
	public DbTest1() {
		try { // Driver 파일 로딩
		Class.forName("org.mariadb.jdbc.Driver");
		}catch(Exception e) {System.out.println("로딩 실패 : "+e.getMessage()); return;}
		try { // DB 서버와 연결
			connection=DriverManager.getConnection("jdbc:mariadb://localhost:3306/test","root","123");
		}catch(Exception e) {System.out.println("연결 실패 : "+e.getMessage()); return;}
		try { // SQL문 실행
			statement=connection.createStatement();
			/*// 오리지널 방식이다.
			resultset=statement.executeQuery("SELECT*FROM sangdata"); 
			// 레코드 포인터는 하나만 참조하고있고 첫 레코드에서 멈춰있다 레코드 포인터에게 이동 명령을 내려야한다
			resultset.next(); // resultset의 next()는 true, false값을 반환한다 while문 조건에 사용하면 좋다
			String code=resultset.getString("code"); // 숫자값이여도 문자화해서 문자열로 받을 수 있다
			String sangpum=resultset.getString("sang");
			int su=resultset.getInt("su");
			int dan=resultset.getInt("dan");
			System.out.println(code+" "+sangpum+" "+su+" "+dan);
			*/
//			String sql="SELECT*FROM sangdata";
			String sql = "SELECT code, sang, su, dan FROM sangdata"; // 별명을 줘서 쓸수도 있다
			resultset=statement.executeQuery(sql); // Java에서 SQL문 변수를 따로 만들어서 써도 똑같이 작동한다
			// 읽어올때 컬럼의 이름이 SELECT 이후 순서대로 번호가 매겨져서 컬럼명 없이 번호만 써도 된다
			while(resultset.next()) {
				String code=resultset.getString("code");
				String sangpum=resultset.getString("sang");
				int su=resultset.getInt(3); // 3번째 순서가 sangdata 테이블의 su 컬럼 이라는 뜻이다
				int dan=resultset.getInt("dan");
				System.out.println(code+" "+sangpum+" "+su+" "+dan);
				}	
			sql = "SELECT COUNT(*) c FROM sangdata";
			resultset=statement.executeQuery(sql);
			resultset.next();
			System.out.println("건수 : "+resultset.getInt(1));
			System.out.println("건수 : "+resultset.getInt("c"));
		}catch(Exception e) {System.out.println("처리 실패 : "+e.getMessage()); return;}
		finally {
			try {
			if(resultset!=null) resultset.close();
			if(statement!=null) statement.close();
			if(connection!=null) connection.close();
			//시작한 순서 반대로 닫아주는 것이 좋다
			}catch(Exception e) {System.out.println("종료 에러 발생"+e.getMessage());}
		}
		// System.out.println("연결");
	}
	
	public static void main(String[] args) {
	new DbTest1();
	}
}