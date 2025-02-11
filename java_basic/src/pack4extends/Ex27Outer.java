package pack4extends;

// 내부 클래스, 클래스의 멤버로 필드, 메소드 외에 클래스를 가질 수 있다. 이를 내부 클래스라고 한다.
// 클래스에서 다른 클래스를 사용해야 할때 효과적 내부 클래스가 extends 할수도 있다
public class Ex27Outer {
	private int kor;
	private Inner inner;
	public Ex27Outer() {
		kor = 10;
		inner = new Inner();
	}
	public void aa() {
		System.out.println("외부 클래스 Outer의 aa 메소드");
		System.out.println("외부 클래스 kor :"+kor);
		bb();
		inner.cc();
		System.out.println("내부 클래스 eng : "+inner.eng);
	}
	private void bb() {
		System.out.println("외부 클래스 Outer의 bb 메소드");
	}
	// 내부 클래스 선언
	
	public class Inner {
		private int eng;
		public Inner() {
			eng = 20;
		}
		
		public void cc() {
			System.out.println("내부 클래스 Inner의 cc 메소드");
			bb();
			System.out.println("내부 eng : "+eng+", 외부 kor"+kor);
		}
	}
public static void main(String[] args) {
	Ex27Outer outer = new Ex27Outer();
	outer.aa();
	outer.bb();
	
	// Inner inner = new Inner(); // 내부 클래스는 독립 객체 생성 new 불가
//	Ex27Outer.Inner inner = outer.new Inner(); //비권장 
//	inner.cc();
	}
}
