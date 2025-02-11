package pack4extends;

public class Ex15Car extends Ex15Vehicle{
	public int fuelCapacity;
	
	public Ex15Car(String brand, int fuelCapacity) {
		this.brand = brand;
		this.fuelCapacity= fuelCapacity;	
	}


	@Override
	public void describe() {
	System.out.println("This is a car of brand "+brand+" with a fuel capacity of "+fuelCapacity+" liters");
	}
}
