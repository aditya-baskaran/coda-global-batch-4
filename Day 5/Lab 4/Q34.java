package Day5FunFriday;
import java.util.Scanner;

public class Q34 {
	public static void main(String[] args) {

	  	System.out.println("Enter range: \n");
	    Scanner s = new Scanner(System.in);
	    int r = s.nextInt();
	    int n = 0, sum=0, i=0;

	  while (n < r) {
	    if (n%2 == 1) {
	    	sum+=n;
	    	i++;
	    }
	    n++;
	    }
	  float a = sum/i;
	  System.out.print("Average =" + a);
	  }
}
