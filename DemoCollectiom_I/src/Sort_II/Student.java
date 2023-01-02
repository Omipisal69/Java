package Sort_II;
public class Student {
	int rno;
	String name;
	double per;
	public Student(int rno, String name, double per) {
		super();
		this.rno = rno;
		this.name = name;
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", per=" + per + "]";
	}
	public int getRno() {
		return rno;
	}
	public String getName() {
		return name;
	}
	public double getPer() {
		return per;
	}
}
