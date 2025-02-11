package mypack;

public class Manager extends Regular {
	private int incentive;
	public Manager(String irum, int nai, int salary) {
		super(irum, nai, salary);
	} 
	
	@Override
	public int pay() {
		int salary = super.pay();
	
		if (salary>2500000) 
			incentive += 0.6*salary;
		else if (super.pay()>2500000) 
			incentive += 0.5*salary;
		else
			incentive += 0.4*salary;

		return salary+incentive;
	}
	
	@Override
	public void print() {
		display();
		System.out.println("수령액 : "+pay());
	}
	
}
