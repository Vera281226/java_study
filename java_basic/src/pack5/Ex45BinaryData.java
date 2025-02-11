package pack5;

import java.io.Serializable;

// 직렬화란 자바 시스템에서 사용가능하게 바이트 형태로 데이터를 변환, 이후 원래 형태로 역변환하는 기술
// 주로 네트워크를 통해 전송 및 네트워크 처리를 위해 또는 객체 파일 저장이나 불러오기에 사용되며 미리 객체를 직렬화 해야한다. 
@SuppressWarnings("serial")
public class Ex45BinaryData implements Serializable{
	int i = 100;
	double d = 123.4;
	String ss1 = "good";
	String ss2 = "오늘은 금요일";
}
