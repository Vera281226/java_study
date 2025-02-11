package pack4extends;

public class Ex21Radio implements Ex21Volume {
	private int volLevel;
	public Ex21Radio() {
		volLevel = 0;		
	}
@Override
	public void volumeUp(int level) {
		volLevel += level;
		System.out.println("라디오 볼륨 올리면"+volLevel);
	}
@Override
	public void volumeDown(int level) {
		volLevel -= level;
		System.out.println("라디오 볼륨 내리면"+volLevel);
	}
}
