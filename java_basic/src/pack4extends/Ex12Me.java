package pack4extends;

public final class Ex12Me extends Ex12Father { // 클래스 단위에서 final 선언시 상속이 불가 
	public Ex12Me() {
		System.out.println("내 생성자");
	}	
	@Override
	public void say() {
		System.out.println("인생은 아름다워~~~");
	}
	public final void Biking() { // Me의 자식 클래스는 Biking() 메소드의 오버라이드 불가
		System.out.println("자전거로 전국일주");
	}
// super. 명령어는 자신의 부모 클래스만 찾는다. 더 상위 부모 클래스엔 부모클래스에서 찾아놔야한다.
	
}
