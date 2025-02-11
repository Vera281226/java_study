package pack5;

public class Ex35Student {
	
//DTO : 배열로는 한번에 다룰 수 없는 다양한 타입의 정보들을 하나로 묶어 전송하거나 관리하기 위한 객체를 생성하는 클래스
//메소드는 getter,setter 메소드를 제외하곤 다른 기능을 가진 메소드는 없어야한다 
	
	private String hakbun,irum;
	private int jumsu;
	
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public String getIrum() {
		return irum;
	}
	public void setIrum(String irum) {
		this.irum = irum;
	}
	public int getJumsu() {
		return jumsu;
	}
	public void setJumsu(int jumsu) {
		this.jumsu = jumsu;
	}

}
