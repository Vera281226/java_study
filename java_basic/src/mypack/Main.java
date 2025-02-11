package mypack;

public class Main {

	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle();
		Vehicle vehicle2 = new Vehicle();
		Car car = new Car();
		Bike bike = new Bike();
		
		vehicle1 = car;
		vehicle2 = bike;
		
		vehicle1.drive();
		vehicle2.drive();
	}

}
