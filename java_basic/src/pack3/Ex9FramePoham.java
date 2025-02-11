package pack3;

import java.awt.Frame;

public class Ex9FramePoham {
	
	private Frame frame; // 외부 클래스를 사용
	
	public Ex9FramePoham() {
		frame = new Frame("포함 연습용"); // 클래스의 포함 관계		
	}
	// 생성자는 초기화 및 전체 윤각만 적고 나머지(처리 로직)은 별도 메소드로 작성하는 것이 좋음
	public void frameVisible() { 
		frame.setSize(500, 300); // 너비와 높이 지정
		frame.setLocation(200, 150); // X좌표와 Y좌표 지정
		frame.setVisible(true);			
	}

	public static void main(String[] args) {
//		Ex9FramePoham framePoham = new Ex9FramePoham(); // 객체 변수는 필요한 경우에만 선언
//		framePoham.frameVisible();
		//new Ex9FramePoham(); // 객체 변수가 굳이 필요하지 않음. 생성자에서 모두 처리됨
		// 종료 방식은 직접 만들어야한다.
		
		//객체 변수 선언이나 두줄씩 길게 쓸 필요 없이 한줄로 표현 하는법
		new Ex9FramePoham().frameVisible();		
	}

}
