
public class DemoString {
	public static boolean isVol(char ch)
	{
		boolean flag=false;
		switch(ch)
		{
		case'A':
		case'a':
		case'E':
		case'e':
		case'I':
		case'i':
		case'O':
		case'o':
		case'U':
		case'u':
			flag=true;
		}
		return flag;
	}
	public static void main(String[] args) {
		
		String str="India is my country";
		for(int i=0;i<str.length();i++)
			System.out.println(str.charAt(i));
		
		// charAt(index) character return 
		char ch=str.charAt(5);
		
	}

}
