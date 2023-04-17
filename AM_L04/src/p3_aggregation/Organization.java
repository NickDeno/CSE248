package p3_aggregation;

import java.util.LinkedList;
import java.util.List;

public class Organization {
	private List<Person> list;
	
	public Organization() {
		list = new LinkedList<>();
	}
	
	//Aggregation relationship. The person object is not created explicitly in the Organization object. So if this
	//Organization object is destroyed, the Person objects in the list will not be destroyed aswell => Aggregation
	//relationship.
	
	//Aggregation relationships usually have data structures to "aggregate" the objects
	public void add(Person person) {
		list.add(person);
	}
} 
