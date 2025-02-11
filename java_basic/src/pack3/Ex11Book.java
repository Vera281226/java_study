package pack3;

class Ex11Book {
	private String title; // 이 Book 클래스에서만 쓰일 변수 이므로 private 변수 선언
    private String author; // 고정된 private 변수에 대해선 생성자에서 주면 좋다. 
    
    // 객체의 private 변수에 값을 저장
    public Ex11Book(String title,String author) { 
    	this.title=title;
    	this.author=author;
	}
    public String getBookInfo() {
    	return title+", 저자는 "+author; //getter 메소드에서 ""안의 문장과 복수의 String 변수를 반환 가능
    }
}
