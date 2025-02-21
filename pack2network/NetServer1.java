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
		// 단순 에코 서버
		// ServerSocket serverSocket = null; // ServerSocket 생성
		
		// 내 컴퓨터가 사용중인 port number 확인 cmd 명령어 netstat -a -n -o
		// cmd 명령어 taskkill /f /pid 포트번호 = 프로세스 삭제
		/* for(int i=0; i<65536; i++) {
			try {
			serverSocket = new ServerSocket(i);
			serverSocket.close();
		}catch(Exception e) {System.out.println(i+" 번 포트번호 사용 중");}
		}*/
		// Socket socket=null; // 클라이언트와 송수신 목적
		try {
			ServerSocket serverSocket = new ServerSocket(8888); // ip와 portnumber binding 후 listening
			System.out.println("서버 서비스 시작");
			// ServerSocket이 클라이언트 요청시 대기하다 접속하면 클라이언트와 통신을 위한 Socket 객체 생성 
			Socket socket=serverSocket.accept(); 
			
			// 현재 웹 서버는 실험용으로 클라이언트의 메시지를 받아 출력하고 종료하는 일회용 서비스
			// 클라이언트가 넘겨준 메시지 읽기
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8)); 
			String data=reader.readLine();
			System.out.println("수신된 자료 : "+data);
			
			reader.close();
			socket.close();
			serverSocket.close();
			
		}catch(Exception e) {System.out.println("Err : "+e);}
		System.out.println("확인");
	}}



