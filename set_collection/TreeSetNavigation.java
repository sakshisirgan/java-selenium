package set_collection;

import java.util.TreeSet;

public class TreeSetNavigation {
	   public static void main(String[] args) {
		      TreeSet<Integer> tree = new TreeSet<>();
		 
		       tree.add(10);
		       tree.add(20);
		       tree.add(30);
		       tree.add(40);
		 
		      System.out.println("TreeSet: " + tree);
		 
		      System.out.println("First: " + tree.first());       // 10
		      System.out.println("Last: " + tree.last());         // 40
		      System.out.println("Higher than 20: " + tree.higher(20)); // 30
		      System.out.println("Lower than 20: " + tree.lower(20));   // 10
		      System.out.println("Ceiling of 25: " + tree.ceiling(25)); // 30
		      System.out.println("Floor of 25: " + tree.floor(25));     // 20
		   }

}
