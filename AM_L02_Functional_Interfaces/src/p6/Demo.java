package p6;

import java.util.Optional;

public class Demo {

	public static void main(String[] args) {
		//Optional is a container that can hold an object or null
		Optional<String> result = Optional.ofNullable(null);
		Optional<String> result2 = Optional.ofNullable("Hello");
		
		result.ifPresent(System.out::println); //Method reference
		result.ifPresent((s) -> System.out.println()); //Regular lambda expression
		System.out.println("End\n");
		
		result2.ifPresent(System.out::println);
		result2.ifPresent((s)->System.out.println());
		
		if(result.isPresent()) System.out.println(result.get()); //Tests if result is empty or not
		else System.out.println("It is empty!");
		
		System.out.println(result.orElse("Empty")); //Prints result if not empty, prints "Empty" if empty
		
	}
	
//	public static Optional<Person> find(Predicate predicate){ //Optional => there is a chance that return is null
//		
//	}
}
