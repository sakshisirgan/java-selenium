package LinkedList;

import java.util.LinkedList;

public class LinkedListPractice {
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		list.add("Lotus");
		list.add("Tulip");
		list.add("Rose");
		list.add("Lily");
		list.add("Champa");
		list.add("Jasmine");
		list.add("Daisy");
		
		System.out.println(list);
		
		//methods for adding
		list.addFirst("Hibiscus");
		list.addLast("Mogra");
		System.out.println(list);
		
		//methods for removing
		list.removeFirst();
		list.removeLast();
		list.remove(2);
		System.out.println(list);
		
		//methods to get
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
	}
}
