package Sort_II;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import SortDemo_I.Employee;

public class Demo {
	public static void main(String[] args) {
		List<Student>students=new ArrayList<Student>();
		students.add(new Student(10,"Seeta",6000));
		students.add(new Student(5,"Geeta",7800));
		students.add(new Student(23,"Neeta",700));
		students.add(new Student(4,"Meeta",6600));
		students.add(new Student(21,"Suneeta",3400));
		students.add(new Student(56,"Aneeta",4000));
		for(Student st: students)
			System.out.println(st);
		Collections.sort(students,new SortOnRno());
		System.out.println("-------- After Sorting ---------------");
		for(Student st: students)
			System.out.println(st);
	
	}

}
