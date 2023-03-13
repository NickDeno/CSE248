package p3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		//Create a program that uses the Function functional interface to transform a list of integers to a
		//list of strings
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
		nums.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		//Approach 1(With Streams)
		List<String> transformedList = nums.stream().map(((Integer x) -> "Number: " + String.valueOf(x))).collect(Collectors.toList());
		transformedList.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		//Approach 2 (Without Streams)
		Function<Integer, String> transform = (Integer x) -> "Number: " + String.valueOf(x);
		ArrayList<String> transformedList1 = new ArrayList<>(nums.size());
		for(Integer x: nums) {
			transformedList1.add(transform.apply(x));
		}
		transformedList1.forEach(s -> System.out.print(s + " "));
	}

}
