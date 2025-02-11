package mypack;

public abstract class Employee {
	private String irum;
	private int nai;
	
	public Employee(String irum, int nai) {
		this.irum = irum;
		this.nai = nai;
	}
	
	abstract public int pay();
	abstract public void print();
	
	public void display() {
		System.out.println("이름 : "+irum+", 나이 : "+nai);
	}
}
