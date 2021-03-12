package Day4;
import java.util.Scanner;

public class Q13Student {
	 public static void main(String args[])
	   {    
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of students : ");
		int row=sc.nextInt();
		System.out.println("Enter number of subjects : ");
		int column=sc.nextInt();
		int a[][]=new int[row][column];//declaration    	 
		System.out.print("Enter " + row*column + " Marks of each student per subject :\n");
	        for (int i = 0; i < row; i++)
		{
		    for(int j = 0; j < column; j++)
		    {
	           	a[i][j] = sc.nextInt();
		    }
		}   
	        System.out.print("Class Grade Sheet :\n");
	        for (int i = 0; i < row; i++)
		{
		    for(int j = 0; j < column; j++)
		    {
		       System.out.println("Student ["+i+"]:  Subject ["+j+"] :"+a[i][j]);
	 	    }
		}  
	   }
}
