package Day5FunFriday;
import java.util.Scanner;

public class Q28 {
	public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter month (MM) : ");
		int month = sc.nextInt();
        String season;
        
        if(month == 12 || month == 1 || month == 2)
        {
            season = "Winter";
        }
        else if(month == 3 || month == 4 || month == 5)
        {
            season = "Spring";
        }
        else if(month == 6 || month == 7 || month == 8)
        {
            season = "Summer";
        }
        else if(month == 9 || month == 10 || month == 11)
        {
            season = "Autumn";
        }
        else
        {
            season = "Bogus Month";
        }
        
        System.out.println("It is in the " + season);
        
    }
}
