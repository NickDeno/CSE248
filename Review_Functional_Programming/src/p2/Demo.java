package p2;

public class Demo {

	public static void main(String[] args) {
		//Create a functional interface named Converter with a single abstract method called convert that
		//takes in a string and returns an integer. Implement the Converter interface using a lambda
		//expression to convert a string to an integer
		
		Converter c1 = (String s) -> Integer.valueOf(s);
		Integer result = c1.convert("453");
		System.out.println(result);
	}

}
