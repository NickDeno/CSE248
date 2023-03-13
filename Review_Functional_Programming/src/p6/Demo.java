package p6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		//Write a program that uses the UnaryOperator functional interface to square each element of a
		//list of integers.
		
		//*UnaryOperator interface functions similar to Functional interface, but with Function, an argument
		//type and return type is specified(Function<Double,String>). With UnaryOperator, an argument type
		//is specified(UnaryOperator<Double>), and the return type is of the same type.
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		list.forEach((Integer x) -> System.out.print(x + " "));
		System.out.println();
		
		//Approach 1(Wihout Streams)
		UnaryOperator<Integer> u1 = (Integer x) -> x*x;
		ArrayList<Integer> squares = new ArrayList<>(list.size());
		for(Integer x: list) {
			squares.add(u1.apply(x));
		}
		squares.forEach((Integer x) -> System.out.print(x + " "));
		System.out.println();
		
		//Approach 2(With Streams)
		List<Integer> squares2 = list.stream().map(u1).collect(Collectors.toList());
		squares2.forEach(x -> System.out.print(x + " "));
	}

}
