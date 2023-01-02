package threadcomm;

public class CommDemo {

	public static void main(String[] args) throws InterruptedException
	{
		Stock s=new Stock();
		
		Producer p=new Producer(s);
		Consumer c=new Consumer(s);
		
		p.getThread().start();
		c.getThread().start();
		
		System.out.println("Demo begins.....");
		
		Thread.sleep(500);

		p.stopNow();
		c.stopNow();
		
		p.getThread().join();
		c.getThread().join();
		
		System.out.println("Demo ends.......");
		
		System.out.println("Total qty produced : "+s.qtyProduced);
		System.out.println("Total qty consumed : "+s.qtyConsumed);
		
	}

}
