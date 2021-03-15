package Day5FunFriday;
import java.util.Random;

public class Q45 {
	public static void main(String[] args) {
        Bank myAccount = new Bank("Aditya Baskaran", AcType.SALARY);
        myAccount.display();
        System.out.println("Balance : " + myAccount.getAcBalance());
        myAccount.deposit(250000);
        myAccount.display();
    }
	
}

enum AcType {
    SAVING,
    SALARY,
    FD,
    RD,
    NRI
}
	class Bank {
	    String name;
	    String acNumber;
	    AcType acType;
	    double acBalance;

	    Bank(String name, AcType acType) {
	        this.name = name;
	        this.acType = acType;
	        this.acNumber = String.format("%04d", new Random().nextInt(10000));
	        this.acBalance = 120000.0D;
	    }

	    public double deposit(double amount) {
	        this.acBalance += amount;
	        return this.acBalance;
	    }

	    public double getAcBalance() {
	        return this.acBalance;
	    }

	    public void display() {
	        System.out.println("Account Holder Name : " + this.name);
	        System.out.println("Account Number : " + this.acNumber);
	        System.out.println("Account Type : " + this.acType);
	        System.out.println("Account Balance : " + this.acBalance);
	    }
}
//Q46 MOD ALSO ATTACHED