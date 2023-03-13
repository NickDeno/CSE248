package p4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Demo {

	public static void main(String[] args) {
		//Write a program that uses the Consumer functional interface to print out the elements of a list
		//of strings.
		
		List<String> list = Arrays.asList("A","B","C","D");
		
		//Approach 1(Without Streams)
		Consumer<String> c1 = s -> System.out.print(s + " ");
		for(String s: list) {
			c1.accept(s);
		}
		System.out.println();
		
		//Approach 2(With Streams)
		list.stream().forEach((String s) -> System.out.print(s + " "));
	}

}
