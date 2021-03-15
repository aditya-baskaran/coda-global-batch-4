package Day5FunFriday;

public class Q54 {
	 public static void main(String[] args) {
	        InterFaceImpl inf = new InterFaceImpl();
	        inf.printInt(10);
	    }
	}

	interface InterFace {
	    public void printInt(int x);
	}

	class InterFaceImpl implements InterFace {

	    public void printInt(int x) {
	        System.out.println("X : " + x);
	    }
}
