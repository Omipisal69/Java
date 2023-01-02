
class MyThread extends Thread
{
	public MyThread()
	{
		
	}
	public MyThread(String name)
	{
		this.setName(name);
		
	}
	public void increment()
	{
		System.out.println("---------Thread Running-----");
		for(int i=1;i<=20;i++)
		{System.out.println(this.getName()+"\t"+i);
			try
			{
			Thread.sleep(1500);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
		}
	}
	public void decrement()
	{
		System.out.println("---------Thread Running-----");
		for(int i=20;i>=1;i--)
		{System.out.println(this.getName()+"\t"+i);
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
	public void run() 
	{
		increment();
		
	}
}

public class Demo1 {
	public static void main(String[] args) {
		
		MyThread t1=new MyThread("Thread 1");
		t1.setPriority(5);
		t1.start();
		MyThread t2=new MyThread("Thread 2");
		t2.start();
	}

}
