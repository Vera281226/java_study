package mypack;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

//키보드로 직급을 입력하여 해당 직급에 해당하는 직원 자료 출력
//--- 출력 형태 ------------------
//직원번호 직원명 부서명 직급 성별
//... 
//인원 수 : *

public class DbTest7Ex {
	private Connection connection;
	private PreparedStatement statement;
	private ResultSet resultset;
	private Properties properties=new Properties();
	
	public DbTest7Ex() {dbLoad(); insertJikShow();}
	
	private void dbLoad() {
		try {
			properties.load(new FileInputStream("C:/work/jsou/java_normal/src/pack/dbinfo.properties"));	
			Class.forName(properties.getProperty("driver"));
		}catch(Exception e) {e.printStackTrace(); System.exit(0);}}

	private void insertJikShow() {
		try {
		connection=DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("user"),properties.getProperty("passwd"));
		Scanner scanner = new Scanner(System.in);
		System.out.println("직급 입력");
		String jik=scanner.next();
		statement=connection.prepareStatement("SELECT jikwonno,jikwonname,busername,jikwonjik,jikwongen FROM jikwon INNER JOIN buser ON busernum=buserno WHERE jikwonjik=?");
		statement.setString(1, jik);
		resultset=statement.executeQuery();
		int count=0;
		System.out.println("직원번호\t직원명\t부서명\t직급\t성별");
		while(resultset.next()) {
			System.out.println(resultset.getString(1)+"\t"+resultset.getString(2)+"\t"+resultset.getString(3)+"\t"+resultset.getString(4)+"\t"+resultset.getString(5));
		count++;}
		System.out.println("인원 수 : "+count);
		scanner.close();
		}catch(Exception e) {e.printStackTrace(); System.exit(0);}
		finally {
			try {
				if(resultset!=null)resultset.close();
				if(statement!=null)statement.close();
				if(connection!=null)connection.close();
			}catch(Exception e) {e.printStackTrace();}}}
	
public static void main(String[] args) {	new DbTest7Ex();}}