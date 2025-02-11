package pack;

public class Test3 {
	public static void main(String[] args) { //main 입력 후 ctrl + space로 입력 시간 단축

		
		//산술 연산자
		int a = 5;		// 변수에 =(대입연산자)로 5를 기억시킴
		int b = 3;		
		int c = a+b;
		
		System.out.println(c); //syso 입력 후 ctrl + space로 입력 시간 단축
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); //정수 끼리 나누어 정수 몫만 남음
		System.out.println(a%b);
		System.out.println(a/(double)b); //나누는 변수 중 하나를 double로 변환시켜 소수점 이하 자리까지 계산한 걸 표현함 어느 쪽을 변환시켜도 됨
		
		System.out.println();
		
		//System.out.println(a/0); // 실행 오류 runtime error (문법은 맞지만 출력이 실패함) 주석 제거 후 실행 시 여기서 실행을 멈춤 
		System.out.println(a/0.0); //Infinity 출력됨
		System.out.println(a%0.0); //NaN(Not a number) 나머지가 숫자가 아니라서 슷지로 표현 될 수 업음:
		
		System.out.println("산술 연산자 우선순위");
		System.out.println(3 + 4 * 5);
		System.out.println((3 + 4) * 5); //곱하기 나누기는 동급 왼쪽부터 차례대로 계산
		
		System.out.println("문자열 더하기");
		String ss1 = "대한"; //String은 기본형은 아니지만 기본형 처럼 쓸 수 있다.
		String ss2 = "민국"; 
		
		System.out.println(ss1+ss2);
		
		System.out.println(ss2 + " " + 2025); //정수를 문자열로 자동 변환 후 문자열 더하기
		System.out.println(ss2 + " " + (2000 + 25)); //문자열끼리 전부 더해짐
		
		String ss3 = "5" + 6;
		System.out.println("ss3 : " + ss3);
		System.out.println("5" + 6);
		System.out.println(5 + 6);
		System.out.println(Integer.toString(5) + 6); //숫자 문자열 변환
		System.out.println(Integer.parseInt("5") + 6); //문자열 숫자 변환
		
		System.out.println("누적");
		int no = 1;
		no = no +1; 
		no += 1;    
		no++;
		++no; //모든 줄이 해당 변수 값에 1씩 더하는 연산 표현. 후위 ++는 연산 후 변수 값이 증가 전위 ++는 연산 전 값이 증가 후 연산
		
		System.out.println("no : " + no);
		
		
		int imsi = 5;
		int result = ++imsi +1;
		System.out.println("imsi : " + imsi); //alt 누르는 도중 화살표 키로 위 아래 행 이동 가능
		System.out.println("result : " + result);
		

		int imsi2 = 5;
		int result2 = imsi2++ +1;
		System.out.println("imsi2 : " + imsi2); 
		System.out.println("result2 : " + result2); //증감 연산자는 독립적으로 사용하는게 좋다.
		
		System.out.println("부호에 대해");
		int imsi3 = -7;
		System.out.println("imsi3 : " + imsi3);
		System.out.println("imsi3 : " + -imsi3); // --는 증감연산자다.
		System.out.println("imsi3 : " + (-1 * imsi3));
		
		int imsi4 = -1*imsi3;
		System.out.println("imsi4 : " + imsi4);
		
		
		
		System.out.println("\n여기까지가 산술연산자 및 기타\n연습 끝"); //출력시 간단하게 줄바꿈 \n
		
		
		
	}

}
