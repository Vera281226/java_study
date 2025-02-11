package pack4extends;

public class Ex29Gildong {
	public Ex29Saram getSaram() {
		//return new Ex29Saram();
		return new Ex29Saram()
		{ // 내부 익명 클래스 조건 - 
			public String getIrum() { // 상위 클래스의 메소드를 오버라이딩하며 마지막에 ;으로 마무리
				String ir = "홍길동";
				return ir;
			}
		};
	}
}
