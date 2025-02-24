package pack3lambda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Mylambda4event {
	public static void main(String[] args) {
		JFrame frame = new JFrame("람다 연습");
		JButton button = new JButton("클릭"); // 이벤트 처리용
		JButton button2 = new JButton("클릭2"); // 이벤트 처리용
		
		frame.add("North", button);
		frame.add("Center",button2);
		frame.setBounds(200, 200, 300, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button.addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent e) {System.out.println("전통적 이벤트 처리");}});
		
		button2.addActionListener(e->System.out.println("람다 이벤트 처리"));	
	}
}
