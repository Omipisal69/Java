import java.io.*;

public class DemoFileCharacter {
	public static void main(String[] args) throws IOException{
     // read character data with buffer from consol
	BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
	int ch='A';
	System.out.println("Enter Data ");

	while((ch=buffer.read())!='\n')
		System.out.print((char)ch);

		
	}

}
