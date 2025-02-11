package pack5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Ex38File {
public static void main(String[] args) throws Exception{
	// 1 바이트 단위의 입출력
	// 한글 등의 2바이트 문자는 입력 불가
	// System.in = 입력 System.out = 출력
	System.out.println("1바이트 입력 : ");
	int a = System.in.read(); // Unhandled exception type IOException 예외처리 강요 오류
	System.out.println("a : "+a+" "+(char)a);
	
	System.out.println("\n문자열 출력");
	OutputStreamWriter os = new OutputStreamWriter(System.out);
	//	byte b = 97;
	//	os.write(b);
	//	os.flush(); // 메모리 청소
	
	// 버퍼를 사용(파일 입출력(i/o) 성능을 향상, 처리 속도가 빨라짐)
	BufferedWriter bw = new BufferedWriter(os, 1024); // 입출력은 기본이 1024byte(1Kb) 단위로 처리됨
	PrintWriter out = new PrintWriter(bw);
	out.println(123);
	out.close(); // 자원 해제(메모리를 반납, 가비지 컬렉터의 대상이됨)
	bw.close(); 
	
	System.out.println("파일 단위의 출력"); // 위에서 out.close를 해서 출력이 닫힘
	File f = new File("C:/work/iotest.txt");
	FileWriter fw = new FileWriter(f);
	BufferedWriter bw1 = new BufferedWriter(fw);
	PrintWriter out1 = new PrintWriter(bw1); // 출력 개체 생성
	out1.println(1234);
	out1.println("문자열이 파일로 출력됨");
	out1.println("본인 차례가 되었는데 가방 구석까지 미친 듯이 여권과 탑승권을 찾고 있다면, 뒷사람 뿐만아니라 공항 보안 직원이 짜증나게 할지도 모른다. "
				+ "본인의 차례전 미리 손에 준비하고 있자. "); // 위 f의 경로로 생성된 파일에 입력됨
	out1.close();
	bw1.close();
	fw.close();
	
	}
}
