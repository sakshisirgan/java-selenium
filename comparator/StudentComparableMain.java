package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StudentComparableMain {

	  public static void main(String[] args) {

	      List<StudentComparable> list = new ArrayList<>();

	      list.add(new StudentComparable (3, "Garry"));

	      list.add(new StudentComparable (1, "Jane"));

	      list.add(new StudentComparable (2, "Jackson"));

		Collections.sort(list); 

	//By default the sort() static method of Collections class internally calls    //compareTo() method //to compare the 2 objects.

	      for (StudentComparable  s : list) {

	          System.out.println(s);

	      }

	  }

}
