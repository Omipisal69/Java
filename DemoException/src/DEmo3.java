import java.io.File;
import java.io.IOException;

public class DEmo3 {
	public static void main(String[] args) {
	
		try
		{
		int arr[]= {32,3,23,43};
		int no=arr[3];
		System.out.println(" Number Is "+no);
		}
		catch(IndexOutOfBoundsException obj)
		{
			System.out.println(" Elemebt 7 is not available ");
			obj.printStackTrace();
		}
		finally
		{
			 System.out.println(" In Finally Block ");
			
		}
		
		
	}

}
