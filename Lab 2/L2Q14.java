package Day5;
import java.io.*; 
import java.util.*; 
import java.lang.*; 

public class L2Q14 {
	/*int rollno;
	String name;
	int number_of_subjects;
	int mark[];

	L2Q14(int roll,String stud_name,int noofsub)throws IOException
	{
	rollno=roll;
	name=stud_name;
	number_of_subjects= noofsub;
	getMarks(noofsub);
	}

	public void getMarks(int nosub) throws IOException
	{
	mark=new int[nosub];
	BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
	for (int i=0; i<nosub;i++)
	{
	System.out.println("Enter "+i+"Subject Marks.:=> ");
	mark[i]=Integer.parseInt(br.readLine());
	System.out.println("");
	}

	}
	public void exam()
	{
	double percentage=0;
	String grade;
	int tmarks=0;
	for (int i=0;i<mark.length;i++)
	{
	tmarks+=mark[i];
	}
	percentage=tmarks/number_of_subjects;
	System.out.println("Roll Number :=> " + rollno);
	System.out.println("Name Of Student is :=>" + name);
	System.out.println("Number Of Subject :=>" +number_of_subjects);
	System.out.println("Percentage Is :=>" +percentage);

	if (percentage>=70)
	System.out.println("First Class With Distinction");
	else if(percentage>=60 && percentage<70)
	System.out.println("First Class");
	else if(percentage>=50 && percentage<60)
	System.out.println("Second Class");
	else if(percentage>=40 && percentage<50)
	System.out.println("Pass");
	else
	System.out.println("Fail");
	}
	}
	
	class result
	{
	public void main(String args[])throws IOException
	{
	int rno,no,nostud;
	String name;
	BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
	System.out.println("Enter How many Students:=>");
	nostud=Integer.parseInt(br.readLine());
	L2Q14 s[]=new L2Q14[nostud];

	for(int i=0;i<nostud;i++)
	{
	System.out.println("Enter Roll Number:=>");
	rno=Integer.parseInt(br.readLine());
	System.out.println("Enter Name:=>");
	name=br.readLine();
	System.out.println("Enter No of Subject:=>");
	no=Integer.parseInt(br.readLine());
	s[i]=new L2Q14(rno,name,no);
	}
	for(int i=0;i<nostud;i++)
	{
	s[i].exam();
	}
}
	
	// Java program to find the 
	// list of students having maximum average score 


		// Function to find the 
		// list of students having maximum average score 
		// Driver code 
		static void getStudentsList(String[] file) 
		{ 
			// Variables to store average score of a student 
			// and maximum average score 
			int avgScore; 
			int maxAvgScore = Integer.MIN_VALUE; 

			// List to store names of students 
			// having maximum average score 
			ArrayList<String> names = new ArrayList<>(); 

			// Traversing the file data 
			for (int i = 0; i < file.length; i += 4) { 

				// finding average score of a student 
				avgScore = (Integer.parseInt(file[i + 1]) + 
							Integer.parseInt(file[i + 2]) + 
						Integer.parseInt(file[i + 3])) / 3; 

				if (avgScore > maxAvgScore) { 
					maxAvgScore = avgScore; 

					// Clear the list and add name of student 
					// having current maximum average score in the list 
					names.clear(); 
					names.add(file[i]); 
				} 

				else if (avgScore == maxAvgScore) 
					names.add(file[i]); 
			} 

			// Printing the maximum average score and names 
			// of students having this maximum average score 
			// as per the order in the file. 
			for (int i = 0; i < names.size(); i++) { 
				System.out.print(names.get(i) + " "); 
			} 

			System.out.print(maxAvgScore); 
		} 

		// Driver code 
		public static void main(String args[]) 
		{ 
			String[] file = { "Shrikanth", "20", "30", 
							"10", "Ram", "100", "50", "10" }; 
			getStudentsList(file); 
		}*/
	
	public static void main(String[] args) {
        Result r = new Result("Aditya", 9, 87, 97, 77);
        r.calc();
        r.display();
    }
}

class Student {
    String name;
    int rNo;
}

class Exam extends Student {
    int m1, m2, m3;
}

class Result extends Exam {
    int totalMark;

    Result(String name, int rNo, int m1, int m2, int m3) {
        this.name = name;
        this.rNo = rNo;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    void calc() {
        this.totalMark = this.m1 + this.m2 + this.m3;
    }

    void display() {
        System.out.println("Name: " + this.name + " RollNo: " + this.rNo + " Total Mark: " + this.totalMark);
    }

}
	 
