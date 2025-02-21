package mypack;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

//문제)
//키보드로  고객명과 전화번호를 입력한다.
//입력한 자료가 맞으면 해당 고객의 담당 직원 정보를 출력.
//만약 입력한 자료가 없으면 '입력자료가 틀렸어요' 라는 메세지를 출력한다.
//--- 출력 형태
//직원번호 직원명 직급 성별 부서명 부서전화
//...

public class DbTest8Ex {
	private Connection connection;
	private PreparedStatement statement;
	private ResultSet resultset;
	private Properties properties=new Properties();
	
	public DbTest8Ex() {dbLoad();insertInfo();}
	
	private void dbLoad() {
		try {
			properties.load(new FileInputStream("C:/work/jsou/java_normal/src/pack/dbinfo.properties"));	
			Class.forName(properties.getProperty("driver"));
		}catch(Exception e) {e.printStackTrace(); System.exit(0);}}

	private void insertInfo() {
		try {
		connection=DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("user"),properties.getProperty("passwd"));
		Scanner scanner = new Scanner(System.in);
		System.out.print("고객 이름 : ");
		String name=scanner.next();
		System.out.println("전화번호 : ");
		String tel=scanner.next();
		statement=connection.prepareStatement("SELECT jikwonno,jikwonname,jikwonjik,jikwongen,busername,busertel "
				+ "FROM jikwon INNER JOIN buser ON busernum=buserno INNER JOIN gogek ON jikwonno=gogekdamsano "
				+ "WHERE gogekname=? AND gogektel=?");
		statement.setString(1, name);
		statement.setString(2, tel);
		
		resultset=statement.executeQuery();
		if(resultset.next()==false){System.out.println("입력값 오류 종료"); System.exit(0);}
		else {
			System.out.println("직원번호\t직원명\t직급\t성별\t부서명\t부서전화");
			while(resultset.next()) {
				System.out.println(resultset.getString(1)+"\t"+resultset.getString(2)+"\t"+resultset.getString(3)+"\t"+resultset.getString(4)+"\t"+resultset.getString(5)+"\t"+resultset.getString(6));
			}}
		scanner.close();
		}catch(Exception e) { e.printStackTrace(); System.exit(0);}
		finally {
			try {
				if(resultset!=null)resultset.close();
				if(statement!=null)statement.close();
				if(connection!=null)connection.close();
			}catch(Exception e) {e.printStackTrace();}}}
	
	public static void main(String[] args) {new DbTest8Ex();}}