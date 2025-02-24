package pack2network;

import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

// jsoup 라이브러리를 사용 위키피디아의 비욘세 페이지 읽어보기 https://ko.wikipedia.org/wiki/%EB%B9%84%EC%9A%98%EC%84%B8
// %EB%B9%84%EC%9A%98%EC%84%B8처럼 한글은 URL 인코딩을 해야할 필요가 생긴다 %뒤의 16진수 값으로 변경시킨다
public class WebScrap2 {
	
	public static void main(String[] args) {
		try {
			// System.out.println(URLEncoder.encode("비욘세","utf-8"));
			String url = "https://ko.wikipedia.org/wiki/"+URLEncoder.encode("비욘세","utf-8");
			Document doc = Jsoup.connect(url).get();
			String text = doc.text(); // 웹 페이지의 모든 텍스트 추cnf
			printKorText(text);
			
			
		}catch(Exception e) {e.printStackTrace();}
		
	}
	// 한글 데이터만 얻기
	public static void printKorText(String text) {
		// 정규 표현식 : 프로그래밍에서 문자열을 다룰 때, 문자열의 일정한 패턴을 표현하는 일종의 형식 언어
		Pattern pattern = Pattern.compile("[가-힣\\s]+"); // 정규 표현식 패턴 작성
		Matcher matcher = pattern.matcher(text);
		while(matcher.find()) {
			String line = matcher.group().trim();
			if(!line.isEmpty()) { // 빈줄이 아닌 경우
				System.out.println(line);
			}
		}
	}
	
}
