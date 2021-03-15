package Day5FunFriday;

public class Q50 {
	//single inheritance
	public void methodA()
	   {
	     System.out.println("Base class method");
	   }
	}
	class B extends Q50
	{
	   public void methodB()
	   {
	     System.out.println("Child class method");
	   }
	}
	
//multiple inheritance	
	class X
	   {
	      public void methodX()
	      {
	        System.out.println("Class X method");
	      }
	   }
	   
	   class Y extends X
	   {
	   public void methodY()
	   {
	   System.out.println("class Y method");
	   }
	   }
	   
	   class Z extends Y
	   {
	      public void methodZ()
	      {
	        System.out.println("class Z method");
	      }
	       
	   public static void main(String args[])
	      {
	    	B obj = new B();
	 	    obj.methodA(); //calling super class method
	 	    obj.methodB(); //calling local method
	 	    
	        Z obj1 = new Z();
	        obj1.methodX(); //calling grand parent class method
	        obj1.methodY(); //calling parent class method
	        obj1.methodZ(); //calling local method
	     }
}
