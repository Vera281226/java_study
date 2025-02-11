package pack;

import java.util.Scanner;

public class Test6if {
	
	private static Scanner sca;

	public static void main(String[] args) {
		// 조건 판단문 if
		System.out.println("뭔가를 수행 후 if문 만나기");
		int num = 7;
		
		if(num >= 5) {
			System.out.println("크구나"); // if 에서 ;까지 단순 if
			System.out.println("진짜로 크네"); //if 문에 들어가지 않음 {}로 묶어 줘야함
		}
		
		System.out.println("계속1");
		
		if(num >= 5) {
			System.out.println("크구나"); 
			System.out.println("진짜로 크네"); 
		}
		else { //if 조건 미충족으로 false가 되었을 때 
			System.out.println("크지 않네");
			}
		
		// 그냥 시작부터 false 값을 빠르게 찾게 만들수는 없나?
			
		System.out.println("계속2");
		
		int jumsu = 66;
		
		
		if(jumsu >= 70) {
			if(jumsu >= 90) {
				System.out.println("우수");
			}
			else {
				System.out.println("보통");				
			}
		}
		else {
			if(jumsu >= 50) {
				System.out.println("저조");
			}
			else {
				System.out.println("매우 저조");
			}
		}
		
		System.out.println("계속3");

		int jumsu2 = 49;
		String result = "";
		
		if(jumsu2 >=90) { 
			result = "수";
		}
		else if(jumsu2 >= 80) {
			result = "우";
		}
		else if(jumsu2 >= 70) {
			result = "미";
		}
		else if(jumsu2 >= 60) { 
			result = "양";
		}
		else {  //마지막은 조건 생략 권장
			result = "가";
		}
		
		System.out.println("평가 결과는 " + result);
		
		System.out.println("계속4");
		
		// 어느 공원의 입장료가 8세 이하, 65세 이상인 경우 무료 9세 이상 20세 미만인 경우 3000원 그 외엔 5000원
		
		int age = 5;
		
		if(8 >= age || age >= 65) {
			System.out.println("무료");
		}
		if(9 <= age && age < 20) {
			System.out.println("3000원");
		}
		if(20 <= age && age < 65) {
			System.out.println("5000원");
		}
		
		int price = 0;
		
		if(9 <= age && age < 20) {
			price = 3000;
		}
		else if(20 <= age && age < 65) {
			price = 5000;
		}
		else {
			price = 0; // 위에서 price 기본값이 0 으로 설정하여 또 0값을 기억시키지않아도 되므로 지워도 된다.
		}
		
		System.out.println("입장료는 " + price);
		
		System.out.println("야구장 입장하기 : 로그인 성공");
		
		String id = "kbs";
        String password = "ok123";
        
        sca = new Scanner(System.in);
        
        System.out.print("id : ");
        String inputid =sca.nextLine();
        
        
        System.out.print("pwd : ");
        String inputpwd =sca.nextLine();
        
        //if(inputid == id && inputpwd == password) { //기본형 비교로 String 값은 비교가 안됨 
        if(inputid.equals(id) && inputpwd.equals(password)) { //스트링 값은 .equals()를 이용하여 비교
        	System.out.println("로그인 성공했습니다.");	
        }
        else {
        	System.out.println("로그인 실패했습니다.");
        }
        
        
       
        
        
        
        
		}
		
	}


