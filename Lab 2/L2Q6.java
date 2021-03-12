package Day5;

public class L2Q6 {
	/*L2Q6(int x) 
    { 
        System.out.println("ONE argument constructor"); 
    } 
	L2Q6() 
    { 
        System.out.println("No  argument constructor"); 
    } 	
	static
		{ 
			System.out.println("1st static init"); 
		} 

		{ 
			System.out.println("1st instance init"); 
		} 

		{ 
			System.out.println("2nd instance init"); 
		} 

		static
		{ 
			System.out.println("2nd static init"); 
		} 

		public static void main(String[] args) 
		{ 
			new L2Q6(); 
			new L2Q6(8); 
		}*/
	
	//  
	static int i; 
		int j; 
		
		// start of static block 
		static { 
			i = 10; 
			System.out.println("static block called "); 
		} 
		// end of static block 

		public static void main(String args[]) { 

			// Although we don't have an object of Test, static block is 
			// called because i is being accessed in following statement. 
			System.out.println(L2Q6.i); 
		} 
	} 

