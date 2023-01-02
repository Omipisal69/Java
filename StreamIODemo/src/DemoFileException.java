import java.io.*;
/* Constructor of FileInputStream class --> FileNot Found
 * read()--->IOException
 * close()---> IOException
 */

public class DemoFileException {
	public static void main(String[] args) {
		File obj=new File("c:/trupti/abc.txt");
		if(!obj.exists())
		{
			System.out.println(" File Not Availbale");
			return;
		}
		FileInputStream myfile=null;
		BufferedInputStream b=null;
		try
		{
			myfile=new FileInputStream(obj);
			b=new BufferedInputStream(myfile);
			
			int ch;
			try {
				while((ch=b.read())!=-1)
				{
					System.out.println((char)ch);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				b.close();
				
				
				myfile.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}
		
	}

}
