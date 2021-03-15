package Day5FunFriday;

public class Q52 {
 public static void main(String[] args){
	 Bank[] users = new Bank[5];
     for (int i = 0; i < 5; i++) {
         users[i] = new Bank("USER-" + i, AcType.SALARY);
         users[i].deposit(100 - i);
         users[i].display();
		  }
}
}

//Q53 util.ArrayList can be used to assign values to array instead of directly defining it.