package pack4extends;

// 추상 부모 클래스
abstract class Ex18Jepum { // 전자 제품이 공통으로 가져야할 멤버 선언
	public int volume = 0;
	
	public Ex18Jepum() {
		System.out.println("Jepum 추상 클래스 생성자");
	}

	abstract void volumeControl();
	public void volumeShow() {
		System.out.println("소리 크기 : "+volume);
	}
}
