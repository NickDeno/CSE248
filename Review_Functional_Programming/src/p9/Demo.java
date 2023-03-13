package p9;

public class Demo {

	public static void main(String[] args) {
		//Create a functional interface named StringOperation with a single abstract method operate that
		//takes in a string and returns a modified version of the string. Implement the StringOperation
		//interface using a lambda expression to capitalize the first letter of a string.
		
		StringOperation s1 = (String s) -> {
			if(s == null || s.isEmpty()) return s;
			return s.substring(0, 1).toUpperCase() + s.substring(1, s.length());
		};
		
		System.out.println(s1.operate("hello"));
		System.out.println(s1.operate("hi"));

		
	}

}
