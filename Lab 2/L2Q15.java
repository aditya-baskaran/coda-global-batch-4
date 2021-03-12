package Day5;

public class L2Q15 {
	public static void main(String[] args) {
        House myHouse = new House(40, 20);
        System.out.println("House Cost = " + myHouse.getHouseCost());
    }
}

class House {
    Door door;
    Window window;
    int windowSqft, doorSqft;

    public House(int windowSqft, int doorSqft) {
        this.door = new Door();
        this.window = new Window();
        this.windowSqft = windowSqft;
        this.doorSqft = doorSqft;
    }

    int getHouseCost() {
        return this.door.getCost(this.doorSqft) + this.window.getCost(this.windowSqft);
    }
}

class Door {
    int getCost(int sqft) {
        return sqft * 8;
    }
}

class Window {
    int getCost(int sqft) {
        return sqft * 5;
    }
}