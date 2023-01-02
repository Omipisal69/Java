package threadcomm;

public class Stock 
{
	int qtyProduced;
	int qtyConsumed;
	boolean bProduced;
	
	public Stock()
	{
		qtyProduced=qtyConsumed=0;
		bProduced=false;
	}
	
	public synchronized void produce()
	{
		try
		{
			if(bProduced)
				wait();
		}
		catch(InterruptedException ex){}
		
		qtyProduced++;
		bProduced=true;
		System.out.println("Produced : "+qtyProduced);
		notify();
	}
	
	public synchronized void consume()
	{
		try
		{
			if(!bProduced)
				wait();
		}
		catch(InterruptedException ex){}
		
		qtyConsumed++;
		bProduced=false;
		System.out.println("Consumed : "+qtyConsumed);
		notify();
	}
	
	
	
}
