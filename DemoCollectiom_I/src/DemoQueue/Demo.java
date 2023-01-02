package DemoQueue;
import java.util.*;
public class Demo {
	public static void main(String[] args) {
	Queue<Integer> que=new PriorityQueue<>();
		que.add(65);
		que.add(345);
		que.add(43);
		que.add(232);
		que.add(42);
		que.add(21);
		que.add(97);
		System.out.println(que);
		int no=que.remove();
		System.out.println(" Number Is "+no);
		
	}

}
