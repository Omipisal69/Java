import java.io.*;
public class FileDemo {
	public static void main(String[] args) throws IOException{
		
		File fname=new File("C:/trupti/pqr.txt");
		// to check file is available or not
		//System.out.println("Result  "+fname.exists());
		// provide path given to fname object
		//System.out.println(" Path    "+fname.getPath()); 
		
	
		if(fname.exists())
			System.out.println(" Available ");
		else
			fname.createNewFile();
		// createNewFile()   throws IOException
		System.out.println(" Path    "+fname.getPath()); 
		System.out.println("File Name IS : "+fname.getName());
		System.out.println(" Parent "+fname.getParent());
	}

}
