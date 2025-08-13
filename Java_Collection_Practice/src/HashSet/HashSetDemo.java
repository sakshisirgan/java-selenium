package HashSet;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		
		HashSet<String> stateName = new HashSet<String>(); // does not follow insertion order
		stateName.add("Maharashtra");
		stateName.add("Karnataka");
		stateName.add("Madhya Pradesh");
		stateName.add("Rajasthan");
		stateName.add("Rajasthan");    // it won't add Rajasthan again bcoz SET doesn't allow duplicates
		stateName.add("Goa");
		
		System.out.println(stateName);
		
		System.out.println(stateName.contains("Rajasthan"));
		System.out.println(stateName.contains("Gujrat"));
		
		//remove and clear
		stateName.remove("Goa");
		System.out.println(stateName);
		
//		stateName.clear();
//		System.out.println(stateName);
		
		//size
		System.out.println(stateName.size());
		
		//loop through HashSet
		for(String i : stateName) {
			System.out.println(i);
		}
	}
}
