package pack;

public class Test2 {
	public static void main(String[] args) {
		//이 줄만 무시
		/* 여
		 * 러
		 * 줄 무시
		 */
		String irum = "신기해"; //문자열 변수 기억
		System.out.println(irum); //다음 줄 변환후 출력
		System.out.print(irum); //뒤에 바로 출력
		System.out.println();
		
		// 변수 : 값을 저장 하는 메모리 공간 (새로운 값이 덮어씀)
		// 변수명 : 변수에 대한 임의 이름 형식 : 타입 변수명 = 리터럴(문자,숫자 ...)
		// 상수 : 처음 입력값이 유지되는 메모리 공간
		
		// 변수 기본형 타입 : bcbsilfd
		// 기본형 처럼 사용하는 참조형 변수 :String
		
		//byte type
		byte var1; // 1 바이트 정수 -128부터 127까지 기억장소
		var1 = 10; var1 = 5; //5로 덮어쓰기
		System.out.println(var1);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		int var2 = 127;
		System.out.println("var2:" + var2);
		
		System.out.println();
		short var3 = 32700; //2바이트 (-32768 ~ 32767
		System.out.println("var3:" + var3);
		
		System.out.println();
		
		int var4 = 10;
		var4  = 2147483647;
		System.out.println("var4:" + var4);
		
		
		System.out.println("형변환에 대해 ...");
		byte aa = 10;	//자동 형변환(promotion) int 10이 byte 1으로 변환
		aa = (byte)10;  // 강제 형변환 (cast 연상자를 이용해 casting 함)
		
		aa = (byte)200;
		aa = 5;
		int imsi = 7;
		byte bb = 7;
		byte cc = (byte)imsi; //변수 강제변환 인식
		
		System.out.println(cc);
		
		System.out.println("aa:" + aa);
		System.out.println("bb:" + bb);
		
		long var5;
		var5 = 10;
		var5 = 2147483648l;  //long 타입의 데이터
		System.out.println("var5:" + var5);
		
		System.out.println("실수에 대해...");
		float f1 = 3; //실수형 기억장소 (4byte)
		//정수는 실수로 promotion
		f1 = 123.12F; //실수 타입 변환
		System.out.println("f1:" + f1);
		
		double d1 =123; //실수형 기억장소 (8byte) 소수이하 15자리 정밀도 보장
		d1 = 123.12;
		System.out.println("d1:" + d1);
		
		System.out.println();
		int aa1 = (int)3.7; //정수로 강제 변환시 소수점 이하 버림
		System.out.println("aa1:" + aa1);
		
		int aa2 = 12 + (int)10.5; //앞의 것도 실수로 promotion 됨
		aa2 = (int)(12+ 10.5); //실수 연산 후 int 값 기억
		System.out.println("aa2:" + aa2);
		
		double aa3 = 12 + 10.5; //정수 promotion
		System.out.println("aa3:" + aa3);
		
		System.out.println("논리형( boolean 참 또는 거짓 결과)에 대해 ...");
		boolean bu1 = true;
		 bu1 = false; //변수 선언은 한번만. 
		System.out.println("bu1 :" + bu1);
		
		System.out.println("문자형(char, 한개의 문자 기억)에 대해... ");
		char c1 = 'A';
		//c1 = 'bc';
		//c1 = "b";
		System.out.println("c1 :" + c1 + " " + (int)c1 + " " + (char)65); //아스키코드 Ascii 
		
		System.out.println("안녕" + (char)10 +  "반가워"); //(char)10 = Ascii 코드 LF(Line Feed)
		
		int abc = 0x0f; //16진수 숫자를 10진수로 int 형식 저장
		System.out.println("abc : " + abc + " " + Integer.toHexString(15));
		System.out.println("abc : " + abc + " " + Integer.toBinaryString(15));
		int abc2 = 007; //8진수 숫자를 10진수 int 형식 저장
		System.out.println("abc2 : " + abc2);
		
		System.out.println();
		final double PI = 3.14; //final 기억장소 PI에 고정적으로 상수 기억
		// PI = 5.6; final 입력된 상수에 덮어쓰기 불가
		System.out.println("PI : " + PI);
		
		}

}

