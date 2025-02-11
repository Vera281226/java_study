package pack4extends;

public class Ex18JepumMain {

	public static void main(String[] args) {
		// 추상 클래스는 스스로 객체 생성 불가
		
		//Ex18Jepum jepum = new Ex18Jepum; // 추상 타입은 인스턴스 불가
		Ex18Jepum jepum = null; //객체를 null 값 선언 자체는 가능

		
		Ex18JepumTv tv = new Ex18JepumTv();
		tv.volumeControl();
		tv.volumeShow();
		
		Ex18Radio radio = new Ex18Radio();
		radio.volumeControl();
		radio.volumeShow();
		
		Ex18HandPhone handPhone = new Ex18HandPhone();
		handPhone.volumeControl();
		handPhone.volumeShow();
		
		jepum = handPhone;
		jepum.volumeControl();
		jepum = radio;
		jepum.volumeControl();
		jepum = handPhone;
		jepum.volumeControl();
		
		System.out.println();
		Ex18Jepum j[] = {tv,radio,handPhone};
		for(Ex18Jepum jep:j) 
			jep.volumeControl();
	}
}
