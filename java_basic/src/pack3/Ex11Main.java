package pack3;

public class Ex11Main {

	public static void main(String[] args) {
		// Book 객체 생성
		Ex11Book mybook = new Ex11Book("자바 클래스 활용", "박치기");
		// student 객체 생성
		Ex11Student tom = new Ex11Student("톰", mybook);
		// 생성한 객체를 이용한 Student 클래스 메소드 사용
		tom.showStudentDetail(); 
	}

}
