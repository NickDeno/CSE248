package p3_aggregation;

public class Demo {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		Organization o1 = new Organization();
		o1.add(p1);
		o1.add(p2);
	}

}
