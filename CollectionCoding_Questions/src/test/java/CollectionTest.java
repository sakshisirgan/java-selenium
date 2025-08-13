package test.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import main.java.CollectionExample;

public class CollectionTest {

    @Test
    public void testShuffleList() {
        List<Integer> element = Arrays.asList(3, 4 , 5, 6);
        List<Integer> shuffled = CollectionExample.shuffleElements(element);
        assertEquals(4, shuffled.size());
        System.out.println(shuffled);
        assertTrue(shuffled.containsAll(element));
    }

    @Test
    public void testSubList() {
        List<String> list = Arrays.asList("A", "B", "C", "D", "E");
        List<String> subList = CollectionExample.extractSubList(list, 2, 4);
        List<String> expected = Arrays.asList("C", "D");
        System.out.println(subList);
        assertEquals(expected, subList);
    }

    @Test
    public void testReplaceSecondItem() {
        List<String> list = Arrays.asList("Rose", "Tulip", "Lily");
        List<String> replaced = CollectionExample.replaceSecondItem(list, "Champa");
        List<String> expected = Arrays.asList("Rose", "Champa", "Lily");
        System.out.println(replaced);
        assertEquals(expected, replaced);
    }

    @Test
    public void testHashSet() {
        Set<String> beforeClone = new HashSet<>(Arrays.asList("Red", "Green", "Blue"));
        Set<String> afterClone = CollectionExample.cloneHashSet( beforeClone);
        assertEquals(beforeClone.size(), afterClone.size());
        System.out.println(afterClone);
        assertTrue(afterClone.containsAll(beforeClone));
    }

    @Test
    public void testConvertSet() {
        Set<String> hashSet = new HashSet<>(Arrays.asList("", "Apple", "Mango"));
        Set<String> output = CollectionExample.convertToTreeSet(hashSet);
        List<String> expected = Arrays.asList("Apple", "Mango", "Zebra");
        System.out.println(output);
        assertEquals(expected, output); 
    }

    @Test
    public void testGetKeysMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Java", "Language");
        map.put("Selenium", "Language");
        Set<String> keys = CollectionExample.getMapKeys(map);
        System.out.println(keys);
        assertEquals(2, keys.size());
        assertTrue(keys.contains("Java"));
        assertTrue(keys.contains("Selenium"));
    }
}
