package pack4extends;

public class Ex16DogMain {

	public static void main(String[] args) {
		Ex16Dog dog = new Ex16Dog("개");
		dog.print();
		System.out.println(dog.callName());
		
		System.out.println();
		Ex16HouseDog houseDog = new Ex16HouseDog("집 개");
		houseDog.print();
		System.out.println(houseDog.callName());
		
		System.out.println();
		Ex16WolfDog wolfDog = new Ex16WolfDog("늑대 개");
		wolfDog.print();
		System.out.println(wolfDog.callName());
		wolfDog.print();

		Ex16WolfDog bushDog = wolfDog; // 타입이 같은 경우 치환
		wolfDog.print(); 
		bushDog.print();
		
		Ex16Dog dog2 = wolfDog; // 타입은 다르지만 주소를 치환함 - 자식의 주소를 부모 객체변수에 주는 경우
		// promotion
		dog2.print(); // 다형성의 시작 동일한 명령문의 출력이 다르게 찍힘?
		// 부모객체 변수의 이름으로 자식의 오버라이드된 메소드만을 부를 수 있음 자바의 규칙임
		// 자식 고유 메소드는 부모 이름으로 부르지 못함
		Ex16WolfDog hidog = (Ex16WolfDog) dog2; // casting
		hidog.print();
		
		System.out.println("-----------");
		Ex16Dog coyote = new Ex16Dog("코요테");
		coyote.print();
		System.out.println(coyote.callName());
		Ex16WolfDog wolfDog2 = new Ex16WolfDog("늑대2");
		wolfDog2.print();
		wolfDog2.show();
		
		coyote = wolfDog2;
		
		coyote.print();
		//cotoye.show():
		Ex16WolfDog wolfDog3 = null;
		wolfDog3=wolfDog2;
		//wolfDog3=houseDog; 
		//wolfDog3=coyote; //타입이 달라 치환 실패. 부모타입 coyote변수가 자식의 주소 기억중
		wolfDog3 = (Ex16WolfDog)coyote; //casting 치환 다른 타입의 자식은 아예 불가능함
		wolfDog3.print();
	}
}
