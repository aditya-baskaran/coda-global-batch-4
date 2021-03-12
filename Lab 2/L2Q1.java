package Day5;

public class L2Q1 {
	int data=50;  
	  
	 void change(L2Q1 op){  
	 op.data=op.data+100;//changes will be in the instance variable  
	 }  
	     
	    
	 public static void main(String args[]){  
		 L2Q1 op=new L2Q1();  
	  
	   System.out.println("before change "+op.data);  
	   op.change(op);//passing object  
	   System.out.println("after change "+op.data);  
	  
	 }
}
