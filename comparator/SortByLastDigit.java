package comparator;

//Sort the ArrayList According to the last 
//digit of the number 
//23 45 67 28 6 4
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class SortByLastDigit{
	public static void main(String[] args){
	ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(23,45,67,28,6,4));
	System.out.println("Before sorting the Original List: ");
	System.out.println(nums);
	//Using anonymous class
	nums.sort(new Comparator<Integer>(){
		public int compare(Integer a,Integer b){
			return Integer.compare(a%10,b%10); 
	}});
	System.out.println("After sorting the List: ");
	System.out.println(nums);
	//Using Lambda Expression
	System.out.println("Custom sorting using Comparator and  Lambda Expression");
	nums.sort((x,y)->Integer.compare(x%10,y%10));
	System.out.println(nums);

	}
}	
