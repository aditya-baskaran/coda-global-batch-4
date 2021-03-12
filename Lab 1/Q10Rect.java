package Day4;

public class Q10Rect {
	/*int twodarr[][]= {
			{1,2,3,4},
			{5,6,7,8},
			{4,5,6,7}
	};
	int twodarr2[][]= new int[3][4];//three rows four columns
	for(int i=0;i<twodarr2.length;i++) {//this will give you length of rows...
		for(int j=0;j<twodarr2[i].length;j++) {//this will give length of columns in that row
		}
	}
	
	for(int i[]:twodarr) {
		for(int j:i) {
			System.out.print(j+"\t");
		}
		System.out.println();
	}
}*/
	
	public static void main(String[] args) {
        //2-d array initialised with values    
       int[][] intArray = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}}; 
       //print the array
//       System.out.println("Initialized Two dimensional array:");
       for (int i = 0; i < 4; i++) { 
           for (int j = 0; j < 4; j++) { 
           System.out.print(intArray [i][j] + "\t"); 
           } 

           System.out.println(); 
       } 
	}
}
