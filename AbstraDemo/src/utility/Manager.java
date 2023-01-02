package utility;

public class Manager extends Employee{
	private double allow,incen;
	public Manager()
	{
		
	}
	public Manager(int eid, String name, double salary, double allow, double incen) {
		super(eid, name, salary);
		this.allow = allow;
		this.incen = incen;
	}
	@Override
	public String toString() {
		return "Manager ["+super.toString()+" allow=" + allow + ", incen=" + incen + "]";
	}
	public void calculateSalary()
	{
		System.out.println("Salary : "+(salary+allow+incen));
	}
	public void  travelling()
	{
		System.out.println(" Manager is Travelling ");
	}

}
