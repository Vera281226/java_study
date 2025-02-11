package pack2;

public class Ex4Book {
	
	public String title;
	public String author;
	public boolean isAvailable;
	
	public Ex4Book(String a,String b,boolean c) {
		title = a;
		author = b;
		isAvailable = c;		
	}

	public void borrow() {
		if(isAvailable == true) {
			isAvailable = false;
			System.out.println("책 대출 성공");
		}else {
			System.out.println("이미 빌려간 책입니다.");
			}
				
	}
	
	public void returnBook() {
		isAvailable = true;
		System.out.println("책 반납 성공");
	}
	
	
	public void printBookinfo() {
		System.out.println("제목:["+title+"],저자:["+author+"],대출가능:["+isAvailable+"]");
	}
	
}
