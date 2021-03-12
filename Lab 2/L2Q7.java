package Day5;

public class L2Q7 {
		// a final variable 
		// direct initialize 
		final int THRESHOLD = 5; 
		
		// a blank final variable 
		final int CAPACITY; 
		
		// another blank final variable 
		final int MINIMUM; 
		
		// a final static variable PI 
		// direct initialize 
		static final double PI = 3.141592653589793; 
		
		// a blank final static variable 
		static final double EULERCONSTANT; 
		
		// instance initializer block for 
		// initializing CAPACITY 
		{ 
			CAPACITY = 25; 
		} 
		
		// static initializer block for 
		// initializing EULERCONSTANT 
		static{ 
			EULERCONSTANT = 2.3; 
		} 
		
		// constructor for initializing MINIMUM 
		// Note that if there are more than one 
		// constructor, you must initialize MINIMUM 
		// in them also 
		public L2Q7() 
		{ 
			MINIMUM = -1; 
		} 
		
		public static void main(String[] args)  
	    { 
	        // a final reference variable sb 
	        final StringBuilder sb = new StringBuilder("Aditya"); 
	          
	        System.out.println(sb); 
	          
	        // changing internal state of object 
	        // reference by final reference variable sb 
	        sb.append("Baskaran"); 
	          
	        System.out.println(sb); 
	    }     
	} 
