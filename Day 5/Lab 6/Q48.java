package Day5FunFriday;

public class Q48 {
	public static void main(String[] args) {
        Add add = new Add();
        System.out.println(add.Add(1, 2));
        System.out.println(add.Add(1, 2, 3));
        System.out.println(add.Add(1, 2, 3, 4));
    }
}

class Add {
    int Add(int a, int b) {
        return a + b;
    }

    int Add(int a, int b, int c) {
        return a + b + c;
    }

    int Add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
