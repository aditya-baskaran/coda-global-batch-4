package Day5FunFriday;

public class Q51 
{
	   int num = 100;
	   
	   public static void main(String args[])
	   {
		Subclass obj= new Subclass();
		obj.printNumber();	
	   }
}
	class Subclass extends Q51
	{
	   int num = 110;
	   void printNumber(){
		/* Note that instead of writing num we are
		 * writing super.num in the print statement
		 * this refers to the num variable of Superclass
		 */
		System.out.println(super.num);
	   }
}

