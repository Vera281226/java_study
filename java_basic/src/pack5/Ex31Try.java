package pack5;

//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.util.ArrayList;

// 예외처리 : 키보드 입력, 파일 입출력, 네트워크, DB 처리 등 외부 장치와 연결해 사용하는 경우
// 예기치 못한 외부 장치 에러가 발생할 수 있는데 이를 방지할 목적으로 사용한다.
// try {} catch {} finally {} 형식으로 에러를 잡아 예외로 처리
// throws 로 예외를 던져버릴수도 있다.

public class Ex31Try {
public String name = "tom";

	public void test() { try {
		
		int a[] = {1,2,3};
		System.out.println("배열값 출력 : "+ a[3]);
	} catch (Exception e) {
		System.out.println("지역 우선 순위:"+e.getMessage()); //메소드 내의 지역 오류 catch가 우선 실행됨
	}
	}
	
	public void test2() throws Exception{ // 던지기는 좋은 방법 아님
		//FileReader fr2 = new FileReader("c:/work/aaa.txt");
	}
	

	public static void main(String[] args) {
//		try {
//			// 파일 작업은 강제 예외 처리 요구
//			//FileReader fr = new FileReader("c:/work/aaa.txt");	
//	 } catch(FileNotFoundException f) {
//			System.out.println("파일 읽기 오류");
//		}
 		
		try { // 에러가 없을 경우 계속 try 수행

			int su = 0;
			//int su = 2;
			int result = 10 / su;
			System.out.println("result : "+result);
			Ex31Try ex31Try = new Ex31Try();
			//Ex31Try ex31Try = null;
			System.out.println("이름은 "+ex31Try.name);
			
			ex31Try.test();
			
			ex31Try.test2();
		}	
		catch(ArithmeticException e){ //에러 발생시 catch 수행	
				System.out.println("나누기 오류 : 0으로 나누지 마세요");
		}
		catch(NullPointerException e) {
			System.out.println("참조변수 오류");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 참조 에러:"+e.getMessage());
		}catch (Exception e) { //Exception을 가장 먼저 적으면 항상 모든 예외처리는 이 블록에서 됨 
			System.out.println("위 특정 조건 catch 이외의 나머지 모든 오류는 여기서 처리");
		}finally {
			System.out.println("에러 유뮤에 상관없이 무조건 수행");
		}
		System.out.println("프로그램 종료");
	}
}

