import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		int no1,no2;
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println(" Enter Two Numebrs ");
		no1=sc.nextInt();
		no2=sc.nextInt();
		float res=no1/no2;
		System.out.println(" Result Is "+res);
		}
		catch(ArithmeticException e)
		{
			//System.out.println(e.getMessage());
			System.out.println(" divisible by Zero Is Not allowed ");
			e.printStackTrace();
		}
		try
		{
			String str=null;
			System.out.println("Length is "+str.length());
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
			
		}
		
		
	}

}
