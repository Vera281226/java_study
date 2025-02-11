package pack;

import java.util.Scanner;

public class Test5 {

	private static Scanner sc;

	public static void main(String[] args) {
		
		// 논리 연산자 처리할 때 주의할 점
		System.out.println("출발");
		//aa(); // aa 묶음을 호출 반환값이 void 일 때

		boolean bbb = aa(); //반환값이 boolean 일 때
		System.out.println(bbb);
		System.out.println("계속");
		
		System.out.println("\n논리연산자 처리할 때 주의할 점 ------");
		
		boolean a = false,b = true,c ;
		c = a || b;
		System.out.println("c는 " + c);
		c = a && b;
		System.out.println("c는 " + c); // c가 true값을 찾으려함 false 결과시 true가 a와 b가 false return 값임. 
		
		System.out.println("*************");
		
		c = abc() || def(); //abc만 부르고 수행, def는 수행하지않음 or 에선 첫번째에서 수행 될 시 두번째는 수행되지않음.
		System.out.println("묶음 수행 후 c는(or) " + c);
		
		c = def() || abc(); //def에서 불러오고 수행 후 false return 후에 abc 부르고 수행 true return 수행 후 c = true 출력 됨. 
		System.out.println("묶음 수행 후 c는(or) " + c);
		
		System.out.println("~~~~~~~~~~~~~");
		c = abc() && def(); // abc가 true 일시 def를 부름 둘 다 불러와 수행함
		System.out.println("묶음 수행 후 c는(or) " + c);
		c = def() && abc(); // def가 false 일때 abc를 부르지않고 수행 종료
		System.out.println("묶음 수행 후 c는(or) " + c);
		
		System.out.println("~~~~~~~~~~~~~"); // | & 한개 사용시 먼저 수행값이 만족 되어도 이후 값도 불러오고 모두 수행후 c 값 출력
		
		c = abc() | def();
		System.out.println("묶음 수행 후 c는(or) " + c);
		c = def() | abc();
		System.out.println("묶음 수행 후 c는(or) " + c);
		
		c = abc() & def();
		System.out.println("묶음 수행 후 c는(or) " + c);
		c = def() & abc();
		System.out.println("묶음 수행 후 c는(or) " + c);
		
		System.out.println("\n\n좀 다른 얘기를 실습 : 키보드 (표준 입력 장치)로 값 받기");
		inputTest();
		
		// 그냥 시작부터 false 값을 빠르게 찾게 만들수는 없나?
		
		System.out.println("\n끝");
		
	}
	    //public static void aa() { // 독립적(반복적)으로 실행된 코드를 별도로 작성 (메소드)
		public static boolean aa() { // aa 처리 후 돌아갈때 boolean 값을 자기고감.반환값
		
		System.out.println("아자");
		//System.out.println("아자2");
		return true;
		
	}

		public static boolean abc() {
	System.out.println("abc 출력");
	return true;
}

		public static boolean def() {
	System.out.println("def 출력");
	return false;
}

		public static void inputTest() {
			String ir = "손오공"; 
			int nai = 22;
			System.out.println(ir + "님의 나이는" + nai);
	
			System.out.println();
			sc = new Scanner(System.in);
			
			System.out.print("이름 입력 :");
			String name = sc.next();
			System.out.print("나이 입력 :");
			int age = sc.nextInt();
			System.out.println(name + "씨의 나이는" + age); 
}

}
