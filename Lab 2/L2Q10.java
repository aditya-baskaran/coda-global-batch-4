package Day5;

public class L2Q10 {
	 public static void main(String[] args) {
	        C3 c = new C3();
	        // object c creates object b, before that class A constructor called
	        // for the sake of simplicity with package A,B,C will be called A1,B1,C3
	    }
	}

	class A1 {
	    A1() {
	        System.out.println("A");
	    }
	}

	class B2 {
	    B2() {
	        System.out.println("B");
	    }
	}

	class C3 extends A1 {
	    B2 b = new B2();
}
