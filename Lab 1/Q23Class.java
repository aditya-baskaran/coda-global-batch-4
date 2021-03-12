package Day4;

public class Q23Class {
	 public static void main(String[] args) {
	        Emp emp = new Emp();
	        emp.setWorking(true);
	        System.out.println(emp.isWorking());
	    }
	}

	class Employee2 {
	    protected boolean isWorking;
	}

	class Emp extends Employee2 {
	    public boolean isWorking() {
	        return isWorking;
	    }

	    public void setWorking(boolean working) {
	        isWorking = working;
	    }
}
