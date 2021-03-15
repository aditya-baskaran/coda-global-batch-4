package Day5FunFriday;
import java.util.Scanner;

public class Q36 {
	public static void main(String[] args) {

		int rem, rev= 0, temp;
		System.out.println("Choose 1 for number, 2 for string");
		Scanner a = new Scanner(System.in);
		int entry = a.nextInt();
		switch(entry)
		{
		case 1:
			System.out.println("Enter number");
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			temp = n;
			while( n != 0 )
			{
			rem= n % 10;
			rev= rev * 10 + rem;
			n=n/10;
			}

			// palindrome if orignalInteger(temp) and reversedInteger(rev) are equal
			if (temp == rev)
			System.out.println(temp + " is a palindrome.");
			else
			System.out.println(temp + " is not a palindrome.");
			break;
			
		case 2:
			System.out.println("Enter string:");
			Scanner j = new Scanner(System.in);
			checkPalindrome(j.next());
			}
			}
	
	public static void checkPalindrome(String s)
	{
	// reverse the given String
	String reverse = new StringBuffer(s).reverse().toString();
	 
	// checks whether the string is palindrome or not
	if (s.equals(reverse))
	System.out.println("Yes, it is a palindrome");
	 
	else
	System.out.println("No, it is not a palindrome");
	}	
}
	
