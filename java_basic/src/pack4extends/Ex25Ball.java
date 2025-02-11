package pack4extends;

public class Ex25Ball extends Ex25FlyerAdapter{ // 추상 메소드를 일반 메소드로 변환해서 쓰고싶은거만 사용가능
	@Override
	public void fly() {
		System.out.println("야구공이 힘차게 관중석으로 날아감");
	}
}
