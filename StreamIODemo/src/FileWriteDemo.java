import java.io.*;
public class FileWriteDemo {

	public static void main(String[] args) {
		//   \n  new line
		//   \t tab stop
		//   \b back space
		//   \a
		//  C:\\newfile.txt
		FileOutputStream fin=null;
		try
		{
			
			fin=new FileOutputStream("c:\\trupti\\abc.txt");
			for(char ch='A';ch<='Z';ch++)
			    fin.write(ch);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			try {
				fin.close();
			} catch (IOException e1) {
					e1.printStackTrace();
			}
			
		}
		
		
	}
}
