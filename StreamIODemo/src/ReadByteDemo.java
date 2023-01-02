import java.io.*;
import java.util.Scanner;
public class ReadByteDemo {
	public static void main(String[] args) throws IOException,FileNotFoundException {
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter File Name With Path ");
		name=sc.next();
		File fname=new File(name);
		//File fname=new File("c:/trupti/abc.txt");
		if(!fname.exists())
		{
		  System.out.println("File Not Availabel  ");
		  return ;
		}
		FileInputStream fin=null;
		fin=new FileInputStream(fname);
		
		//read()    read data and returns int  values
		/*
		 * int ch=fin.read();
		   System.out.println(ch);*/
		int ch;
		while((ch=fin.read())!=-1) //-1 end of file 
		{
			System.out.print((char)ch);
		}
		fin.close();		
		
		
		
	}
	
}