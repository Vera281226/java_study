package pack4extends;
/*
abstract public class Ex21Volume {
	abstract public void volumeUp(int level);
	abstract public void volumeDown(int level);
}
*/
// 인터페이스 : 추상 클래스의 다른 형태 추상 메소드의 특징도 그대로 가진다 다중 상속이 가능한 특징을 가진다
// 추상 메소드만 가질 수 있다
public interface Ex21Volume { 
	void volumeUp(int level);
	void volumeDown(int level);
	
//	public void print() { //일반 메소드 사용이 불가능하다
//		System.out.println("일반 메소드");
//	}
}

