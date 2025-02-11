package pack2;

//매개변수로 기본형 뿐만 아니라 참조형도 가능

class Person{ // 일반적으로 따로 class 파일을 작성해야 하지만 편의상 현재 클래스와 같은 곳에 적음
	String name;
	int age;
	
	public Person(String name, int age){ // 참조형,기본형 변수 
		this.name = name;
		this.age = age;
	}	
}

class PersonService {
	public PersonService() {
		
	}
	public void changeName(Person person, String newName) { 
		// String "이름" 객체의 주소를 주듯 생성한 객체의 주소를 입력 하는 것
		person.name = newName;
	}
}

public class Ex7Para {
	
	
	
	public static void main(String[] args) {
		
		Person person = new Person("한국인", 22);
		System.out.println("변경 전 이름 : "+person.name);
		System.out.println("변수 기억 주소 : "+person);
		Person james;
		james = person;
		System.out.println("변수 기억 주소 : "+person+" "+james);
	
		
		PersonService service = new PersonService();
		service.changeName(person, "신나는");
		System.out.println("변경 후 이름 : "+person.name +" "+person);
		
		
	}

}
