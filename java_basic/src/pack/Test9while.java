package pack;

import java.util.Scanner;

public class Test9while {

	private static Scanner sc;

	public static void main(String[] args) {
		//반복문 while : while(조건){반복 처리 대상}
		
		int w = 1;
		
		while (w <= 5) {
			System.out.print("w = " + w +" ");
			w += 1; // 조건이 거짓이 되는 명령문 필수
			
		}
		System.out.println("\n탈출 후 w = " + w);
		
		System.out.println();
		
		int count = 0;
		while(count < 10) {
			count++;
		System.out.println("count : " +count);
		if (count == 10) {
			System.out.println("반복문 종료 count : " + count);
		}
	}
		System.out.println(); // 다중 while
		int a = 1;
		while (a<=3) {
			System.out.println("\na:"+a);
			int b = 1;
			while(b <= 4) {
				System.out.print("b:"+b+" ");
				b++;
			}
			a++;
		}
		
		System.out.println(); // do while
		
		int m = 0;
		do {
			System.out.println("do while의 m:"+m);
			m++;
		}while(m<=5); //do while에선 조건이 거짓이여도 최소 한번은 실행해봄
		
		System.out.println(); // continue, break
		
		int x = 0;
		while(x <= 10) {
			x=x+1;
			if(x == 3) continue;
			if(x == 7) break;
			System.out.println("x:"+x);
			
		}
		System.out.println("무한 루프(looping");
		int y = 1;
		while(true) { // 조건에 true를 넣어버림
			System.out.println("y:"+y);
			y++;
			if( y==5 ) break;
		}
		
		System.out.println("1~10사이 정수 중 짝수만 출력하고 그 갯수도 출력");
		
		int num =1, counter =0;
		
		while(num <= 10) {
			
			if(num%2==0) {
				System.out.print(num+" ");
				counter++;
			}
			num++;
		}
		System.out.println("\n짝수의 갯수는 = " +counter);
		
		
		// System.exit(0); //현재 실행중인 프로그램을 이 아래 실행하지않고 무조건 중지
		
		//키보드로 정수를 입력받고 그 수까지의	1부터 그 수까지의 합 출력 조건 : 위 작업을 계속 반복할지 여부를 묻고 탈출 결정

		
		sc = new Scanner(System.in);

		while(true) { // 무한 반복(break를 만날때까지)
		
			
			System.out.print("양의 정수를 입력:");
			int input = sc.nextInt();
			System.out.println(input);
			
			if(input <= 1) {
				System.out.println("2 이상의 정수를 입력하세요.");
				break;
			}
			int n=1, total = 0;
			while(n <= input) {
				total += n;
				n++;
			}
			
			System.out.print("1부터 입력 받은 수의 합 = " +total);
			
			System.out.print("\n계속할까요?(1/0)?");
			int imsi = sc.nextInt();
			
			if(imsi != 1) {
				System.out.println("\n작업 종료");
				break;				
			}
		}
		
		//sc.close(); // 사용 중인 자원 해제
		
		}
	
}
