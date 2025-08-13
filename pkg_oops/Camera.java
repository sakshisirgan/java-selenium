package pkg_oops;

public class Camera implements Recordable,Streamable {
	
	public void record() {
		// TODO Auto-generated method stub
		System.out.println("Camera recording video.");
		
	}
	public void stream() {
		System.out.println("Camera streaming video");
	}
}

