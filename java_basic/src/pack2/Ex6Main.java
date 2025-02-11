package pack2;

import java.time.LocalDate;

public class Ex6Main {

	public static void main(String[] args) {
		Ex6Singleton ex1 = new Ex6Singleton();
		Ex6Singleton ex2 = new Ex6Singleton();
		
		System.out.println(ex1+" "+ex2); // 따로 생성시킨 두 객체변수 서로 주소가 다르게 나온다. 
		System.out.println(ex1.name+" "+ ex2.name);
		ex1.name = "홍길동";
		System.out.println(ex1.name+" "+ ex2.name);
		
		// 싱글턴 패턴 적용
		
		Ex6Singleton my1 = Ex6Singleton.getInstance();
		Ex6Singleton my2 = Ex6Singleton.getInstance();
		System.out.println(my1+" "+my2);
		System.out.println(my1.name+" "+ my2.name);
		my1.name = "한국인";
		System.out.println(my1.name+" "+ my2.name);
		
		LocalDate localdate = LocalDate.now();
		LocalDate localdate2 = LocalDate.now();
		
		System.out.println(localdate.hashCode()+" "+localdate2.hashCode());
		// 오버라이딩 되어 객체 주소가 출력되지않으면 해시코드 사용
		
		System.out.println(localdate);
		
		
		
	
	}

}
