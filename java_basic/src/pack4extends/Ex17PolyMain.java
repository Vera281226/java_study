package pack4extends;

public class Ex17PolyMain {

	public static void main(String[] args) {
		Ex17PolyCar car1 = new Ex17PolyCar();
		Ex17PolyBus bus1 = new Ex17PolyBus();
		Ex17PolyTaxi taxi1 = new Ex17PolyTaxi();
		
		System.out.println();
		car1.dispData();
		System.out.println(car1.getSpeed());
		
		System.out.println("\n버스에 대해");
		bus1.dispData();
		System.out.println(bus1.getSpeed());
		bus1.show();
		
		System.out.println("\n택시에 대해");
		taxi1.dispData();
		System.out.println(taxi1.getSpeed());
		
		// 주소 치환
		Ex17PolyCar car2 = new Ex17PolyBus(); //promotion
		car2.dispData();
		//car2.show; // Bus의 고유 메소드 실행 불가
		
		Ex17PolyCar car3 = taxi1;
		car3.dispData();
		
		//다형성
		//Ex17PolyBus bus2 = new Ex17PolyCar();
		Ex17PolyBus bus2 = (Ex17PolyBus)car2;
		bus2.dispData();
		bus2.show();
		
		//Ex17PolyTaxi taxi2 = new Ex17PolyCar();
		Ex17PolyTaxi taxi2 = (Ex17PolyTaxi) car3;
		taxi2.dispData();
		
		// Ex17PolyTaxi taxi3 = (Ex17PolyTaxi)car1; // ClassCastException Error
		// 자식의 주소를 기억하지않는 부모의 주소는 캐스팅도 안됨
		
	  Ex17PolyCar p[] = new Ex17PolyCar[3]; //Car 타입 배열선언
	  p[0] = car1;
	  p[1] = bus1;
	  p[2] = taxi1;
	  p[0].dispData();
	  p[1].dispData();
	  p[2].dispData();
	  
	  for(int i=0; i<p.length; i++) {
		  p[i].dispData();
	  }
	  for(Ex17PolyCar car:p) {
		  car.dispData();
	  }
	}

}
