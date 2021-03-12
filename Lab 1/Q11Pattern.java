package Day4;
import java.util.Scanner;

public class Q11Pattern {
/*	//opening of class
	    public static void main(String args[])
	    {//opening of main
	        Scanner sc=new Scanner(System.in);
	        int n,i,j,a[][];
	        //taking user's input.
	        System.out.println("HOW MANY STEPS?");
	        n=sc.nextInt();
	        a=new int[n][n];
	        //filling the 2D matrix.
	        for(i=0;i<n;i++){
	            for(j=0;j<=i;j++)
	                if(j==0 || j==i)
	                    a[i][j]=1;
	                else
	                    a[i][j]=a[i-1][j-1]+a[i-1][j];
	        }
	        //displaying the Pascal's Triangle as the output.
	        System.out.println("\nOUTPUT:\n");
	        for(i=0;i<n;i++)
	        {
	            for(j=0;j<=i;j++)
	                System.out.print(a[i][j]+"\t");

	            System.out.println();
	        }
	    }//clossing of main*/
	
	public static void main(String[] args) {
        //2-d array initialised with values    
       int[][] intArray = { {1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}}; 
       //print the array
//       System.out.println("Initialized Two dimensional array:");
       for (int i = 0; i < intArray.length; i++) { 
           for (int j = 0; j < intArray.length; j++) { 
           System.out.print(intArray [i][j] + "\t"); 
           } 

           System.out.println(); 
       } 
	}

	}//closing of class	}
