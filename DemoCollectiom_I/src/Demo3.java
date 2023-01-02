import java.util.*;
class Employee implements Comparable<Employee>
{
	int eid;
	String name;
	double salary;
	public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	
	public int getEid() {
		return eid;
	}

	public Employee()
	{
		
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.eid-o.eid;
	}
}

public class Demo3 {
	public static void main(String[] args) {
		int choice=1;
		String name;
		int eid;
		double salary;
		List<Employee> emps=new ArrayList<>();
		do
		{
			System.out.println("1. Accept");
			System.out.println("2. Display");			
			System.out.println("3. Accept");
			System.out.println("4. Accept");
			System.out.println("5. Accept");
			System.out.println("0. Exit");
			System.out.println("Enter Your Choice ");
			Scanner sc=new Scanner(System.in);
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println(" Enter Emp Id Name And Salary");
				eid=sc.nextInt();
				name=sc.next();
				salary=sc.nextDouble();
				//Employee e=new Employee(eid,name,salary);
				//emps.add(e);
				emps.add(new Employee(eid,name,salary));
				break;
			case 2:
				for(int i=0;i<emps.size();i++)
				{
					System.out.println(emps.get(i));
				}
				break;
			case 3:
				int temp;
				System.out.println(" Enter Emp Id To Modify ");
				temp=sc.nextInt();
				for(int i=0;i<emps.size();i++)
				{
					
					if(temp==emps.get(i).getEid())
					{
						System.out.println(" Enter Emp Id Name And Salary");
						eid=sc.nextInt();
						name=sc.next();
						salary=sc.nextDouble();
						Employee e=new Employee(eid,name,salary);
						emps.set(i, e);
						}
				}
				Collections.sort(emps);
				break;
			
			}
			
		}
		while(choice!=0);
	}

}
