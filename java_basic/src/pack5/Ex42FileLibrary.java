package pack5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Ex42FileLibrary {
	public static void main(String[] args) {
	// data.go.kr이 제공하는 전국 도서관 정보 자료 읽기
		try {
			File f = new File("c:/work/전국도서관.csv");
			FileReader reader = new FileReader(f);
			BufferedReader br = new BufferedReader(reader);
			
//			System.out.println(ss);
			int count = -1;
			String ss = br.readLine();

			while(true) {
				if(ss == null || count >= 5) break;
				StringTokenizer token = new StringTokenizer(ss, ",");
				String s1 = token.nextToken();
				String s2 = token.nextToken();
				String s3 = token.nextToken();
				String s4 = token.nextToken();
				String s5 = token.nextToken();
				System.out.println(s1+" "+s2+" "+s3+" "+s4+" "+s5);
				ss = br.readLine();
				count++;
			}
			System.out.println(count);
			br.close();
			reader.close();
		} catch(Exception e) {
			System.out.println("err"+e);
		}
	}
}
