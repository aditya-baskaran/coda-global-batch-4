package Day13;
import java.util.*;

public class CollectionsTest18 {
	int size;
	public CollectionsTest18(int s) { size = s; }
	public boolean equals(Object o) { return (this.size == ((CollectionsTest18)o).size); } 
	// insert code here
	//public int hashCode() { return size/5; }
	// no hashCode method declared


	public class TurtleTest {
		public void main(String[] args) {
			LinkedHashSet<CollectionsTest18> t = new LinkedHashSet<CollectionsTest18>();
			t.add(new CollectionsTest18(1)); t.add(new CollectionsTest18(2)); t.add(new CollectionsTest18(1)); 
			System.out.println(t.size());
		}
	}
}


//Q18: Answer: B
//same as 21