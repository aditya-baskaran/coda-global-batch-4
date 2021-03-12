package Day4;
import java.util.*;
import java.util.Scanner;

public class Q8Find {
	// Java program to find index of
	// an element in N elements
		// Linear-search function to find the index of an element
		public static int findIndex(int arr[], int t)
		{

			// if array is Null
			if (arr == null) {
				return -1;
			}

			// find length of array
			int len = arr.length;
			int i = 0;

			// traverse in the array
			while (i < len) {

				// if the i-th element is t
				// then return the index
				if (arr[i] == t) {
					return i;
				}
				else {
					i = i + 1;
				}
			}
			return -1;
		}

		// Driver Code
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			  int[] array = new int[5];  
			  System.out.println("Enter array size: ");
			  int n = sc.nextInt();
			  for(int i=0; i<n; i++)  
			  {  
			  //reading array elements from the user   
			  array[i]=sc.nextInt();  
			  }  

			  Scanner sa = new Scanner(System.in);
			  System.out.println("Enter number 1 :");
			  int a = sa.nextInt();
			  Scanner sb = new Scanner(System.in);
			  System.out.println("Enter number 2 :");
			  int b = sb.nextInt();
			// find the index of 5
			System.out.println("Index position of 1st is: "
							+ findIndex(array, a));

			// find the index of 7
			System.out.println("Index position of 2nd is: "
							+ findIndex(array, b));
		}
	}