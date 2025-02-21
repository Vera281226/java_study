package pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
// 각각의 모듈로 따로 만들어 필요할때만 연결해서 꺼주는 것이 좋다 계속 켜두는 것은 매우 비효율적이다
public class DbTest4INSERT {
	private Connection connection;
	private PreparedStatement statement;
	private ResultSet resultset;
	public DbTest4INSERT() {
		dbLoad(); System.out.println("로드 성공");
		insertData();
		showData();
	}
	private void dbLoad() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		}catch(Exception e) {e.printStackTrace(); System.exit(0);}}
	
	private void insertData() {
		try {
			connection=DriverManager.getConnection("jdbc:mariadb://localhost:3306/test","root","123");
			
			// 입력 반복
			Scanner scanner = new Scanner(System.in);
			while(true) {
				System.out.print("코드 입력:");
				String code=scanner.next();
				System.out.print("상품명 입력:");
				String sang=scanner.next();
				System.out.print("수량 입력:");
				String su=scanner.next();
				System.out.print("단가 입력:");
				String dan=scanner.next();
				// 입력자료 오류 검사는 생략함
	
				statement=connection.prepareStatement("INSERT INTO sangdata VALUES(?,?,?,?)");
				statement.setString(1, code);
				statement.setString(2, sang);
				statement.setString(3, su);
				statement.setString(4, dan);
				statement.executeUpdate();
				
				System.out.print("계속 할까요?(y/n)");
				String yn = scanner.next();
				if(yn.equals("n")) {System.out.println("종료"); scanner.close(); break;}
			}
		}catch(Exception e) {e.printStackTrace(); System.exit(0);}
		finally {
			try {
				if(statement!=null)statement.close();
				if(connection!=null)connection.close();
			}catch(Exception e) {e.printStackTrace(); System.exit(0);}}
	}
	
	private void showData() {
		try {
			connection=DriverManager.getConnection("jdbc:mariadb://localhost:3306/test","root","123");
			statement=connection.prepareStatement("SELECT*FROM sangdata");
			resultset=statement.executeQuery();
			int count=0;
			while(resultset.next()) {
				String code=resultset.getString(1);
				String sangpum=resultset.getString(2);
				int su=resultset.getInt(3);
				int dan=resultset.getInt(4);
				System.out.println(code+" "+sangpum+" "+su+" "+dan);
				count++;
			}
			System.out.println("건수 : "+count);
		}catch(Exception e) {e.printStackTrace(); System.exit(0);}
		finally {
			try {
				if(resultset!=null)resultset.close();
				if(statement!=null)statement.close();
				if(connection!=null)connection.close();
			}catch(Exception e) {e.printStackTrace(); System.exit(0);}}
	}
	
	public static void main(String[] args) {new DbTest4INSERT();}
	
}
