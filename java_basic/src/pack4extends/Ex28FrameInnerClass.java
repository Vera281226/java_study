package pack4extends;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Paint;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


@SuppressWarnings({ "serial", "unused" })
public class Ex28FrameInnerClass extends Frame {
	int x, y;
	

	public Ex28FrameInnerClass() {
		int x, y;
		setTitle("내부 클래스 사용");
		setSize(400, 300);
		setLocation(200, 200);
		setVisible(true);
		
		addWindowListener(new Wevent());
		addMouseListener(new Mevent());
		
		
	}
	class Wevent extends WindowAdapter { // 윈도우 이벤트 관련 내부 클래스 자동으로 호출되게 만든 Callback
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	class Mevent extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			x=e.getX();
			y=e.getY();
			System.out.println(x+" "+y);
//			setTitle(e.getX()+" "+e.getY());
		paint(getGraphics());
		}
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawString("홍길동", x, y);
	}
	
		
		

	
public static void main(String[] args) {
	new Ex28FrameInnerClass();
	}
}
