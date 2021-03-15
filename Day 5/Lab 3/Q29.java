package Day5FunFriday;
import java.util.*;

public class Q29 {
	public static void main(String[] args)
	{
	System.out.print("\n Enter Character: ");
	Scanner inp =new Scanner(System.in);
	char c=((inp.nextLine()).charAt(0));
	char z=Character.toUpperCase(c); //Changing Value to UpperCase for uniformity.

	switch(z) //Checking Vowel Character using Switch Case
	{
	case 'A':
	case 'E':
	case 'I':
	case 'O':
	case 'U': System.out.println(c+" is a Vowel.");
	break;

	default: System.out.println(c+" is a Non-Vowel Character.");
	}

	}
}
