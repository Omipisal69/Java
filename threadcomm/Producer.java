package threadcomm;

public class Producer implements Runnable {
	Thread t;
	Stock s;
	boolean bRun;
	
	public Producer(Stock s)
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
			s.produce();
	}
	
	public void stopNow()
	{
		bRun=false;
	}

}
