package Day5;

public class L2Q12 {
	public static void main(String[] args) {
        Wipro[] objs = {new Wipro(), new WiproTechnologies(), new WiproInfotech(), new WiproBPO()};
        for (Wipro obj : objs) {
            // all the methods are override based of class
            obj.ID();
        }
    }
}

class Wipro {
    void ID() {
        System.out.println("Wipro");
    }
}

class WiproTechnologies extends Wipro {
    void ID() {
        System.out.println("Wipro Technologies");
    }
}

class WiproInfotech extends Wipro {
    void ID() {
        System.out.println("Wipro Infotech");
    }
}

class WiproBPO extends Wipro {
    void ID() {
        System.out.println("Wipro BPO");
    }
}
