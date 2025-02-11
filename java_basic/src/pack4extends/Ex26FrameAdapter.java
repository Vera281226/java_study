package pack4extends;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex26FrameAdapter extends WindowAdapter{
	private Frame frame;
	public Ex26FrameAdapter() {
		frame = new Frame("어댑터 사용");
		frame.setSize(400, 300);
		frame.setLocation(200, 200);
		frame.setVisible(true);
		
		frame.addWindowListener(this);
	}
	
    public void windowClosing(WindowEvent e) {
    	System.exit(0);
    }
    
public static void main(String[] args) {
	new Ex26FrameAdapter();
	}
}
