package HashMap;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		//Integer is key and String is Value
		HashMap<Integer, String> student = new HashMap<Integer, String>();
		student.put(1, "Lara");
		student.put(2, "Marie");
		student.put(3, "David");
		student.put(4, "Lisa");
		student.put(5, "John");
		
		System.out.println(student);
		
		//access an item from Hashmap using get()
		System.out.println(student.get(4));                  //using key
		
		//remove an item from Hashmap
		student.remove(1);
		System.out.println(student);
		
		//clear
//		student.clear();
//		System.out.println(student);
		
		//size of hashmap
		System.out.println(student.size());
		
		// loop thorugh Hashmap
		System.out.println("------------");
		for(Integer i : student.keySet()) {
			//System.out.println(i);
			System.out.println("Key:" + i +" " +"Value:" + student.get(i));
		}
	}
}
