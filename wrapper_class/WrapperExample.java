package wrapper_class;

public class WrapperExample {
	public static void main(String[] args) {
		
//		ArrayList<Integer> list = new ArrayList<>();
//		list.add(10);
		
		int x = 10;
		
		Integer ibox = x;              // autoboxing or 
//		Integer iboxx = Integer.valueOf(10); 
		System.out.println("Autoboxing: "+ibox);
		
		int unbox = ibox;
		System.out.println("Auto-Unboxing:"+ unbox);
		
		
	}
}
