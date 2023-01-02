import java.util.Scanner;

public class DEmoArray {
	public static void accept(int a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter "+a.length+" elements ");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
	}
	public static void display(int a[])
	{
		System.out.println("------------------------------\n");
		for(int i=0;i<a.length;i++)
			System.out.print("  "+a[i]);
		System.out.println("\n------------------------------");
		
	}
	// 89  65 34 87 23 54
	//     i        j
	public static void reverseArray(int a[])
	{
		int i,j,temp;
		for(i=0,j=a.length-1;i<j;i++,j--)
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
	public static void sort(int a[])
	{
		int i,j,temp;
		for(i=0;i<a.length-1;i++)//passes
		{
			for(j=0;j<a.length-1-i;j++)// comp
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
	}
	public int finMax(int a[])
	{
		int res=0;
		return res;
	}
	public static void main(String[] args) {
	
		int a[]=new int[5];
		int b[]=new int[7];
		int choice=1;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println(" 1. Accept ");
			System.out.println(" 2. Display ");
			System.out.println(" 3. Max ");
			System.out.println(" 4. Reverse ");
			System.out.println(" 0. Exit ");
			System.out.println("  Enter Your Choice ");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				accept(a);
				break;
			case 2:
				display(a);
				break;
			case 4:
				reverseArray(a);
				display(a);
				break;
			case 5:
				sort(a);
				display(a);
				
				
			}
			
		}while(choice!=0);
		
		
		/* 1. Accept Array
		   2. Display
		   3. Search 
		   4. Count 
		   5. Find Min
		   6. Find Max
		   7. Reverse
		*/
		
		
		
	}

}
