package p1_parallel;

import java.util.Comparator;

public class MyComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return Double.compare(o1.getGpa(), o2.getGpa());
	}

}
