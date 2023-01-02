
class MyThreadClass extends Thread
{
	int num;
	public MyThreadClass(int no,String name)
	{
       super(name);
		num=no;
	}
	public void run()
	{
		while(num!=0)
		{
			try
			{
				System.out.println(Thread.currentThread().getName()+"-- >"+num);
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			num--;
		}
	}
}

public class Demo3 {
	public static void main(String[] args) {
		String name=Thread.currentThread().getName();
		System.out.println(" Thread Name Is "+name);
		System.out.println(" Priority "+Thread.currentThread().getPriority());
		System.out.println(" Max Priority "+Thread.MAX_PRIORITY);
		System.out.println(" Min Priority "+Thread.MIN_PRIORITY);
	// 1. Create Thread	
		MyThreadClass t1=new MyThreadClass(8,"One");
		MyThreadClass t2=new MyThreadClass(15,"Two");
		MyThreadClass t3=new MyThreadClass(34,"Three");
	//2. Ready To run
	t1.start();
	t2.start();
	t3.start();
	
	}

}
