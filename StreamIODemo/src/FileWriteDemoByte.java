import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * write(byte)
 * write(int);
 * write(byte[]);
 * 
 */
public class FileWriteDemoByte {
	// Write Data In File
	public static void main(String[] args) throws IOException,FileNotFoundException{
	
		FileOutputStream fout=new FileOutputStream("c:/trupti/pqr.txt");//write
		FileInputStream fin=new FileInputStream("c:/trupti/abc.txt");// read
		
		
		int ch;
		while((ch=fin.read())!=-1)
		{
			fout.write(ch);
		}
		fin.close();
		fout.close();
	}

}
