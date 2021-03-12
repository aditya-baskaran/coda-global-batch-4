package Day5;

public class L2Q5 {
		static int noOfObjects = 0; 

		// Instead of performing increment in the constructor 
		// instance block is preferred to make this program generic. 
		{ 
			noOfObjects += 1; 
		} 

		// various types of constructors 
		// that can create objects 
		public L2Q5() 
		{ 
		} 
		public L2Q5(int n) 
		{ 
		} 
		public L2Q5(String s) 
		{ 
		} 

		public static void main(String args[]) 
		{ 
			L2Q5 t1 = new L2Q5(); 
			L2Q5 t2 = new L2Q5(5); 
			L2Q5 t3 = new L2Q5("GFG"); 

			// We can also write t1.noOfObjects or 
			// t2.noOfObjects or t3.noOfObjects 
			System.out.println(L2Q5.noOfObjects); 
		} 
	} 

	