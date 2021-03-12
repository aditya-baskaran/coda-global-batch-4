package Day5;


public class L2Q13 extends AbClass {
    public static void main(String[] args) {
        // can't init abstract class
        // but can get the parent logic
        // AbClass ab = new AbClass().sayHello();
    }
}

abstract class AbClass {
    public void sayHello() {
        System.out.println("Hello");
    }
}