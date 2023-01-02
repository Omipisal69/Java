package Sycho_Demo;
class Printer
{
	
	public synchronized void  print(String header,String body,String footer)
	{
		
		System.out.println("Hello");
		try {
		 Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		synchronized (this) {
		try
		{
			System.out.println("------------"+header+"---------");
		    Thread.sleep(500);
		    System.out.println("     --------"+body+"-----     ");
		    Thread.sleep(500);
		    System.out.println("          --"+footer+"--");
		 
		}
		 catch(InterruptedException e)
		 {
		  	e.printStackTrace();
		  }
		 }
		
		System.out.println("Bye");
		
	}
}
class MyJob extends Thread
{
	Printer p;
	String header,body,footer;
	public MyJob()
	{
		p=new Printer();
	}
	public MyJob(Printer p,String h1,String b1,String f1)
	{
		this.p=p;
		this.header=h1;
		this.body=b1;
		this.footer=f1;
	
	}
	public void run()
	{
		p.print(header,body,footer);
	}
	
	
}



public class DemoPrinter {
	public static void main(String[] args) {
		
		Printer p1=new Printer();
		MyJob j1=new MyJob(p1, "Java ","Learning Java","Java Ended ");	
		MyJob j2=new MyJob(p1, "DBT ","Learning DBT","BDT Ended ");	
		MyJob j3=new MyJob(p1, "Linx ","Learning Linux","Linux Ended ");	
		j1.start();
		j2.start();
		j3.start();
	}

}
