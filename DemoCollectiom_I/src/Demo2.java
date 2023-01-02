import java.util.*;
public class Demo2 {

	public static List<Integer>findEven(int count){
	   // list is interface .. We can't create object of interface 
		// but we can create object of implementing class
		
   		List<Integer> evennumbers =new ArrayList<>();
   		int num=1;
		while(count>0)
		{
			if(num%2==0)
			{
				evennumbers.add(num);
				count--;
			}
			num++;
		}
		return evennumbers;
	}
	public static boolean isVowel(char ch)
	{
		boolean flag=false;
		switch(ch)
		{
		case 'A':
		case 'a':
		case 'O':
		case 'o':
		case 'i':
		case 'I':
		case 'e':
		case 'E':
		case 'u':
		case 'U':
		   flag=true;
		}
		return flag;
	}
	public static List<Character>findVowels(String str)
	{	char ch;
		List<Character> vowels=new ArrayList<>();
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(isVowel(ch))
			{
				vowels.add(ch);
			}
			
		}
		return vowels;
	}
	
	public static List<Character> getReverse(String str)
	{
		List<Character> reverselist=new LinkedList<>();
		for(int i=str.length()-1;i>=0;i--)
		{
			reverselist.add(str.charAt(i));
		}
		return reverselist;
	}
	public static void main(String[] args) {
		
		List<Integer> even=findEven(10);
		System.out.println(even);
		
		List<Character> vov=findVowels(" Good  evening ");
		System.out.println(vov);
		List<Character> reverse=getReverse("Hello");
		System.out.println(" Reverse String Is \n");
		for(Character c:reverse)
			System.out.print(c);
		
		Collections.sort();
		
	}

}
