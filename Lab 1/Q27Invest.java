package Day4;
import java.util.Scanner;

public class Q27Invest {
/*	 public static void main(String[] args) {
	    Scanner in = new Scanner(System.in); 
	    System.out.print("Input the investment amount: ");
	 	double investment = in.nextDouble();
	 	System.out.print("Input the rate of interest: ");
		double rate = in.nextDouble();
		System.out.print("Input number of years: ");
		int year = in.nextInt();
		
		rate *= 0.01;
		
		System.out.println("Years    FutureValue");
		for(int i = 1; i <= year; i++) {
	    	int formatter = 19;
		    if (i >= 10) formatter = 18;
			System.out.printf(i + "%"+formatter+".2f\n", futureInvestmentValue(investment, rate/12, i));
	       }
		 }
	 
	 public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
			return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
		}*/
		 public static void main(String[] args) {
		        Bank bank = new Bank();
		        bank.invest(14000);
		        bank.plPercent(40);
		        bank.plValue(-1500);
		        bank.plPercent(12);
		        System.out.println(bank.getAmount());
		    }
		}

		class Bank {
		    int amount;

		    public void invest(int amount) {
		        this.amount = amount;
		    }

		    public void plValue(int value) {
		        this.amount += value;
		    }

		    public void plPercent(int value) {
		        this.amount += (this.amount * value) / 100;
		    }

		    public int getAmount() {
		        return amount;
		    }
	}

