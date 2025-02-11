package pack2;

// package : 성격이 비슷한 클래스들을 특정 패키지(폴더)에 저장해 두고 import를 이용해 클래스의 멤버를 호출
public class Ex5Bank {
	
	private int money = 1000;
	int imsi = 111;
	public int imsi2  = 222;
	
	public Ex5Bank() {
	}
	
	public Ex5Bank(int money) { 
		this.money += money; //누적
	}
	
	public void dePosit (int amount) {
		if(amount > 0) money += amount;
	}
	public void withdraw(int amount) {
		if((amount > 0) && (money - amount > 0)) {
			this.money -= amount;
		}else {
			System.out.println("잔고 부족");
		}
	}
	public int getMoney() { 
		return money;
	}
		
	
	}


