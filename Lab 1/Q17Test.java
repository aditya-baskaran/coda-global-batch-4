package Day4;

public class Q17Test {
	static final int a = 10;
	
	    public Q17(int aInt) {
	        System.out.println(aInt);
	    }

	    public static void main(String[] args) {

	        // final can't reassign
	        // a = 11;

	        // non-static method can't be referenced from static method
	        // sayHello();

	        // expected constructor not found should have to pass one param
	        //Q17 Q17 = new Q17();
	    }

	    private void sayHello() {
	        System.out.println("Hello");
	    }
	}
	
