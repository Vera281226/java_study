package pack5;

public class Ex49BreadPlate {
	private int breadCount = 0; // 스레드간 공유 자원
	
	public Ex49BreadPlate() {}
	
	synchronized public void makeBread() { // 동기화 메소드
		if(breadCount >= 10) {
			try {
			System.out.println("빵 생산 초과");
			wait(); // 활성화 스레드를 비활성화
			}catch(Exception e) {}
		}
		breadCount++; // 빵 생산
		System.out.println("빵을 만듦. 총 : "+breadCount+"개");
		this.notify(); // 비활성화 스레드를 활성화
	}
	synchronized public void eatBread() { // 동기화 메소드
		try {
		if(breadCount < 1) {
			System.out.println("빵이 없어 기다림");
			wait();
		}}catch(Exception e) {}
		breadCount--; // 빵 소비
		System.out.println("빵을 먹음. 총 : "+breadCount+"개");
		this.notify();
	}
}