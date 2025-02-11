package pack4extends;

public class Ex29Main {
public static void main(String[] args) {
	Ex29Saram saram = new Ex29Saram();
	System.out.println(saram.getIrum());
	Ex29Gildong gildong = new Ex29Gildong();
	Ex29Saram saram2 = gildong.getSaram();
	
	System.out.println(saram2.getIrum());

	
	}
}
