package pack4extends;

import java.awt.Frame;

@SuppressWarnings("serial")
public class Ex14FrameSangsok extends Frame {
	public Ex14FrameSangsok() {
		super("상속 연습용");
	}
	public void frameVisible() {
		setSize(500, 300);
		setLocation(200, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex14FrameSangsok frameSangsok = new Ex14FrameSangsok();
		frameSangsok.frameVisible();
	}
}
