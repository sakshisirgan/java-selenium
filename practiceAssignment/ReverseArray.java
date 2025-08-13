// 4. Write a java program to reverse an array.

package practiceAssignment;

public class ReverseArray {

    int[] arr;

    public ReverseArray() {
        arr = new int[] {11, 12, 13, 14, 15};
    }
    
    public void originalArray() {
        System.out.print("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
    }

    public void reversedArray() {
        System.out.print("Reversed Array: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
       System.out.println();
    }           
}

