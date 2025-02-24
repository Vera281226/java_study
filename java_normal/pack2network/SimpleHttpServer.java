package pack2network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

// 웹 서버는 웹 브라우저에서 HTTP를 이용해 요청받은 HTML 문서, 이미지 등을 전송해주는 서비스 프로그램
// 서버 소켓을 생성하고 클라이언트와 연결되면 스레드를 생성하고 클라이언트 요청을 서버/클라이언트 소켓간 통신을 통해 처리하는 서버
// 간단한 HTTP 서버 프로그램을 작성
public class SimpleHttpServer{
	private ServerSocket serverSocket;
	private final int PORT;
	public SimpleHttpServer(int port) {
		this.PORT=port;
	}
	public void gogo() throws Exception{
		serverSocket=new ServerSocket(PORT);
		System.out.println("서버 서비스 중 포트 번호는 "+PORT);
		
		while(true) {
			try {
				Socket clientSocket = serverSocket.accept();
				System.out.println("Recived request from "+clientSocket.getRemoteSocketAddress());
				ClientHandlerClass handlerClass = new ClientHandlerClass(clientSocket);
				new Thread(handlerClass).start();
			} catch (Exception e) {
				System.out.println("에러"+e); break;
			}
		}	
	}
	private static class ClientHandlerClass implements Runnable { // 클라이언트 통신 클래스
		private Socket clientSocket;
		public ClientHandlerClass(Socket socket) {
			this.clientSocket=socket;
		}
		public void run() {
			try {
				// 입출력 객체 생성
				BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream(),StandardCharsets.UTF_8));
				PrintWriter out = new PrintWriter(clientSocket.getOutputStream());
				// 요청 처리
				String requestLine = in.readLine();
				System.out.println("request : "+requestLine);
				
				// Http Response (html 문서 전송)
				out.println("HTTP/1.1 200 OK");
				out.println("Content-Type:text/html;charset=UTF-8");
				out.println("");
				out.println("<html><body><h1>안녕 여러분</h1>");
				out.println("<a href='https://www.kbs.co.kr'>Kbs 방송국</a>");
				out.println("</body></html>");
				out.close();
				in.close();
				clientSocket.close();		
			} catch (Exception e) {e.printStackTrace();}
		}
	}
	public static void main(String[] args) {
		int port = 8080;
		
		try {
			SimpleHttpServer httpServer = new SimpleHttpServer(port);
			httpServer.gogo();
		}catch(Exception e) {e.printStackTrace();}
	}
}