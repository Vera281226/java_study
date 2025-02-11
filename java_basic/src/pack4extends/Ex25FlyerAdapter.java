package pack4extends;

// 어댑터 클래스는 모든 추상메소드를 오버라이딩하는 수고를 덜기 위해 
// 미리 어댑터 클래스로 간략하게 전부 오버라이딩해 일반 메소드로 만든다.
public class Ex25FlyerAdapter implements Ex24Flyer {
	@Override
	public void fly() {}
	@Override
	public boolean isAnimal() {return false;}
}
