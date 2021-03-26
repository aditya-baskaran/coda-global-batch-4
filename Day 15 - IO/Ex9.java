package Day15;
import java.io.* ;

public class Ex9 implements Serializable {
	public int eno ;
	public String ename ;
	Ex9(int a, String m)
	{	
		eno=a ;
		ename=m; 
	}
	void print()
	{
		System.out.println(eno + " \t:\t " + ename ) ;
	}
}

class writeobj
{
	public static void main(String arg[]) throws Exception	
	{
		FileOutputStream fos = new FileOutputStream ("Ex9.dat") ;
		ObjectOutputStream oos = new ObjectOutputStream(fos) ;
		Ex9 ob ;
		for ( int i=0; i<10;i++)
		{
			ob =  new Ex9(i,"name"+i) ;
			oos.writeObject(ob) ;
		}
	}	
}

class readobj
{
	public static void main(String arg[])throws Exception
	{
	     FileInputStream fis = new FileInputStream("Ex9.dat") ;
	     ObjectInputStream ois = new ObjectInputStream(fis) ;
	     Ex9 ob ;
		while((ob = (Ex9) ois.readObject())!=null) {
		ob.print() ;	
		}
	}
}

