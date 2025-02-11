package pack4extends;

public class Ex15Bicycle extends Ex15Vehicle {
	
	public int gearCount;
	
	public Ex15Bicycle(String brand, int gear) {
		this.brand = brand;
		this.gearCount= gear;	
	}

	@Override
	public void describe() {
	System.out.println("This is a bicycle of brand "+brand+" with "+gearCount+" gears");
	}
}