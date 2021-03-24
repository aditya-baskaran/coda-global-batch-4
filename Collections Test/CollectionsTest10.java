package Day13;
import java.util.PriorityQueue;

public class CollectionsTest10 {
	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("2");
		pq.add("4");
		System.out.print(pq.peek() + " ");
		pq.offer("1");
		pq.add("3");
		pq.remove("1");
		System.out.print(pq.poll() + " ");
		if(pq.remove("2")) 
			System.out.print(pq.poll() + " ");
		System.out.println(pq.poll() + " " + pq.peek());
	}
}


//Q10: Answer: B

//Q repeated as 19