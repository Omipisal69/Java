import java.io.*;
/*
 * accept filename from user to read          Input (read)--- keyboard
 * read character by character data from file Input (read--- file
 * count number of characters                 output(write)---consol   
 * count numbers of new lines
 * count spaces
 *  
 */
public class DemoFielCharacter 
{
	public static void main(String[] args) throws IOException,FileNotFoundException{
		//1. Read data from keyboard
		System.out.println(" Enter File Name To Read ");
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		String fname=buffer.readLine();
		int line=0,space=0,count=0;
		File myfile=new File(fname);
		if(myfile.exists())
		{
			//2. read data from file
			    // open file(character stream) for reading
			    //read method to read data
			FileReader fread=new FileReader(myfile); 
			int ch;
			while((ch=fread.read())!=-1) // read 
			{
				System.out.print((char)ch);
				if(ch=='\n')
					line++;
				if(ch==' ')
					space++;
				count++;
			}
			System.out.println(" Lines    : "+line);
			System.out.println(" Spaces   : "+space);
			System.out.println(" chacters : "+count);
			fread.close();
		}
		else
			System.out.println(" Create File First");
		
		
	}

}
