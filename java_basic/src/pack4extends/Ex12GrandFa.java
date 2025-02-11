package pack4extends;

public class Ex12GrandFa {
	private int nai = 70;
	public String gabo = "상감청자";
	protected String gahun = "차카게 살자"; 
	// protected - 패키지가 달라도 상속된 클래스가 사용가능한 접근 제한자, 사용시 자식 클래스를 사용한다는 것과 같다.
	
	public Ex12GrandFa() {
		System.out.println("할아버지 생성자");
	}
	public Ex12GrandFa(int nai) {
		this();
		this.nai = nai;
	}
	
	public void say() {
		System.out.println("할아버지 말씀 : 자바에 집중해라");
	}
	public void eat() {
		System.out.println("밥은 맛있게...");
	}
	public int getNai() {
		return nai;
	}
}
