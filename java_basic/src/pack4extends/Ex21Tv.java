package pack4extends;

public class Ex21Tv implements Ex21Volume {
	private int volLevel;
	public Ex21Tv() {
		volLevel = 0;		
	}
@Override
	public void volumeUp(int level) {
		volLevel += level;
		System.out.println("Tv 소리 올리면"+volLevel);
	}
@Override
	public void volumeDown(int level) {
		volLevel -= level;
		System.out.println("Tv 소리 내리면"+volLevel);
	}
}
