package pack2;

public class Ex0InfoInput {
	

//생성자 오버로드로 출력
/*
public Ex0InfoInput() {
System.out.println("이름과 나이가 모두 없습니다.");
}
public Ex0InfoInput(String name) {
System.out.println("이름은 "+name+", 나이는 알수없습니다.");
}
public Ex0InfoInput(String name,int age) {
System.out.println("이름은 "+name+", 나이는 "+age+"살입니다.");
}
*/

public void printAge() {
System.out.println("이름과 나이가 모두 없습니다.");
}
public void printAge(String name) {
System.out.println("이름은 "+name+", 나이는 알수없습니다.");
}
public void printAge(String name,int age) {
System.out.println("이름은 "+name+", 나이는 "+age+"살입니다.");
}

public static void main(String[] args) {
	Ex0InfoInput man = new Ex0InfoInput();
	man.printAge("홍길동", 42);
	man.printAge();
	man.printAge("홍길동");
	}
}
