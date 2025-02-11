package mypack;

public class Regular extends Employee{
	private int salary;
	
	public Regular(String irum, int nai, int salary) {
		super(irum, nai);
		this.salary = salary;
	}

	@Override
	public int pay() {
		return salary;
	}
	@Override
	public void print() {
		display();
		System.out.println("수령액 : "+pay());
		}

}
