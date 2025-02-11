package pack4extends;

public class Ex13Student{ // 모든 클래스는 Object 클래스를 상속받는다.
	public String name;
	public Ex13Student() {
		name = "tom";
	}
	
	@Override
		public String toString() { // Object 부모클래스의 toString 오버라이드
		System.out.println("원래 의미 싫어 바꿀거야");
		return "이 클래스의 사용자는 " + name;
		}
	
	public static void main(String[] args) {
		Ex13Student student = new Ex13Student();
		System.out.println(student);
		System.out.println(student.toString());
	}
}
