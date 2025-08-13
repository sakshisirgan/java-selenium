// First Approach

package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 
class StudentMain {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<>();
		list.add(new Student("Reema",28));
		list.add(new Student("Seema",16));
		list.add(new Student("Priya",30));
		
		//FirstApproach
		//SortByAge
		
		System.out.println("Before sorting: The age of the Students");
		for(Student sage:list) {
			System.out.println(sage.getAge());
		}
		System.out.println("After sorting: The age of the Students");
		Collections.sort(list,new AgeComparator());
		for(Student sage:list) {
			System.out.println(sage.getAge());
		}
		//SortByName
		System.out.println("Before sorting: The name of the Students");
		for(Student name:list) {
			System.out.println(name.getName());
		}
		System.out.println("After sorting: The name of the Students");
		Collections.sort(list, new NameComparator());
		for(Student name:list) {
			System.out.println(name.getName());
		}
	
		//Second Approach
		//Using Anonymous class
		System.out.println("\nUsing Anonymous class --------------------------------------");
		System.out.println("After sorting: The age of the Students...");
		Collections.sort(list,new Comparator<Student>() {
			public int compare(Student s1,Student s2) {
				return Integer.compare(s1.getAge(), s2.getAge());
			}});
		for(Student sage:list) {
			System.out.println(sage.getAge());
		}
		
		 System.out.println("\nSorting by Name:");
	        Collections.sort(list, new Comparator<Student>() {
	            public int compare(Student s1, Student s2) {
	                return s1.getName().compareTo(s2.getName());
	            }
	        });
	        for (Student s : list) {
	            System.out.println(s);
	        }
		
		//Third Approach
		//Using Lambda Expression
	    System.out.println("\nUsing Lambda Expression --------------------------------------");
	    list.sort((s1,s2)->Integer.compare(s1.getAge(),s2.getAge()));
//		// To iterate the elements of the ArrayList
		list.forEach(System.out::println);
		
		System.out.println("\nSorting by Name:");
        list.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
        list.forEach(System.out::println);
	}
 
}