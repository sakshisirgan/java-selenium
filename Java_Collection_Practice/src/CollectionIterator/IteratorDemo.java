package CollectionIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		
		ArrayList<String> continentName = new ArrayList<>(); //duplicates allowed and preserves insertion order
		continentName.add("Asia");
		continentName.add("North America");
		continentName.add("Africa");
		continentName.add("Europe");
		continentName.add("Antartica");
		continentName.add("South America");
		continentName.add("Austraila");
		
		System.out.println(continentName);
		
		// Iterator
		Iterator<String> iterate = continentName.iterator();
		System.out.println(iterate);
		System.out.println(iterate.next());  //always will print first item from list
		
		//loop thorugh collection
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
		}
	}
}
