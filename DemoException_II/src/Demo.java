import java.util.Scanner;

class Address
{
	private String area,city,pin;
	public Address(String area, String city, String pin) {
		super();
		this.area = area;
		this.city = city;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return " area=" + area + ", city=" + city + ", pin=" + pin ;
	}
	public Address() {
		super();
	}
}
class Employee
{
	static int cnt;
	private int eid;
	private String name;
	private double salary;
	private Address permenent,current;
	//Employee e1=new Employee();
	public Employee()
	{
		cnt++;
		eid=cnt;
		permenent=new Address();
		current=new Address();
	}
	// Employee e1=new Employee("Seeta",5000,"Cidco","Nashik","4323","Kothrod","Pune","411002")
	public Employee(String name,double sal,String area,String city,String pin,String area1,String city1,String pin1)
	{
		cnt++;
		eid=cnt;
		this.name=name;
		this.salary=sal;
		permenent=new Address(area,city,pin);
		current=new Address(area1,city1,pin1);
		
	}
    //Address ad=new Address("Shivaji Nagar","Pune","43454");
	// Employee e1=new Employee("Geeta",5000,ad,ad);
	public Employee (String str,double sal,Address per,Address curr)
	{
		cnt++;
		eid=cnt;
		this.name=str;
		salary=sal;
		permenent=per;
		current=curr;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", permenent=" + permenent
				+ ", current=" + current + "]";
	}
	public double getSalary()
	{
		return salary;
	}
	public static void bossEmployees(Employee e[])
	{
		for(int i=0;i<2;i++)
		{
			if(e[i].getSalary()>10000)
				System.out.println(e[i]);
		}
	}
	
}
public class Demo {
	
	public static void main(String[] args) {
		
		Employee e[]=new Employee[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++) {
			String name,area1,city1,pin1,area2,city2,pin2;
			double sal;
			System.out.println(" Enter Name ");
			name=sc.next();
			System.out.println(" Enter Salary ");
			sal=sc.nextDouble();
			System.out.println(" Enter Area For Permenent Address  ");
			area1=sc.next();
			System.out.println(" Enter city For Permenent Addresse ");
			city1=sc.next();
			System.out.println(" Enter pin For Permenent Address ");
			pin1=sc.next();
			System.out.println(" Enter Area For currene Address ");
			area2=sc.next();
			System.out.println(" Enter city For current Address ");
			city2=sc.next();
			System.out.println(" Enter pin For current Address ");
			pin2=sc.next();
		
			e[i]=new Employee(name,sal, area1, city1,pin1,area2,city2,pin2);
		    	
		}
			
	    for(int i=0;i<2;i++)
	    	System.out.println(e[i]);
	   Employee.bossEmployees(e);
	}

}
