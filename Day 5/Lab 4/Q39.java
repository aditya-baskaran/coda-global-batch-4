package Day5FunFriday;
import java.util.Scanner;

public class Q39 {
	public static void main(String[] args) {
		System.out.println("Enter number:\n");
		Scanner a = new Scanner(System.in);
		System.out.println("Enter range:\n");
		Scanner b = new Scanner(System.in);
		
        int num, n, i = 1;
        num=a.nextInt();
        n=b.nextInt();
        
        while(i <= n)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
            i++;
        }
    }
}
