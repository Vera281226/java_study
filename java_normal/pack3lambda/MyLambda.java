package pack3lambda;

@FunctionalInterface // 함수형 인터페이스 강조
interface HelloInter { // 원래는 인터페이스는 따로 만들어야함, 메소드는 무조건 한개여야한다.
	int calcdata(int a, int b);
}

public class MyLambda implements HelloInter {
	
	@Override
	public int calcdata(int a, int b) {return a+b;}
	
	public static void main(String[] args) {
		MyLambda my1 = new MyLambda();
		System.out.println(my1.calcdata(3, 4));
		
		// 람다 표현식 사용
		HelloInter inter = (a, b) -> a+b; // 한줄일 경우 굳이 중괄호를 쓸 이유는 없다.
		System.out.println(inter.calcdata(3, 4));
		HelloInter inter2 = (kbs, mbc) -> kbs * mbc;
		System.out.println(inter2.calcdata(3, 4));
	}
}