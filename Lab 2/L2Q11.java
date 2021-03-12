package Day5;

public class L2Q11 {
	public static void main(String[] args) {
        C3C c = new C3C(2);
        // object c creates object b, before that class A constructor called
        // for the sake of simplicity with package A,B,C will be called A1,B1,C3
    }
}

class A1A {
    A1A(int a) {
        System.out.println("A" + a);
    }
}

class B2B {
    B2B(int b) {
        System.out.println("B" + b);
    }
}

class C3C extends A1A {
    C3C(int c) {
        // expect a default constructor in base class A1A
        // for that super can be used to called Parametric constructor
        super(c);
        B2B b = new B2B(c);
    }
}
