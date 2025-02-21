package mypack;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

//키보드로 특정 직원의 번호와 이름을 입력한다. 
//해당 직원이 jikwon 테이블에 없으면 "작업 종료" 메세지와 함께 프로그램 종료.
//예 : 이순신과 같은 부서에 근무하는 직원과 해당 직원이 관리하는 고객 출력
//--- 출력 형태 ------------------
//직원명    부서명     근무지역     직급     고객명    고객전화    고객나이
//한송이    총무부       서울          사원      천송이    333-7788       29   
//...
//총무부 연봉 평균 : *** (소수 첫째자리에서 반올림)

public class DbTest9Ex {
	private Connection connection;
	private PreparedStatement statement;
	private ResultSet resultset;
	private Properties properties=new Properties();
	
	public DbTest9Ex() {dbLoad();insertInfo();}
	
	private void dbLoad() {
		try {
			properties.load(new FileInputStream("C:/work/jsou/java_normal/src/pack/dbinfo.properties"));	
			Class.forName(properties.getProperty("driver"));
		}catch(Exception e) {e.printStackTrace(); System.exit(0);}}

	private void insertInfo() {
		try {
		connection=DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("user"),properties.getProperty("passwd"));
		Scanner scanner = new Scanner(System.in);
		System.out.print("직원번호 : ");
		String no=scanner.next();
		System.out.println("직원이름 : ");
		String name=scanner.next();
		statement=connection.prepareStatement("SELECT jikwonname,busername,buserloc,jikwonjik,gogekname,gogektel,TIMESTAMPDIFF(YEAR,STR_TO_DATE(SUBSTR(gogekjumin,1,6),'%y %m %d'),NOW()) AS 나이 "
				+ "FROM jikwon INNER JOIN buser ON busernum=buserno INNER JOIN gogek ON jikwonno=gogekdamsano "
				+ "WHERE busernum=(SELECT busernum FROM jikwon WHERE jikwonno=? AND jikwonname=?)");
		statement.setString(1, no);
		statement.setString(2, name);
		
		resultset=statement.executeQuery();
		if(resultset.next()==false){System.out.println("입력값 오류 종료"); System.exit(0);}
		else {
			System.out.println("직원명\t부서명\t근무지역\t직급\t고객명\t고객전화\t\t고객나이");
			while(resultset.next()) {
				System.out.println(resultset.getString(1)+"\t"+resultset.getString(2)+"\t"+resultset.getString(3)+"\t"+resultset.getString(4)+"\t"+resultset.getString(5)+"\t"+resultset.getString(6)+"\t"+resultset.getString(7));
			}}
		statement=connection.prepareStatement("SELECT busername, AVG(jikwonpay) FROM jikwon INNER JOIN buser ON busernum=buserno WHERE jikwonname=?");
		statement.setString(1, name);
		resultset=statement.executeQuery();
		resultset.next();
		System.out.println(resultset.getString(1)+"연봉 평균 : "+resultset.getInt(2));
		scanner.close();
		}catch(Exception e) { e.printStackTrace(); System.exit(0);}
		finally {
			try {
				if(resultset!=null)resultset.close();
				if(statement!=null)statement.close();
				if(connection!=null)connection.close();
			}catch(Exception e) {e.printStackTrace();}}}
	
	public static void main(String[] args) {new DbTest9Ex();}}