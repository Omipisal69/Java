package utility;

public abstract class Employee {

	private int eid;
	private String name;
	protected  double salary;
	public Employee()
	{
		
	}
	public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return " eid=" + eid + ", name=" + name + ", salary=" + salary ;
	}
	public abstract void calculateSalary();
	
	
	
}
