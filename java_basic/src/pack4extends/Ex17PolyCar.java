package pack4extends;

// 상위 클래스
public class Ex17PolyCar { // 모든 자동차들이 가져야할 멤버 선언
	protected int speed = 100; //필드 선언
	
	public Ex17PolyCar() { //생성자 
		System.out.println("\n나는 자동차 원형 클래스야");
	}
	
	public void dispData() { //메소드 선언
		System.out.println("속도 : "+speed);
	}
	
	public int getSpeed() {
		return speed;
	}
}
