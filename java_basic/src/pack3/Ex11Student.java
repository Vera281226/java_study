package pack3;

public class Ex11Student {
	private String name; // 이 Student 클래스 내에서만 쓰일 변수이므로 private 사용
	// String 클래스이므로 이 또한 포함관계에 해당한다.
	//private Ex11Book book = new Ex11Book(name,name); // 생성자를 
	private Ex11Book book; // Book 클래스와 포함 관계
	
	public Ex11Student(String name,Ex11Book book) {
		this(); // 생성자는 다른 생성자를 호출할 수 있다. 생성자내 생성자 호출 명령은 무조건 먼저 적어 줘야한다. 
		this.name=name; // 동일 이름 변수의 구별을 위한 this
		this.book=book;
	}
	
	public Ex11Student() {
		System.out.println("나는 생성자");		
	}
	public void showStudentDetail() { // 학생 정보 출력
		System.out.println("학생 이름은 "+name);
		System.out.println("소유한 책은 "+book.getBookInfo());
	}
}
