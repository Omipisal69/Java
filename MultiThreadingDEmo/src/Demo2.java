
class MyThread1 implements Runnable
{
	public void run() {

		System.out.println("---------Thread Running-----");
		for(int i=10;i>=1;i--)
		{System.out.println(i);
			try
			{
			Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
		}
		
	}
	
}
public class Demo2 {
	public static void main(String[] args) {
		
		MyThread1 m1=new MyThread1();
		Thread t1=new Thread(m1);
		t1.start();
}

}
