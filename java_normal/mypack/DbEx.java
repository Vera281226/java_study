package mypack;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class DbEx {
	private Connection connection=null;
	private Statement statement=null;
	private ResultSet resultSet=null;
	private Properties properties=new Properties();
	
	 public DbEx() {
		 try {
			 properties.load(new FileInputStream("C:/work/jsou/java_normal/src/pack/dbinfo.properties"));
			 Class.forName(properties.getProperty("driver"));
			 connection=DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("user"),properties.getProperty("passwd"));
		     salary();
		 } catch (Exception e) {e.printStackTrace();}
		 finally {
			 try {
			if(connection!=null)connection.close();
			 }catch(Exception e) {e.printStackTrace();}
		}
	}

private void salary() {
	try {
		statement=connection.createStatement();
		String sqlS="SELECT jikwonjik,SUM(jikwonpay),AVG(jikwonpay) FROM jikwon WHERE jikwonpay IS NOT NULL AND jikwonjik NOT IN('이사','부장') GROUP BY jikwonjik;";
		resultSet=statement.executeQuery(sqlS);
		System.out.println("직급\t연봉합\t연봉평균");
		while(resultSet.next()) {
			System.out.println(resultSet.getString(1)+"\t"+resultSet.getInt(2)+"\t"+resultSet.getInt(3));
		}
	}catch(Exception e) {e.printStackTrace();}
	
	finally {
		try {
			if(resultSet!=null)resultSet.close();
			if(statement!=null)statement.close();
			if(connection!=null)connection.close();
		}catch(Exception e) {e.printStackTrace();}
	}		
}					
public static void main(String[] args) {new DbEx();}			
}
