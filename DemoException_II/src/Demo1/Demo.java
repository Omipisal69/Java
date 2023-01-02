package Demo1;


import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		try
		{
			Scanner sc=new Scanner(System.in);
			String str="Seeta";
			System.out.println(" Length : "+str.length());
			int arr[]= {32,43,54,65,76};
			int index,no;
			index=sc.nextInt();
			 no=arr[index];
			 System.out.println("Element Is "+no);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
