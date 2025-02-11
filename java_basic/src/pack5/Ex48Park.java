package pack5;

public class Ex48Park extends Thread{ // 은행 사용 클래스
	public void run() {
		Ex48BankMain.hanaBank.saveMoney(5000);
		System.out.println("남편 예금 후 잔고 확인 : "+Ex48BankMain.hanaBank.getMoney());
	}
}
