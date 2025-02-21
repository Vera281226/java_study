package pack2network;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class NetClient1 {
	public static void main(String[] args) {
		// 일회용 에코 서버에 접속 후 메시지 전송용 
		try {
			 // 서버 ip와 포트번호로 통신용 소켓 생성 서버의 socket.accept()를 만나서 통신 시작
			Socket socket=new Socket("192.168.0.10", 8888);
			PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(),StandardCharsets.UTF_8),true);
			printWriter.println("안녕"+"\n"); // 서버로 자료 전송
			printWriter.close();
			socket.close();
		}catch(Exception e) {e.printStackTrace();}
	}
}
