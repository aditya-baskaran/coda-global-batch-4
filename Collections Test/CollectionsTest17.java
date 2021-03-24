package Day13;
import java.util.*;

public class CollectionsTest17 {
	public static void main(String[] args) {
	Map<ToDos2, String> m = new HashMap<ToDos2, String>();
	ToDos2 t1 = new ToDos2("Monday");
	ToDos2 t2 = new ToDos2("Monday");
	ToDos2 t3 = new ToDos2("Tuesday");
	m.put(t1, "doLaundry");
	m.put(t2, "payBills");
	m.put(t3, "cleanAttic");
	System.out.println(m.size());
	}
}
class ToDos2{
String day;
ToDos2(String d) { day = d; }
public boolean equals(Object o) {
return ((ToDos2)o).day == this.day;
}
// public int hashCode() { return 9; }
}

//Q17: Answer: C