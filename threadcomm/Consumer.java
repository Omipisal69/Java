package threadcomm;

public class Consumer implements Runnable {
	Thread t;
	Stock s;
	boolean bRun;
	
	public Consumer(Stock s)
	{
		t=new Thread(this);
		this.s=s;
		bRun=true;
	}
	
	public Thread getThread()
	{
		return t;
	}
	
	public void run()
	{
		while(bRun)
			s.consume();
	}
	
	public void stopNow()
	{
		bRun=false;
	}


}
