package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {
	
	public static void main(String[] args) {
		
		// creating an ArrayList and adding items in ArrayList
		ArrayList<String> list = new ArrayList<>();
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Chickoo");
		list.add("Kiwi");
		list.add("Guava");
		list.add("Cherry");
		
		System.out.println("Fruits added in the list are : " + list);
		System.out.println("Size of fruits array is: "+list.size());
		
		//accessing elements through index of an array using get() 
		System.out.println(list.get(3));
		
		//change items in ArrayList
		list.set(1, "Orange");
		System.out.println(list);
		
		//remove and clear the arraylist
		list.remove(3);
		System.out.println(list);
		
//		list.clear();
//		System.out.println(list);
		
		// loop through ArrayList
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// Or using forEach loop (Enhanced Loop)
		System.out.println();
		for(String fruits : list) {
			System.out.println(fruits);
		}
		
		// Sorting an ArrayList
		Collections.sort(list);
		System.out.println(list);
		
	}

}
