package pack2network;

import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

// Thread를 이용한 복수 문서 읽어오기
public class WebScrap3 implements Runnable {
	private String url;
	private String title;
	
	public WebScrap3(String url, String title) {
		this.url=url;
		this.title=title;
	}
	
	@Override
	public void run() {
		try {
		Document doc=Jsoup.connect(url).get();
		String text = doc.text();
		
		System.out.println();
		System.out.println("문서 제목 : "+title);
		printKorText(text);
		}catch(Exception e) {e.printStackTrace();}
	}
	
	public void printKorText(String text) {
		// 정규 표현식 : 프로그래밍에서 문자열을 다룰 때, 문자열의 일정한 패턴을 표현하는 일종의 형식 언어
		Pattern pattern = Pattern.compile("[가-힣\\s]+"); // 정규 표현식 패턴 작성
		Matcher matcher = pattern.matcher(text);
		while(matcher.find()) {
			String line = matcher.group().trim();
			if(!line.isEmpty() & line.length()>1) { // 빈줄이 아닌 경우
				System.out.println(line);
			}
		}
	}
	
	public static void main(String[] args) throws Exception{
		String[] titles = {"백설공주","인어공주"};
		
		String[] urls = {"https://ko.wikipedia.org/wiki/"+URLEncoder.encode(titles[0],"utf-8"),
						"https://ko.wikipedia.org/wiki/"+URLEncoder.encode(titles[1],"utf-8")};
		
		for(int i=0; i<urls.length; i++) {Thread thread = new Thread(new WebScrap3(urls[i],titles[i])); thread.start();}
	}
}
