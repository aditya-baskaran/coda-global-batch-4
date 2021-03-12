package Day4;

public class Q24Quad {
	 public static void main(String[] args) {
	        Quad qu = new Quad(6, 7, 8);
	        System.out.println(qu.getA());
	        System.out.println(qu.getB());
	        System.out.println(qu.getC());
	        System.out.println(qu.compute(2));
	        qu.setABC(3, 2, 1);
	        System.out.println(qu.getA());
	        System.out.println(qu.getB());
	        System.out.println(qu.getC());
	        System.out.println(qu.compute(2));
	    }
	}

	class Quad {

	    int a, b, c;

	    public int getA() {
	        return a;
	    }

	    public int getB() {
	        return b;
	    }

	    public int getC() {
	        return c;
	    }

	    public void setABC(int a, int b, int c) {
	        this.a = a;
	        this.b = b;
	        this.c = c;
	    }

	    Quad() {
	        this.a = this.b = this.c = 1;
	    }

	    Quad(int a, int b, int c) {
	        this.a = a;
	        this.b = b;
	        this.c = c;
	    }

	    public int compute(int x) {
	        return ((this.a * x) * 2) + (b * x) + c;
	    }

}
