package pack2network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/* 소켓(Socket)은 TCP/IP 기반 네트워크 통신에서 데이터 송수신의 마지막 접점
 * 소켓통신은 이러한 소켓을 통해 서버-클라이언트간 데이터를 주고받는 양방향 연결 지향성 통신
 * 소켓통신은 보통 지속적으로 연결을 유지하면서 실시간으로 데이터를 주고받아야 하는 경우에는 사용 */

public class NetServer1 {
	public static void main(String[] args) {
		// 일회용 메시지 출력 서버
		try {
			ServerSocket serverSocket = new ServerSocket(8888); // ip와 portnumber binding 후 listening
			System.out.println("서버 서비스 시작");
			
			// ServerSocket이 클라이언트 요청시 대기하다 접속하면 클라이언트와 통신을 위한 Socket 객체 생성 
			Socket socket=serverSocket.accept(); 
			
			// 클라이언트가 넘겨준 메시지 읽기
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8)); 
			String data=reader.readLine();
			System.out.println("수신된 자료 : "+data);
			
			reader.close();
			socket.close();
			serverSocket.close();		
		}catch(Exception e) {System.out.println("Err : "+e);}
		System.out.println("확인");
	}
}