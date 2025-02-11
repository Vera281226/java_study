package pack5;

// 하나의 프로그램은 하나의 프로세스에 해당한다 이런 프로세스를 실제로 실행하기 위한 실행 단위를 스레드라고 한다.
// 스레드 하나는 한개의 실행을 담당한다 (single tasking) 스레드 여러개를 이용해 여러 작업을 실행한다. (multi tasking)
// 네트워크 작업을 효율적으로 운영하려면 스레드 처리는 필수다.
public class Ex46Thread implements Runnable {
	
	public Ex46Thread() {}
	public Ex46Thread(String name) {
		Thread tt = new Thread(this, name);
		tt.start();
	}
	
	public void run() { // start()에 의해 호출되면 run 처리가 끝나면 스레드 작업이 종료
		for(int i = 0; i<=50; i++) {
			System.out.println(i+"\t"+Thread.currentThread().getName());
			try {
				Thread.sleep(100); // 해당 밀리초동안 비활성 1000ms = 1초
			} catch (Exception e) {
				System.out.println("err : "+e);
			}
		}
	}
	
	public static void main(String[] args) { //기본적으로 모든 프로그램은 main 스레드가 자동 실행된다
		
		try {
		/*
		// 사용자 정의 스레드를 사용하지 않은 경우
		
		Ex46Thread my1 = new Ex46Thread();
		Ex46Thread my2 = new Ex46Thread();
		my1.run(); // 순차적 명령 처리
		my2.run(); 
		*/
		
		//사용자 정의 스레드를 사용한 경우
		Ex46Thread my1 = new Ex46Thread();
		Ex46Thread my2 = new Ex46Thread();
		Thread t1 = new Thread(my1, "하나");
		Thread t2 = new Thread(my2, "둘");
		t1.start();
		t2.start();
		
		t2.setPriority(9); // 스케줄러 우선순위 변경
		
		t1.join(); //사용자 정의 스레드가 종료될때까지 메인 스레드를 대기
		t2.join();
		
		// new Ex46Thread("하나"); // 스레드 스케줄러에 위해 순차적인 처리가 아니라 랜덤하게 요청이 처리된다
		// new Ex46Thread("둘"); // 호출 순서와 출력 순서는 자유다.
		System.out.println("프로그램 종료"); // 스레드가 끝날때까지 종료되지 않는다.
		} catch(Exception e){}
	}
}
