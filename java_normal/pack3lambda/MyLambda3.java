package pack3lambda;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// List, Thread에서 람다를 사용
public class MyLambda3 {
	
	public MyLambda3() {
		// 람다 표현식 응용법
		System.out.println("리스트 사용");
		test1();
		System.out.println("스레드 사용");
		test2(); try {Thread.sleep(10);}catch(Exception e){e.printStackTrace();} // 순서 맞추기
		System.out.println("파일 필터링 사용");
		test3();
	}
	
	private void test1() {
		// 리스트 컬렉션의 각 요소를 출력하기
		
		List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
		// System.out.println(list.getClass().getName()); // java.util.Arrays$ArrayList
		// System.out.println(list instanceof List); // true
		
		for(String i:list) {
			System.out.println(i);
		}
		System.out.println("람다를 사용해 출력");
		
		list.forEach(i->System.out.println(i)); // Comsumer 인터페이스는 매개변수 1개에 반환값이 없는 accept 메소드를 가진다. 
		
		Consumer<String> consumer = new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		consumer.accept("사과");
		String ss[] = {"사과","바나나","체리"};
		for(String f:ss) {
			consumer.accept(f);
		}
		
	}
	
	class ThreadTest{
		
		public ThreadTest() {}
		
		public void sendData(String friend) {System.out.println(friend+"에게 문자를 전송");}
		
		void m1() {new Thread(new Runnable() {	
			@Override
			public void run() {sendData("홍길동");}
		}).start();}
		
		void m2() {
			Runnable runnable = () -> sendData("이기자");
			runnable.run();
		}
		
		void m3() {
			Thread thread = new Thread(() -> sendData("신기해"));
			thread.start();
		}
		
		void m4() {
			new Thread(()->sendData("공기밥")).start(); // sendData 메소드를 처리하는 스레드를 생성하고 실행
		}
	}
	
	private void test2() {
		ThreadTest threadTest = new ThreadTest();
		threadTest.m1();
		threadTest.m2();
		threadTest.m3();
		threadTest.m4();
	}

	private void test3() {
		// 특정 디렉토리에 있는 파일들을 필터링하여 조건에 맞는 파일을 찾기
		File direc = new File("C:/work");
		// 파일 필터 인터페이스를 람다식으로 구현해 txt 확장자 파일 출력
		File[] files = direc.listFiles((File file)->file.isFile() && file.getName().endsWith(".txt"));
		if(files !=null) {
			for(File file:files) {
				System.out.println(file.getName());
			}
		}
	}
	
	public static void main(String[] args) {
		new MyLambda3();
	}
}
