package Day5FunFriday;
import java.util.Scanner;

public class Q33 {
	public static void main(String[] args) {

		  	System.out.println("Enter range: \n");
		    Scanner s = new Scanner(System.in);
		    int r = s.nextInt();
		    int n = 0;

		  while (n <= r) {
		    if (n%2 == 0) {
		    	System.out.print(n + " ");
		    }
		    n++;
		    }
		  }
}
