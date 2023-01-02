package SortDemo_I;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoList {
	public static void main(String[] args) {
		
		List<Employee>emps=new ArrayList<Employee>();
		emps.add(new Employee(10,"Seeta",6000));
		emps.add(new Employee(5,"Geeta",7800));
		emps.add(new Employee(23,"Neeta",700));
		emps.add(new Employee(4,"Meeta",6600));
		emps.add(new Employee(21,"Suneeta",3400));
		emps.add(new Employee(56,"Aneeta",4000));
	
		for(Employee emp:emps)
			System.out.println(emp);
		System.out.println(" ----------- After Sort ---------");
		Collections.sort(emps);
		for(Employee emp:emps)
			System.out.println(emp);
		
		
	}

}
