package pkg_oops;

public class PlayerMain {
	public static void main(String[] args) {
		Playable audioPlay = new AudioPlayer();
		Recordable audioRecord= new AudioPlayer();
		
		Playable videoPlay = new VideoPlayer();
		Streamable videoStream = new VideoPlayer();
		
		Recordable cameraRecord = new Camera();
		Streamable cameraStream = new Camera();
		
//		 call all supported methods (play, record, stream) 
		
		audioPlay.play();
		audioRecord.record();
		
		videoPlay.play();
		videoStream.stream();
		
		cameraRecord.record();
		cameraStream .stream();

	}
}
