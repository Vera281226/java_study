package pack2network;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URL;

/* 네트워크 : 컴퓨터 연결 통신 시스템 
// TCP : 연결이 지속되는 방식, 실시간 통신 가능, 신뢰도가 높으나 네트워크에 부하가 걸리기 쉽다. Socket, ServerSockt을 주로 사용
http://www.daum.net:80/index.html
http : 프로토콜 식별자
www.daum.net : 도메인
80 : 웹 포트번호
index.html : 찾고자 하는 파일 */


// 자바의 URL클래스는 www 기반의 URL(Uniform Resource Locator) 통신을 가능하게 한다 이를 이용해 웹 사이트의 문서 읽기(Scraping) 실습
public class WebScrap1 {
	public static void main(String[] args) {
		try {
			// URL url = new URL("https://www.naver.com"); // deprecated = 지금은 사용 가능하지만 곧 삭제될 클래스
			URI uri = new URI("https://www.naver.com");
			URL url = uri.toURL();
			InputStream is = url.openStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is, "utf-8"));
			PrintWriter pw = new PrintWriter(System.out, true);
			// 읽은 문서 파일로 저장
			PrintWriter fw = new PrintWriter(new FileOutputStream("c:/work/ok.html"));
			String line = "";
			while((line=br.readLine())!=null) {
				pw.print(line);
				fw.print(line);
				fw.flush();
			}
			
			fw.close();
			pw.close();
			br.close();
			is.close();
			
		}catch(Exception e) {e.printStackTrace();}
	}
}
