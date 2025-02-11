package pack2;

public class Ex2Programmer {
	
	public String nickName; // 초기값이 없으면 참조형이므로 null이 됨
	private int age; //초기값이 없으면 0이 됨 은닉화된 필드(멤버 변수, 전역 변수)
	String spec = "정보처리 자격증"; // 여기까지 멤버필드 있으면 쓰고 없어도 된다.
	
	public static String motto = "자바에 아릅답게 미치자"; // 정적 필드가 됨 (static 영역에 저장됨)
	public final double WEIGHT = 66.78 ; // final 멤버는 값 수정 불가 최종값 대문자로만 써서 표현
	public static final double PI = 3.14; // 정적 필드 이면서 수정이 불가
	
	public Ex2Programmer() {
		//생성자 (내용이 없을시 초기화 할게 없을시에 안적어도 되지만 생성자는 반드시 있어야하므로 컴파일러가 내부에서 생성자를 자동으로 생성한다
		System.out.println("난 생성자야. 객체 생성시 1회만 호출 가능");
		int number = 20; //지역 변수(메소드 내에서 선언한 지역변수는 메소드 내에서만 유효)
		age = number + 5;
		nickName = "에러잡는 귀신";
	}
	
	public void displayData() {
		System.out.println("---");
		String mySpec = reponseSpec();
		System.out.println(mySpec);	
		System.out.println("별명 : "+nickName+", 나이는 "+age);
		System.out.println("---");
	}
	
	private String reponseSpec() {
		return "내가 가진 기술은 " + spec;
	}
	
		// private 멤버 외부에서 제어하기 위한 public 메소드 작성
		public int getAge() { // 메소드 이름은 약속, get 멤버변수(첫글자는 대문자) << getter 라고 부름
			return age; // age 변수 자체를 반환하는것이 아니라 age 에 기억된 정수를 반환받음
		}
		
		public void setAge(int age) { //getter setter 를 이용해 private으로 메소드에 캡슐화된 변수를 제어하는 메소드 < 캡슐화
			this.age = age; // 현재 클래스 멤버인 것과 메소드 입력 age 값의 구분 클래스 내에서 구분하기 위한 this.
		}
		
		public void setAgex(int age, int password) {
			if(password == 123) {
				this.age = age;
				System.out.println("age 수정 성공");
			}else {
				System.out.println("비밀번호가 틀리므로 age를 수정 불가.");
			}
		}
}
