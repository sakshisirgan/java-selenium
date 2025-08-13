package pkg_oops;

public class VideoPlayer implements Playable,Streamable{
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("VideoPlayer playing video");
	}
	public void stream() {
		System.out.println("VideoPlayer streaming video");
	}

}


