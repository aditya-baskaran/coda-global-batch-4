package Day13;

import java.util.ArrayList;
import java.util.List;

public class CollectionsTest1and2 {
	public static void main(String[] args) {
		// INSERT DECLARATION HERE
		List<List<Integer>> table = new ArrayList<List<Integer>>();
		for (int i = 0; i <= 10; i++) {
		List<Integer> row = new ArrayList<Integer>();
		for (int j = 0; j <= 10; j++)
		row.add(i * j);
		table.add(row);
		}
		for (List<Integer> row : table)
		System.out.println(row);
		}
}

// Q1: Answer: B
// Q2: Answer: C and D - It must return true in comparison, therefore it 'might' return true as well.