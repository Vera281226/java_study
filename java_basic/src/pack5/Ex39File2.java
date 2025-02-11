package pack5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Ex39File2 {
public static void main(String[] args) throws Exception{
	Scanner scanner = new Scanner(System.in);
	System.out.println("나이 : ");
	int nai = scanner.nextInt();
	System.out.println("나이는 : "+nai+"살"); // 기초로 사용했던 입력방식
	
	System.out.println("파일 단위의 입력(읽기)");
	File f = new File("C:/work/iotest2.txt");
	FileReader fr = new FileReader(f);
	BufferedReader br1 = new BufferedReader(fr);
	
	while(true) { // 파일의 끝을 만날 때까지 반복
		String str = br1.readLine(); 
		if(str == null) break;
		System.out.println(str);
	}
	br1.close();
	fr.close();
	scanner.close();
	}
// 파일은 규격화된 데이터를 처리하기엔 어렵다.
}
