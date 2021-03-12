package Day5;

public class L2Q8 {
		// static variable single_instance of type Singleton 
		private static L2Q8 single_instance = null; 

		// variable of type String 
		public String s; 

		// private constructor restricted to this class itself 
		private L2Q8() 
		{ 
			s = "Hello I am a string part of Singleton class"; 
		} 

		// static method to create instance of Singleton class 
		public static L2Q8 getInstance() 
		{ 
			if (single_instance == null) 
				single_instance = new L2Q8(); 

			return single_instance; 
		}  

		public static void main(String args[]) 
		{ 
			// instantiating Singleton class with variable x 
			L2Q8 x = L2Q8.getInstance(); 

			// instantiating Singleton class with variable y 
			L2Q8 y = L2Q8.getInstance(); 

			// instantiating Singleton class with variable z 
			L2Q8 z = L2Q8.getInstance(); 

			// changing variable of instance x 
			x.s = (x.s).toUpperCase(); 

			System.out.println("String from x is " + x.s); 
			System.out.println("String from y is " + y.s); 
			System.out.println("String from z is " + z.s); 
			System.out.println("\n"); 

			// changing variable of instance z 
			z.s = (z.s).toLowerCase(); 

			System.out.println("String from x is " + x.s); 
			System.out.println("String from y is " + y.s); 
			System.out.println("String from z is " + z.s); 
		} 
	} 
