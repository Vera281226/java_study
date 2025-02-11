package pack;

public class Test8for {

	public static void main(String[] args) {
		System.out.println("뭔가를 하다가 ... 반복문 만나기");
		// 반복문 for
		
		
		
		int a;
		int hap = 0;  // 누적 변수명
		
		for(a = 1; a <= 5; a++ ) { // for (변수 초기화; 조건; 반복내용 수행 후증감;) {반복내용} 
								   // 블록안에서 선언시 a는 지역 변수 블록 밖에서 변수 선언으로 따로 사용 가능
			
			System.out.print(a + "\t");
		
			// 반복문 내에서 for문에 사용중인 변수는 갱신 비권장
			
			hap = hap + a;
					
		}
		
		System.out.println("\nfor 탈출" + a); // 블록 밖에서 선언된 변수를 반복문에서 사용 후 계산된 값
		System.out.println("합은" + hap);
		
		for(int i = 65; i <= 90; i++) {
			System.out.print((char)i + " ");
		}
		System.out.println("\nfor 탈출2");
		System.out.println();
		
		for(int i = 'A'; i <= 'Z'; i++) {
			System.out.print( i + " ");
		}
		
		System.out.println("\nfor 탈출3");
		
		System.out.println();
		
		for(int i = 10; i > 1; i -= 2) {
			System.out.print(i + " ");			
		}
		
		System.out.println("\nfor 탈출4");

		System.out.println();
		
		for(int ytn=0, tvn=5; ytn <= 5; ytn++, tvn++) {
			System.out.print(ytn + "," + tvn + " ");
		}
		
		System.out.println("\nfor 탈출5");
		
		System.out.println();
		int aa =1;
		for(; aa <= 5; aa++) { // 이렇게도 가능하다.
			System.out.print(aa + " ");
		}
		System.out.println("\nfor 탈출6");
		System.out.println();
		
		for(int sbs = 1; sbs <= 10; sbs++) { 
			if(sbs % 2 == 0) {
			System.out.print(sbs + " ");
			}
			
			if(sbs == 6) break; // 반복문 무조건 탈출
			
		}
		System.out.println("\nfor 탈출7");
		System.out.println();
		
		//다중 for문
		
		for(int m=1; m <= 3; m++) {
			System.out.println("m:" + m);
			for(int n=1; n <= 4; n++)
				System.out.print("n=" + n + " ");
			System.out.println();
		}
		
		System.out.println("\nfor 탈출8");
		System.out.println();
		
		for(char i = 65; i <= 90; i++) {
			System.out.print(i + " : ");
			for(char j = i; j <= 'Z'; j++) { // 블록 내의 추가 블록에선 내부 변수 공유
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("문제");
		// 문1) 구구단 3단 출력
		
		for(int dan = 1; dan <= 9; dan++) {
			System.out.println("3*" + dan + " = " + 3*dan);
		}
		
		// 문2) : 2~9단까지 출력
		// 2*1=2 2*2=4 ... 2*9=18
		// ...
		// 9*1=9 9*2=18 ... 9*9=81
		
		System.out.println();
		
		for(int i = 2; i <= 9; i ++) {
		for(int dan = 1; dan <= 9; dan ++) {
			System.out.print(i + "*" + dan + "=" + i*dan + " ");
		}
		System.out.println();
	}
		
		
		System.out.println();
		

		// 문3) : 1 ~ 100 사이의 정수 중 3의 배수이면서 5의 배수를 출력하고, 건수와 그들의 총 합을 출력
		
		int sum = 0;
		int count = 0;
		
		for(int i = 1; i <= 100; i++) {

			if(i % 3 == 0 && i % 5 == 0) {
				
				System.out.print(i + " ");
				
				count ++;
				sum = sum + i;
				

			}
			
		}
		
		
		System.out.println();
		System.out.print("건수는 : " + count);
		System.out.println(" 총합은 : " + sum);
		
		System.out.println("countinue, break");
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
	}
}
