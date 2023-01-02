package DemoSet;

import java.util.*;

import SortDemo_I.Employee;
import Sort_II.Student;
public class Demo {
	public static void main(String[] args) {
		Set<Integer> one=new LinkedHashSet<>();
		one.add(20);
		one.add(60);
		one.add(30);
		one.add(10);
		one.add(40);
		one.add(30);
		System.out.println("----------- Linked Hash Set(Insertion Order)--------");
		System.out.println(one);
		Set<Integer> two=new TreeSet<>();
		two.add(20);
		two.add(60);
		two.add(30);
		two.add(10);
		two.add(40);
		two.add(30);
		System.out.println("----------- TreeSet Set (Sorted Order)--------");
		System.out.println(two);
		Set<Integer> three=new HashSet<>();
		three.add(20);
		three.add(60);
		three.add(30);
		three.add(10);
		three.add(40);
		three.add(30);
		System.out.println("----------- Hash Set (Unorder List)--------");
		System.out.println(three);
		
	}

}
