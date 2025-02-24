package pack3lambda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.function.Consumer;

public class Mylambda5db {
	
	public Mylambda5db() {
		try {Class.forName("org.mariadb.jdbc.Driver");}catch(Exception e) {System.out.println("로딩 실패");}
		System.out.println("처리1");
		String sql = "SELECT*FROM sangdata";
		queryDb(sql, resultset -> {System.out.println("처리3");
			try {
				while(resultset.next()) {
					System.out.println(resultset.getString("code")+"\t"+resultset.getString("sang")+"\t"+resultset.getString("su")+"\t"+resultset.getString("dan"));
				}
			}catch(Exception e) {}
		});
	}
	
	private void queryDb(String sql, Consumer<ResultSet> consumer) {
		// try - with - resources 문법을 사용해 try문에 매개변수 적용 
		try(Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test","root","123");	
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultset = statement.executeQuery();) // try 매개변수로 줄경우 자동으로 close 됨
			{System.out.println("처리2");
			consumer.accept(resultset);
			System.out.println("처리4");
			} catch(Exception e) {}
	}
	
	public static void main(String[] args) {new Mylambda5db();}
}
