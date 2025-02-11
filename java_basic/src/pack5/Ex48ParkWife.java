package pack5;

public class Ex48ParkWife extends Thread{ // 은행 사용 클래스
	public void run() {
		Ex48BankMain.hanaBank.minusMoney(3000);
		System.out.println("박씨 아내 출금 후 잔고 확인 : "+Ex48BankMain.hanaBank.getMoney());
	}
}
