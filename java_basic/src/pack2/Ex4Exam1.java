package pack2;
// 숫자의 제곱을 출력하는 메소드 오버로딩
// 정수를 매개변수로 받는 메소드
// 실수를 매개변수로 받는 메소드

public class Ex4Exam1 { // 메소드 오버로딩 연습용
	
	public Ex4Exam1() {
	}
	
	public int square(int num) {
		return num*num;
	}
	
	public double square(double num) {
		return num*num;
	}

	public static void main(String[] args) {
		
		Ex4Exam1 ca1 = new Ex4Exam1();
		System.out.println("result1 : "+ca1.square(4));
		
		System.out.println("result2 : "+ca1.square(7.8));

	}

}
