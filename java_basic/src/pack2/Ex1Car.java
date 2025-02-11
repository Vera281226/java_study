package pack2;

// 클래스 형식 : [접근지정자]<-(없거나 public만있음) class 클래스 명 
public class Ex1Car { //Car 객체(Object)를 생산하기 위한 설계도 : 클래스
	// 새로운 타입(type, 형)을 만들기 위함
	// field(필드, 속성)과 method(메소드, 행위)를 멤버로 가질 수 있다. 없을 수도 있다.
	// 동일한 필드와 메소드를 수행하는 객체의 집합을 설계
	
	int wheel; // 멤버 필드(전역 변수) 형식은 [접근지정자]<-(없거나 public,private 가 있다. 없으면 같은 패키지내에서 호출가능.) type 필드명
	private int airBag = 1; //현재 클래스 파일에서만 호출 가능 캡슐화: 멤버 접근지정자가 private인 경우 
	//private int speed;		//값을 따로 지정해주지 않는 변수는 무조건 초기값을 가진다.	
	public String irum;		//다른 패키지에 있어도 어디서나 호출 가능
	
	public Ex1Car() { // 특별한 메소드(클래스와 메소드명이 일치) ==> 생성자(counstructor)
		System.out.println("객체 생성시 생성자가 가장 먼저 수행 : 초기화를 담당");
		wheel = 4;
		irum = "그랜져";
	}
	private void abc() { //멤버 메소드 형식은 [접근지정자] 반환형 메소드명(매개변수){}	()있으면 멤버 메소드 메소드는 소문자로 시작해야함
	System.out.println("abc 메소드 실행");
	}
	
	void def() { //메소드 수행 후 반환값이 없이 돌아갈 경우 void가 된다.
		System.out.println("def 메소드 실행");
		System.out.println("바퀴 수는 "+wheel);
		System.out.println("에어백 수는 "+airBag); //private 필드이나 같은 클래스 내에서 호출
		abc(); //private 메소드 같은 클래스 내에서 호출 
	}
	
	public String driving() { //메소드 수행 후 String 타입의 반환값이 있는 경우
		System.out.println("운전하기");
		return "현재 고속도로를 달리는 중"; //메소드 수행 후 값을 반환할 경우 return문을 사용
	}
	public int drivingStop() { //메소드 수행 후 int 타입의 반환값이 있는 경우, 띄어쓰기 하는 부분에서 대문자로 띄어쓰기를 구별하는 낙타표기법
		System.out.println("운전 멈추기");
		return 0;  //return 반환 타입;
	}
	
	//변수의 값을 저장하는 방법은 두가지, 1.변수=값 2.매개변수를 이용 메소드명(타입 매개변수){...} 하고 메소드명(값)으로 호출
	public void drivingGood(int w) { //매개변수가 있는 메소드 매개변수를 주면서 호출해야한다.
		wheel = w;
		System.out.println(wheel + "개의 바퀴를 가진 이동 수단 사용");
	}
	
}
