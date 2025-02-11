package pack2;

public class Ex1Main {// Ex1Main은 main 메소드를 실행하기 위한 클래스임

	public static void main(String[] args) {
		// main은 응용 프로그램의 시작을 위해 정해진 메소드이다.
		// Ex1Car 설계도로 객체를 생성. 이런 과정을 객체를 인스턴스한다 라고함
		// Ex1Car.class를 주기억장치로 읽은 후 car1 객체변수를 선언
		// new 키워드로 인스턴스를 진행. 이 때 Ex1Car()이라는 생성자를 호출
		Ex1Car car1 = new Ex1Car();
		// Ex1Car 전역변수들 호출하기
		//car1.; //개체변수.멤버(필드,메소드()) 기본형 변수와는 다른 참조형 변수 가비지 컬렉터에 의해 사라짐
		System.out.println(car1.wheel);		//접근자가 delault 이므로 호출 가능
		//System.out.println(car1.airBag);		// private 멤버이이므로 호출 불가
		System.out.println(car1.irum); //스택에 irum 변수가 저장되고 car1 개체의 irum의 heap에 저장된 값을 불러와 출력된다.
		
		System.out.println();
		//Ex1Car 멤버 메소드 호출
		//car1.abc(); // private 메소드는 호출 불가
		car1.def();
		
		System.out.println();
		String ss = car1.driving(); //driving을 호출하면서 수행하고 지역변수 ss에 반환값을 저장
		ss = "와우 " +ss; // 추가적인 명령으로 여러가지 작업을 수행 가능하다.
		System.out.println(ss); //driving() 메소드의 반환값 출력
		
		System.out.println(car1.driving()); //메소드를 단순 호출 후 1회만 수행 후 출력만 하는것 확인용 
		System.out.println();
		car1.drivingGood(2); // 매개변수를 주면서 메소드 호출
		System.out.println(car1.wheel);
		
		System.out.println();
		Ex1Car car2 = new Ex1Car(); //새로운 객체 생성, car2는 car1과 타입이 같은 두개의 객체변수
		System.out.println(car2.wheel);
		car2.def();
		
		//클래스를 공부하는 이유 - 직접 객체를 생성 후 사용하기 위해, 다른 사람이 만든 클래스를 활용하기 위해
		
	}

}
