package pack2;

public class Ex3Singer {
	
	private String name = "무명 가수";
	private String titleSong = "아 대한민국";
	
	public Ex3Singer(String name,String title) {
		this.name=name;
		this.titleSong=title;
		
	}
	
	public void sing() {
		//메소드 내에서 선언된 지역 변수는 이름은 같더라도 필드 변수와 다름
		System.out.println(this.name+"의 노래 제목은 "+titleSong); //this. 사용시 지역변수를 무시하고 필드 변수가 읽힌다 
		}
	
	
	public void setTitleSong(String titleSong) {
		this.titleSong=titleSong;	
	}

	public static void main(String[] args) {
	Ex3Singer bts = new Ex3Singer("BTS", "다이너마이트");
	bts.sing();
	bts.setTitleSong("BTS 만세");
	bts.sing();
	bts.setTitleSong("BTS 화이팅");
	bts.sing();
	Ex3Singer blackpink = new Ex3Singer("블랙핑크", "how you like that");
	blackpink.sing();
	}

}
