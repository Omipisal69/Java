package utility;

public class WageEmp extends Employee{
	double hrs,rate;
	public WageEmp()
	{
		
	}
	@Override
	public String toString() {
		return "WageEmp ["+super.toString()+"hrs=" + hrs + ", rate=" + rate + "]";
	}
	public WageEmp(int eid, String name, double salary, double hrs, double rate) {
		super(eid, name, salary);
		this.hrs = hrs;
		this.rate = rate;
	}
	public void calculateSalary()
	{
		System.out.println("Salary : "+(salary+(hrs*rate)));
	}


}
