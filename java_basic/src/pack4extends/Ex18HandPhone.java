package pack4extends;

public class Ex18HandPhone extends Ex18Jepum {
	@Override
	void volumeControl() {
		// 강요된 오버라이드	
		System.out.println("핸드폰 제품 볼륨 변경");
	}
	
	@Override
	public void volumeShow() {
		// 부모의 일반 메소드는 오버라이드 선택적
		volume = 10;
		System.out.println("볼륨 크기 : "+volume);
	}

}
