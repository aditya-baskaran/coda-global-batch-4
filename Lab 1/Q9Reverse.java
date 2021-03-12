package Day4;
import java.util.Scanner;

public class Q9Reverse {
	public static void main(String[] args) {  
        //Initialize array  
		Scanner sc = new Scanner(System.in);
		  int[] arr = new int[5];  
		  System.out.println("Enter five elements of the array: ");
		  int n = sc.nextInt();
		  for(int i=0; i<n; i++)  
		  {  
		  //reading array elements from the user   
		  arr[i]=sc.nextInt();  
		  }  
        //int [] arr = new int [] {1, 2, 3, 4, 5};  
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
        System.out.println("Array in reverse order: ");  
        //Loop through the array in reverse order  
        for (int i = arr.length-1; i >= 0; i--) {  
            System.out.print(arr[i] + " ");  
        }  
    }  
}
