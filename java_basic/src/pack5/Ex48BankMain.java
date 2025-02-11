package pack5;

public class Ex48BankMain {
	public static Ex48Bank hanaBank = new Ex48Bank();
	
	public static void main(String[] args) { 
	// 스레드 동기화, 공유 자원에 Lock을 걸어 하나의 스레드가 공유자원을 사용중인 경우 다른 스레드는 사용하지 못하고 대기 상태에 빠뜨린다.
	// synchronized를 이용 (내부적으로 Lock을 걸어줌)
	
		System.out.println("원금 : " + hanaBank.getMoney());

		
		// 공유하지 않음
		Ex48Park park = new Ex48Park();
		park.start();
		
		Ex48ParkWife parkWife = new Ex48ParkWife();
		parkWife.start();
		
	}
}
