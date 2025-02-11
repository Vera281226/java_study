package mypack;

public class Salesman extends Regular{
	
	private int sales;
	private double commision;

	public Salesman(String irum, int nai, int salary,int sales,double commision ) {
		super(irum, nai, salary);
		this.sales = sales;
		this.commision = commision;	
	}
	

	public int pay() {
		return super.pay()+(int)(sales*commision);
	}
	@Override
	public void print() {
		display();
		System.out.println("수령액 : "+pay());
		}
	
}
