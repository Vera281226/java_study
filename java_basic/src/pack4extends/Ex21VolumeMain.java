package pack4extends;

public class Ex21VolumeMain {

	public static void main(String[] args) {
//		Ex21Volume myvolume = new Ex21Volume(); // 
		Ex21Volume myvolume;
		
		Ex21Radio radio = new Ex21Radio();
		Ex21Tv tv = new Ex21Tv();
		
		radio.volumeUp(6);
		radio.volumeDown(3);
		
		tv.volumeUp(7);
		tv.volumeDown(2);
		
		myvolume = radio;
		myvolume.volumeUp(2);
		myvolume = tv;
		myvolume.volumeUp(2);
	}
}
