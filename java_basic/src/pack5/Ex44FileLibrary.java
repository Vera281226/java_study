package pack5;

//import java.io.BufferedReader;
//import java.io.File;
import java.io.FileReader;
//import java.util.StringTokenizer;

import com.opencsv.CSVReader;

public class Ex44FileLibrary {
	public static void main(String[] args) {
	// data.go.kr이 제공하는 전국 도서관 정보 자료 읽기
	// CSVReader 클래스 사용
	// try(객체를 생성하면 자동으로 close를 해줌){}
		try(FileReader fr = new FileReader("c:/work/전국도서관.csv");
			CSVReader reader = new CSVReader(fr)) {
//			BufferedReader br = new BufferedReader(fr);
//			System.out.println(ss);
			String[] nextLine;
			int count = 0;
//			String ss = br.readLine();

			while((nextLine = reader.readNext()) != null && count <=5) {
				count++;
				if(nextLine.length<5) break;
//				StringTokenizer token = new StringTokenizer(ss, ",");
				String s1 = nextLine[0];
				String s2 = nextLine[1];
				String s3 = nextLine[2];
				String s4 = nextLine[3];
				String s5 = nextLine[4];
				System.out.println(s1+" "+s2+" "+s3+" "+s4+" "+s5);
//				ss = br.readLine();
			}
			System.out.println(count);
//			br.close();
//			reader.close();
		} catch(Exception e) {
			System.out.println("err"+e);
		}
	}
}
