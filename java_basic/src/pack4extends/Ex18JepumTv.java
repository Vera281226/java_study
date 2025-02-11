package pack4extends;

public class Ex18JepumTv extends Ex18Jepum {
	public Ex18JepumTv() {
		System.out.println("TV 생성자");
	}
	@Override
	void volumeControl() {
		// 강요된 오버라이드	
		System.out.println("TV 소리 조절");
	}
}
