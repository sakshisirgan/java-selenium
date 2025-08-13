package main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.*;

public class CollectionExample {

	// 1. Shuffle elements in an ArrayList
	public static List<Integer> shuffleElements(List<Integer> element) {
		List<Integer> result = new ArrayList<>(element);
		Collections.shuffle(result);
		return result;
	}

	// 2. Extract a portion of an ArrayList
	public static List<String> extractSubList(List<String> list, int from, int to) {
		return new ArrayList<>(list.subList(from, to));
	}

	// 4. Replace the second element in an ArrayList
	public static List<String> replaceSecondItem(List<String> list, String secondItem) {
		List<String> result = new ArrayList<>(list);
		if (result.size() > 1) {
			result.set(1, secondItem);
		}
		return result;
	}

	// 7. Clone a HashSet to another HashSet
	public static Set<String> cloneHashSet(Set<String> beforeClone) {
		return new HashSet<>(beforeClone);
	}

	// 8. Convert a HashSet to a TreeSet
	public static Set<String> convertToTreeSet(Set<String> hashSet) {
		return new TreeSet<>(hashSet);
	}

	// 10. Get keys from a map
	public static Set<String> getMapKeys(Map<String, String> map) {
		return map.keySet();
	}
}
