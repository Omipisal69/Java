package Demo_II;

public class Demo {
public static void main(String[] args) {
	try
	{
		BankAccount b1=new BankAccount(101, "Seeta",10000);
		b1.withdraw(90);
		System.out.println(b1);
	}
	catch(InSufficientBalanceException e)
	{
		System.out.println(e.getMessage());
	}
}
}
