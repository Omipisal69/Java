package Sort_II;

import java.util.Comparator;

public class SortOnRno implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getRno()-o2.getRno();
	}

}