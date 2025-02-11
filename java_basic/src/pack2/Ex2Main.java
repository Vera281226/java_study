package pack2;

public class Ex2Main {
	public static void main(String[] args) {
		Ex2Programmer programmer1 = new Ex2Programmer();
		System.out.println("보유기술 : "+programmer1.spec); //ctrl 누르고 메소드 변수 클릭시 클래스파일로 링크되어 찾아짐
		programmer1.displayData();
		
		programmer1.nickName = "웹 전문가"; //public 멤버 필드이므로 외부에서 값을 수정
		programmer1.spec = "1종 보통 운전면허"; //default 멤버 필드이므로 패키지내에서 값을 수정
		programmer1.displayData();


		// 은닉화된 멤버를 해당 클래스 밖에서 제어하기
		//programmer1.age; //변수 호출 불가
		int nai = programmer1.getAge(); // abcd()에 age값을 리턴시킨것을 가져옴
		System.out.println("programmer1 객체의 age : "+nai);
		programmer1.setAge(33); // public 메소드 setter 를 이용해 private 필드에 값전달 getter 보다 낫다 
		System.out.println("programmer1 객체의 age : "+programmer1.getAge());
		programmer1.displayData();
		programmer1.setAgex(50, 1223);

		System.out.println("static, final 관련 ---");
		//System.out.println("motto:"+programmer1.motto);
		System.out.println("motto:"+Ex2Programmer.motto); // static 멤버는 클래스 이름으로 불러와서 참조할수 있다(클래스명.멤버)
		//final 필드 수정 불가 에러 참조만 가능
		System.out.println(programmer1.WEIGHT);
		System.out.println("PI :"+Ex2Programmer.PI);
		
		System.out.println("===============");
		Ex2Programmer programmer2 = new Ex2Programmer();
		programmer2.displayData();
		System.out.println("\n객체 변수가 참조하는 주소에 대해...(참고)");
		System.out.println(programmer1.toString()+" "+programmer2.toString()); // 16진수로된 참조 주소 출력
		// pack2.Ex2Programmer@3d0f8e03 pack2.Ex2Programmer@6366ebe0
		System.out.println(programmer1.hashCode()+" "+programmer2.hashCode()); // 10진수로된 해쉬코드표에 의한 주소가 출력
		// 1024429571 1667689440
		
		System.out.println("전문가가 만든 클래스 경험===============");
		System.out.println(Integer.MAX_VALUE);
		
	}


}
