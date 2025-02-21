package mypack;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

//관리 고객이 있는 직원을 출력~
//--- 출력 형태 ------------------
//직원번호 직원명 직급 관리고객명 고객전화
//...
//전체 건수 : *

public class DbTest6Ex {
	private Connection connection;
	private PreparedStatement statement;
	private ResultSet resultset;
	private Properties properties=new Properties();
	
	public DbTest6Ex() {dbLoad(); showTable();}
	
	private void dbLoad() {
		try {
			properties.load(new FileInputStream("C:/work/jsou/java_normal/src/pack/dbinfo.properties"));	
			Class.forName(properties.getProperty("driver"));
		}catch(Exception e) {e.printStackTrace(); System.exit(0);}}

private void showTable() {
	try {
	connection=DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("user"),properties.getProperty("passwd"));
	statement=connection.prepareStatement("SELECT jikwonno,jikwonname,jikwonjik,gogekname,gogektel FROM jikwon INNER JOIN gogek ON jikwonno=gogekdamsano");
	resultset=statement.executeQuery();
	int count=0;
	System.out.println("직원번호\t직원명\t직급\t관리고객명\t고객전화");

	while(resultset.next()) {
		System.out.println(resultset.getString(1)+"\t"+resultset.getString(2)+"\t"+resultset.getString(3)+
				"\t"+resultset.getString(4)+"\t"+resultset.getString(5)); count++;}
	System.out.println("전체 건수: "+count);
	}catch(Exception e) {e.printStackTrace(); System.exit(0);}
	
	finally {
		try {
			if(resultset!=null)resultset.close();
			if(statement!=null)statement.close();
			if(connection!=null)connection.close();
		}catch(Exception e) {e.printStackTrace();}}}

public static void main(String[] args) {new DbTest6Ex();}}