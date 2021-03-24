package Day13;
import java.util.*;

public class CollectionsTest24 {
	int size; CollectionsTest24(int s) { size = s; } 

	public static void main(String[] args) {
		TreeSet<Integer> i = new TreeSet<Integer>();
		TreeSet<CollectionsTest24> d = new TreeSet<CollectionsTest24>();

		d.add(new CollectionsTest24(1)); d.add(new CollectionsTest24(2)); d.add(new CollectionsTest24(1));
		i.add(1); i.add(2); i.add(1);
		System.out.println(d.size() + " " + i.size());
	}
}
//Q24: Answer: F