package pack;

import java.util.Scanner;

public class Test6ex {
	
	    private static Scanner sc;

	public static void main(String[] args) {
		
		
		sc = new Scanner(System.in);

		double sekum = 0;
		
		//상품명 입력
		
		System.out.print("상품명을 입력해주세요. :");
		
		String sang = sc.nextLine();
		
		//수량을 입력
		
		System.out.print("수량을 입력해주세요. :");
		
		int su = sc.nextInt();
		
		//단가를 입력
		
		System.out.print("단가를 입력해주세요. :");
		
		int dan = sc.nextInt();	
		
		int kum = su*dan;
		
		if(kum >= 50000) {
			sekum = kum*0.1;
		}else if(kum >= 30000){
			sekum = kum*0.05;
		}		
		else {
			sekum = kum*0.03;
		}
		
		
		System.out.println("상품명 " + sang + "은 금액 " + kum + "이고 세금은 " + sekum + "입니다.");
		
	}

}
