package pack5;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;
import java.time.LocalTime;

// 스레드를 이용해 디지털 시계 실행
@SuppressWarnings("serial")
public class Ex47ThreadClock extends Frame implements Runnable, ActionListener {
	Label lblMessage; // 프레임에 메시지를 띄워줌
	Thread thread;
	Boolean b = false;
	
	public Ex47ThreadClock() {
		lblMessage = new Label("show datetime", Label.CENTER); //한글 사용시 깨질 가능성이 있음
		add("Center",lblMessage); // 중앙에 문자 표시
		
		Button button = new Button("click"); // 한글 사용시 깨질 가능성 있음
		add("South", button); // 아래쪽에 버튼 표시
		button.addActionListener(this); // 버튼에 클릭 입력 활성화
		
		setTitle("스레드 시계");
		setSize(300, 300);
		setLocation(200, 200);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				b=true; // 종료시 run 메소드의 무한 루프를 끝내기 위함 무한루프를 사용할때 run()의 종료는 무조건 주의해야한다
				System.exit(0);} });
		
		thread = new Thread(this); // 사용자 정의 스레드 생성
		}
		
	@SuppressWarnings("static-access")
	public void run() {
		while(true) {
			if (b==true)break;
			showSigan(); // 1초에 한번씩 불러도 되는 기능이라면 비활성화로 1초를 재워도 별 차이가 없다.
			try {
			thread.sleep(1000);
			}catch (Exception e) {
				System.out.println("err"+e);
			}
		}
	}
	public void actionPerformed(ActionEvent e) { // click 버튼 마우스 입력으로 실행되는 메소드
//		showSigan(); // 여기에서 실행 시키면 버튼을 누를때마다 시간이 갱신됨
		if(thread.isAlive()) return; // 스레드가 활성화된 상태면 메소드 탈출
		thread.start(); //run 을 호출
	}
	private void showSigan(){
		LocalDate date = LocalDate.now(); // 싱글톤 객체
		int y = date.getYear();
		int m = date.getMonthValue();
		int d = date.getDayOfMonth();
		
		LocalTime localTime = LocalTime.now();
		int h = localTime.getHour();
		int mi = localTime.getMinute();
		int s = localTime.getSecond();
		
		String time = y+"-"+m+"-"+d+" "+h+":"+mi+":"+s;
		lblMessage.setText(time);
	}
	public static void main(String[] args) {
				new Ex47ThreadClock();
	}
}
