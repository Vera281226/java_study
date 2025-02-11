package pack2;

// 싱글턴 패턴 - 객체의 인스턴스가 한개만 생성되는 패턴 , 메모리 절약, 데이터 공유가 편리하다는 장점이 있다.
// 단점은 유연성이 부족하다. 

public class Ex6Singleton {
	int kor = 100;
	String name = "tom";
	
	public Ex6Singleton() {
		System.out.println("Ex6singleton 생성자");
	}
	
	public void kbs() {
		System.out.println("kbs");
	}
	
	private static Ex6Singleton singleton = new Ex6Singleton();  
	// 이 부분에서 static 없이 쓸경우 stack에서 프로그램 실행시 생성되므로 밑에서 싱글톤 메소드를 사용 불가능
	
	public static Ex6Singleton getInstance() { // 클래스에서 static 영역에서 생성시킨 객체를 쉽게 복사하도록 만드는 메소드
		return singleton;
	}
	// 어떻게 하나 했는데 이게 클래스 자체에서 new로 객체 생성시키게하고 써먹는법중의 하나
}
