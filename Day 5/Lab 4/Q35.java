package Day5FunFriday;

public class Q35 {
	public static void main(String args[])
    {
        
        int i, j;
        
        i = 100;
        j = 200;
        
        // find midpoint between i and j
        while(++i < --j);    // there is no body in this loop
        
        System.out.println("Midpoint is " + i);
        
    }
}
