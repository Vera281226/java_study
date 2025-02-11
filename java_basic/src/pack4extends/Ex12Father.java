package pack4extends;

public class Ex12Father extends Ex12GrandFa{ //private 제외 모두 상속받음
	// 생성자 내용이 없을 시 부모 클래스의 기본 생성자를 자식 클래스의 기본 생성자로 사용함
	// 클래스간 결합도가 매우 높다. 코드 수정의 영향을 많이 받음.
	private final int nai = 50; //변수의 final 선언은 상관없음
	public String gabo = "청자 비슷한 물병"; // 부모의 변수보다 자식의 변수가 우선됨 
	private int house = 1;
	
	public Ex12Father() {
		super(); // 자식 생성자 내에 부모 생성자 호출 따로 부르지 않아도 기본 부모 생성자 수행
		System.out.println("아버지 생성자");
	}
	@Override // annotation @적힌것과 다르게 기능할 경우 오류를 띄워버림 
	public int getNai() { // 메소드 오버라이딩 부모와 같은 메소드를 만듬 내용을 다르게하기 위함 지역 변수 사용을 위함
		//부모와 다른 코드를 적을 수 있다.
		return nai;
	}
	@Override
		public void say() { //부모 클래스 메소드에서 final 사용 할 경우 자식 클래스에서 오버라이드 불가
		String ss = "아버지 말씀 : 풀스택 개발자로 고~";
		System.out.println(ss);
		}
	public int getHouse() {
		return house;
	}
	
	public void showData() {
		String gabo = "맥북";
		System.out.println(gabo); // 메소드 지역 변수에서 먼저 찾음 
		System.out.println(this.gabo); // 객체 클래스의 필드에서 먼저 찾음
		System.out.println(super.gabo); // 부모 클래스의 필드에서 먼저 찾음
		
		say();
		this.say();
		super.say();
	}
}
