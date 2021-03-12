package Day5;
import java.util.Date;
public class L2Q3 {
	public static void main(String[] args) {
	        Employee emp = new Employee(50, "Aditya Baskaran");
	        emp.ID();
	    }
	}

	class Employee {
	    protected Date doj;
	    protected double hours;
	    protected double pay;
	    protected String name;

	    Employee(double hours, String name) {
	        this.doj = new Date();
	        this.hours = hours;
	        this.name = name;
	    }

	    public Employee() {

	    }

	    void ID() {
	        System.out.println("Worker");
	    }
	}

	class SalesPerson extends Employee {
	    double hourlyRate = 12.2;

	    SalesPerson() {
	        System.out.println("Sales Person");
	    }

	    void ID() {
	        System.out.println("Sales Person");
	    }
	}

	class Worker extends Employee {
	    double hourlyRate = 8.2;

	    Worker() {
	        System.out.println("Worker");
	    }

	    void ID() {
	        System.out.println("Worker");
	    }
	}

	class SalesManager extends SalesPerson {
	    double hourlyRate = 22.2;

	    SalesManager() {
	        System.out.println("Sales Manager");
	    }

	    void ID() {
	        System.out.println("Sales Manager");
	    }
	}

	class SalesTerritoryManager extends SalesManager {
	    double hourlyRate = 42.2;

	    public SalesTerritoryManager() {
	        System.out.println("Sales Manager");

	    }

	    void ID() {
	        System.out.println("Sales Manager");
	    }
}
