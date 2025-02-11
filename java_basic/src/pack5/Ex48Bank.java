package pack5;

public class Ex48Bank {
	private int money = 10000;
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
//	public void saveMoney(int mon) { // 입금
	synchronized public void saveMoney(int mon) { 
		// synchronized 적용 메소드 내의 멤버 필드는 스레드에서 공유하게됨
		// 어떤 스레드가 멤버필드 money를 사용하는 동안 락이 걸림
		// 수행중인 메소드 수행이 끝나면 락이 풀림
		int m = this.getMoney();
		try {
//			Thread.sleep(2000); // 입금 지연시간 2초
		} catch (Exception e) {}
		this.setMoney(m+mon);
	}
	
	synchronized public void minusMoney(int mon) { // 출금
		int m = this.getMoney();
		try {
//			Thread.sleep(3000); // 입금 지연시간 2초
		} catch (Exception e) {}
		this.setMoney(m-mon);
	}
	
}
