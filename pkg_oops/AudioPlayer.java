package pkg_oops;

public class AudioPlayer implements Playable,Recordable {
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("AudioPlayer playing audio.");
	}
	public void record() {
		System.out.println("AudioPlayer recording audio.");
	
	}
}


