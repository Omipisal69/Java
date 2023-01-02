package app;

import utility.Employee;
import utility.Manager;
import utility.WageEmp;

public class Demo {
	public static void main(String[] args) {
	
		Employee e[]=new Employee[5];
		e[0]=new Manager(101,"Seta",5000,600,200);
		e[1]=new WageEmp(102,"Neeta",5000,30,300);
		e[2]=new Manager(103,"Geeta",40000,200,500);
		e[3]=new WageEmp(104,"Sangeeta",7000,30,300);
		e[4]=new Manager(105,"Meeta",2000,200,500);
		
		for(int i=0;i<e.length;i++)
		{
			// instance of operator
			// is use for dynamic type checking
			if (e[i] instanceof Manager) 
			{
				((Manager)e[i]).travelling();
			}
			System.out.println(e[i]);
			e[i].calculateSalary();
		}
		
		
	}
	
	
	
	
	
}
