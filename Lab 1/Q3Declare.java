package Day4;

public class Q3Declare {
	   static int d = 100;
	   static double b = d;
	   static long e = (long)b;
	   static float c = e;
	   static int f = (int)e;
	   public static void main(String[] args) {
	      System.out.println("Double = " + b);
	      System.out.println("Float = " + c);
	      System.out.println("Int = " + d);
	      System.out.println("Long = " + e);
	      System.out.println("Long conv int= " + f);
}
}
