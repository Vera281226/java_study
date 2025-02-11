package pack4extends;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class Ex23FrameInterface extends Frame implements WindowListener, MouseListener{
	public Ex23FrameInterface() {
		super.setTitle("이벤트 처리 창");
		
		setSize(400, 300);
		setLocation(200, 200);
		setVisible(true);
		
		
		// 윈도우 리스너를 프레임에 장착해주지 않으면 이벤트 인식을 못함
		addWindowListener(this); // Frame 클래스의 객체에 WindowListener를 장착
		addMouseListener(this);
	}
	@Override
	public void windowActivated(WindowEvent e) {
	}
	@Override
	public void windowClosed(WindowEvent e) {
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("윈도우 종료 처리 메소드");
		System.exit(0);
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");
	}
	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified");
	}
	@Override
	public void windowOpened(WindowEvent e) {
	}
	
	//마우스 이벤트 관련
	@Override
	public void mouseClicked(MouseEvent e) {
		int r = (int)(Math.random()*255);
		int g = (int)(Math.random()*255);
		int b = (int)(Math.random()*255);


		System.out.println("mouseClicked 메소드 수행");
		setBackground(new Color(r, g, b));

	}
	@Override
	public void mouseEntered(MouseEvent e) {		
	}
	@Override
	public void mouseExited(MouseEvent e) {		
	}
	@Override
	public void mousePressed(MouseEvent e) {		
	}
	@Override
	public void mouseReleased(MouseEvent e) {		
	}
public static void main(String[] args) {
	new Ex23FrameInterface();
	}
}
