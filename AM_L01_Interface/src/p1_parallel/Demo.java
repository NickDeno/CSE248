package p1_parallel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("A", 3.5));
		list.add(new Student("M", 1.5));
		list.add(new Student("E", 2.5));
		list.add(new Student("Z", 4.5));
//		Collections.sort(list); // Uses default Comparble of Student class
//		Collections.sort(list, new MyComparator()); //Uses MyComparator which implements compare method by gpa
//		Collections.sort(list, new Comparator<Student>() { //Anonymous class implementation of comparator by gpa
//			@Override
//			public int compare(Student o1, Student o2) {
//				return Double.compare(o1.getGpa(), o2.getGpa());
//			}
//			
//		});
		Collections.sort(list, (Student o1, Student o2) ->  Double.compare(o1.getGpa(), o2.getGpa()));
		System.out.println(list);
	}
}
