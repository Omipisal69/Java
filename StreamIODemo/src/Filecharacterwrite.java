import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Filecharacterwrite {
	public static void main(String[] args) throws IOException,FileNotFoundException{
		
		FileWriter file=new FileWriter("c:/trupti/xyz.txt");
		BufferedWriter buffer=new BufferedWriter( file);
		buffer.write("India Is MyCountry");
		buffer.write("India ");
		buffer.close();
		file.close();
		
		String str=null;
	  while((str=buffer.readLine()).equls."quit")
	  {
		  
	  }
		
	}

}
