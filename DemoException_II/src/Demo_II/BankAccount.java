package Demo_II;

public class BankAccount {
	private int acno;
	private String name;
	private double balance;
	public BankAccount(int acno, String name, double balance) throws InSufficientBalanceException{
		super();
		this.acno = acno;
		this.name = name;
		if(balance<1000)
			throw new InSufficientBalanceException();
		this.balance = balance;
	}
	public BankAccount() throws InSufficientBalanceException{
		this.acno = 100;
		this.name = "Seeta";
		balance=2000;
		if(balance<1000)
			throw new InSufficientBalanceException();
	
	}
	public void withdraw(int amt) throws InSufficientBalanceException
	{
		if(balance-amt<1000)
			throw new InSufficientBalanceException();
		balance=balance-amt;
	}
	@Override
	public String toString() {
		return "BankAccount [acno=" + acno + ", name=" + name + ", balance=" + balance + "]";
	}
	

}
