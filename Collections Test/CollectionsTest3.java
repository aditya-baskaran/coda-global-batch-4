package Day13;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsTest3 {
	public static void before() {
		Set set = new TreeSet(); 
		set.add("2");
	set.add(3);
	set.add("1");
	Iterator it = set.iterator(); 
	while (it.hasNext())
		System.out.print(it.next() + " ");
}
}


//A: The program will not compile as main() is not present.