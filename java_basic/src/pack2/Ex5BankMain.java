package pack2;

public class Ex5BankMain {
	
	public static void main(String[] args) {
		
		Ex5Bank tom = new Ex5Bank();
		tom.dePosit(5000);
		tom.withdraw(3000);
		System.out.println("tom의 예금액 :"+tom.getMoney());
		
		Ex5Bank oscar = new Ex5Bank(2000);
		oscar.dePosit(1000);
		oscar.withdraw(3000);
		System.out.println("oscar의 예금액 :"+oscar.getMoney());
		
		System.out.println("객체의 주소");
		System.out.println("tom 객체 변수의 주소 : "+tom+" "+tom.hashCode());
		System.out.println("oscar 객체 변수의 주소 : "+oscar+" "+oscar.hashCode());
		System.out.println(tom == oscar); // 두 객체의 주소 비교
		
		Ex5Bank james = null;
		System.out.println("james 객체 변수의 주소 : "+james);
		james = oscar; //주소를 치환, 하나의 객체를 두 개의 객체변수가 참조, 클래스 타입이 같아야함
		System.out.println("james 객체 변수의 주소 : "+james);
		//System.out.println(james.getMoney()); //NullPointerException error 객체의 주소가 없음 오류
		
		if(james == oscar) 
			System.out.println("둘은 같은 주소야.");
		else
			System.out.println("둘은 같은 주소아니야.");
		
		if(james == tom) 
			System.out.println("둘은 같은 주소야.");
		else
			System.out.println("둘은 같은 주소아니야.");
		
	    if(james instanceof Ex5Bank) //타입 비교 연산자
	    	System.out.println("Ex5Bank 타입이군요");
	    else
	    	System.out.println("Ex5Bank 타입아니야");
	    
	    System.out.println("\n 스트링 타입(String type)값 비교에 대해");
	    
	    String ss1 = "kor";
	    String ss2 = new String();
		ss2 = "kor";
		String ss3 = new String("kor"); //문자열은 heap 의 literal pool에 저장됨
		
		System.out.println(ss1.hashCode()+" "+ss2.hashCode()+" "+ss3.hashCode());
	
		if(ss1 == ss2)
			System.out.println("같음");
		else
			System.out.println("다름");
		
		if(ss1 == ss3)
			System.out.println("같음");
		else
			System.out.println("다름");
		
		if(ss2 == ss3)
			System.out.println("같음");
		else
			System.out.println("다름");
		
		// 문자열(String type 비교는 ==이 아니라 .equals() 메소드를 사용해야여 비교
		
		if(ss1.equals(ss2))
			System.out.println("\n같음");
		else
			System.out.println("다름");
		
		if(ss1.equals(ss3))
			System.out.println("같음");
		else
			System.out.println("다름");
		
		if(ss2.equals(ss3))
			System.out.println("같음");
		else
			System.out.println("다름");
		
		System.out.println("\n 배열도 객체(참조형)");
		int ar[] = new int[3];
		ar[0] = 10;
		System.out.println(ar[0]+" "+ar); //배열의 대표명ar은 객체변수로 객체 주소가 찍힌다. 
		
		int ar2[] = {1,2,3};
		System.out.println(ar2[0]+" "+ar2);
		
		// 접근 지정자에 대해
		
		Ex5Bank bank1 = new Ex5Bank();
		//System.out.println(bank1.money); //private 멤버 접근 불가
		System.out.println(bank1.imsi); //default 수준이므로 멤버 접근 가능 
		System.out.println(bank1.imsi2); // public 수준이므로 멤버 접근 가능

	}

}
