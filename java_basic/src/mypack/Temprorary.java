package mypack;

public class Temprorary extends Employee{
	private int ilsu;
	private int ildang;
	
	public Temprorary(String irum, int nai, int ilsu, int ildang) {
		super(irum, nai);
		this.ilsu=ilsu;
		this.ildang=ildang;
	}
	
	
@Override
public int pay() {
	return ilsu*ildang;
	}
public void print(){
	display();
	System.out.println("수령액 : "+pay());
}
}
