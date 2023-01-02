
import java.util.*;
public class Demo1 {

	public static int Prime(int n)
	{
		int temp=n;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				temp=-1;
				break;
			}
		}
		return temp;
	}
	
	// find first 10 prime Numbers
	// create LinkedList of first 10 Prime Numbers
	public static void main(String[] args) {
		int no=2,res,cnt=0;
		LinkedList<Integer> primenumbers=new LinkedList<>();
		
		while(cnt<10)
		{
			res=Prime(no);
			if(res==no)
			{
				cnt++;
				primenumbers.add(no);
			}
			no++;
		}
		
		System.out.println("-----------------------");
		System.out.println(primenumbers);
		
		
	}
}
