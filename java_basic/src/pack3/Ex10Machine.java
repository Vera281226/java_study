package pack3;

import java.util.Scanner;

public class Ex10Machine {
	
	public int cupCount;
	
	Ex10CoinIn coinIn = new Ex10CoinIn();

	private Scanner sc;
	
	//주 기능 메소드(동전 값과 커피 잔 수를 입력받아 돈이 부족한지 확인한 후 커피잔과 잔돈 출력)
	public void showData() {
		sc = new Scanner(System.in);
		System.out.print("동전을 입력하세요 :");
		coinIn.coin = sc.nextInt(); 
		System.out.print("몇 잔을 원하세요 :");
		cupCount = sc.nextInt();
		if(coinIn.coin < coinIn.price) System.out.println("돈이 부족합니다");
		else System.out.println("\n커피 "+cupCount+"잔과 잔돈 "+coinIn.calc(coinIn.coin, cupCount)+"원");
	}
}
