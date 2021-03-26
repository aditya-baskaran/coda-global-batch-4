package Day15;
import java.io.*;

public class Ex3 implements FilenameFilter{

	String ext;
	public Ex3(String e)
	{   ext="."+e;   }
	public boolean accept(File dir, String name){
		return name.endsWith(ext);
	}    }
class Dirlistonly{
	public static void main(String args[]){
		String dirname="c:/users";
		File f1=new File(dirname);
		FilenameFilter only=new Ex3("html");
		String s[]=f1.list(only);
		for (int i=0;i<s.length;i++){
			System.out.println(s[i]);   }    
	}    }
