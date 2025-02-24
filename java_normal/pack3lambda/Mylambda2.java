package pack3lambda;

interface MyInter{
	void aaa(); // 매개변수가 없는 메소드
}

interface MyInterArg{
	void bbb(int a, int b); // 매개변수가 있는 메소드
}

interface MyInterArgReturn{
	int ccc(int a, int b); // 반환값, 매개변수가 있는 메소드
}

interface MyInterArg7{
	void ddd(int a);
}

public class Mylambda2 {
	public static void main(String[] args) {
		// 인자가 없는 추상 메소드 처리
		MyInter inter1= new MyInter() { // 내부 무명 클래스
			
			@Override
			public void aaa() {System.out.println("익명 클래스의 메소드 오버라이딩");}
				};
			inter1.aaa();
			
			MyInter inter2= () -> {System.out.println("익명 클래스의 메소드 오버라이딩");
			int imsi=1;
			System.out.println("익명 클래스의 메소드 오버라이딩 : "+imsi+"\n"); };
			
			inter2.aaa();
			
			MyInterArg interArg = new MyInterArg() {
				
				@Override
				public void bbb(int a, int b) {
					System.out.println("두 수의 합은 : "+(a+b));
				}
			};
			interArg.bbb(3, 5);
			
			
			MyInterArg interArg2 = (a, b)->System.out.println("두 수의 합은 : "+(a+b));
			interArg2.bbb(3, 5);
			
			// 람다식으로 표현(매개변수가 1개 일 때는(a) 를 ()빼고 써도 된다.) 
			MyInterArg7 arg7 = a->System.out.println(a);
			arg7.ddd(7);
			
			// 반환값이 있는 추상 메소드 처리
			MyInterArgReturn argReturn = new MyInterArgReturn() {
				
				@Override
				public int ccc(int a, int b) {
					System.out.println("ccc 처리");
					return a+b;
				}
			};
			int result = argReturn.ccc(2, 3);
			System.out.println("두 수를 더한 값 : "+result);
			
			MyInterArgReturn argReturn2 = (a, b)->(a+b);
			int result2 = argReturn2.ccc(2, 3);
			System.out.println("두 수를 더한 값 : "+result2);			
	}
}
