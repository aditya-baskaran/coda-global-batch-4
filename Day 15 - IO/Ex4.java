package Day15;
import java.io.*;

public class Ex4 {
	public static void main(String args[]) throws IOException {
		String temp = "abcd" ;
		byte b[]=temp.getBytes();
		int c;
		ByteArrayInputStream in=new ByteArrayInputStream(b);
		for(int I=0;I<2;I++) 
		{
			while ((c=in.read())!=-1)
			{
				if(I==0) { System.out.print((char)c); }
				else { System.out.print(Character.toUpperCase((char)c)); }
			} System.out.println();
			in.reset(); 
		}
	}
}
