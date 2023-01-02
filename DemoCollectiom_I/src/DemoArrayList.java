import java.util.ArrayList;

import java.util.Collections;

public class DemoArrayList {
	public static void main(String[] args) {
		
		/*ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add("Seeta");
		a1.add(3.14f);
		a1.add(400);
		a1.add(434.434);
		System.out.println("-------------------");
		System.out.println(a1);
		System.out.println("-------------------");
		for(int i=0;i<a1.size();i++)
			System.out.println(a1.get(i));
		System.out.println("-------------------");
		for(Object obj:a1)
		{
	          System.out.println(obj);
		}*/
		
		ArrayList<String> s=new ArrayList<>();
		s.add("Pune");
		s.add("Mumbai");
		s.add("Nashik");
		s.add("Kolhapur");
		s.add("Nanded");
		s.add(2,"Sambhaji Nagar");
		for(String str:s)
			System.out.println(str);
		System.out.println("------------------------");
		s.remove(1);// according to Position
		for(String str:s)
			System.out.println(str);
		System.out.println("------------------------");
		s.remove("Nashik");// according to data
		for(String str:s)
			System.out.println(str);
		System.out.println(" "+s.contains("Nanded"));
		
		Collections.sort(s);
		System.out.println("------- After Sort ---------------");
		for(String str:s)
			System.out.println(str);
		
		  
		//size
		// constatins
		//add
		//add(int,Object)
		// remove(Position)
		//remove(data);
		
		
		/*1. Accept
		2. Display
		3. Search
		4. delete
		5. modify
		6.sort*/
		
		
		
		
		
		
		
		
		
	}

}
