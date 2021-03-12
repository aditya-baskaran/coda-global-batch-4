package Day5;

public class L2Q2 {
	double real, img;
	
	   //constructor to initialize the complex number
		L2Q2(double r, double i){
		this.real = r;
		this.img = i;
	   }
		
	   public static L2Q2 sum(L2Q2 c1, L2Q2 c2)
	   {
		//creating a temporary complex number to hold the sum of two numbers
		   L2Q2 temp = new L2Q2(0, 0);

	        temp.real = c1.real + c2.real;
	        temp.img = c1.img + c2.img;
	        
	        //returning the output complex number
	        return temp;
	    }
	    public static void main(String args[]) {
	    	L2Q2 c1 = new L2Q2(5.5, 4);
	    	L2Q2 c2 = new L2Q2(1.2, 3.5);
	    	L2Q2 temp = sum(c1, c2);
	        System.out.printf("Sum is: "+ temp.real+" + "+ temp.img +"i");
	    }
}
