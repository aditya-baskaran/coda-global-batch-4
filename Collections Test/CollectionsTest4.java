package Day13;

import java.util.HashMap;
import java.util.Map;

public class CollectionsTest4 {
	 public class AccountManager {
		 //private Map accountTotals = new HashMap();
		 private Map<String, Integer> accountTotals = new HashMap<String, Integer>();
		 private int retirementFund;
		 public int getBalance(String accountName) {
		 /*Integer total = (Integer) accountTotals.get(accountName);
		 if (total == null)
		 total = Integer.valueOf(0);
		 return total.intValue();*/
			 Integer total = accountTotals.get(accountName);
			 if (total == null) total = 0;
			 return total;
		 }
		 public void setBalance(String accountName, int amount) {
		 //accountTotals.put(accountName, Integer.valueOf(amount));
			 accountTotals.put(accountName, amount);
		 } }
}
