package Day5;

public class L2Q9 {
	public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}

class A {
    private int aInt;
    public String aString;
    protected boolean aBoolean;
    char aChar;
}

class B extends A {
    byte aByte;
    long aLong;

    public void display() {
        System.out.println(aString);
        // can't access private  field
        // System.out.println(aInt);
        System.out.println(aBoolean);
        System.out.println(aChar);
        System.out.println(aByte);
        System.out.println(aLong);

    }
}
