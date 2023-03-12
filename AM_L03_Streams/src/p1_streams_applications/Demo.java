package p1_streams_applications;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		//Creates a list of Integers
		List<Integer> nums = Arrays.asList(2,3,4,5);
		
		//Demonstration of map method
		List<Integer> squareNums = nums.stream().map(x -> x*x).collect(Collectors.toList());
		System.out.println(squareNums);
		
		//Creates a list of Strings
		List<String> names = Arrays.asList("Reflection", "Collection", "Stream");
		
		//Demonstration of filter method(Requires predicate to determine which to filter and what to not)
		List<String> filterResults = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
		System.out.println(filterResults);
		
		//Demonstration of sorted method
		List<String> sortedResults = names.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedResults);
		
		//Creates another list of Integers
		List<Integer> nums2 = Arrays.asList(2,3,4,5,2);
		
		//Demonstration of map method with Set(No duplicates)
		Set<Integer> squareNumsSet = nums2.stream().map(x -> x*x).collect(Collectors.toSet());
		System.out.println(squareNumsSet);
		
		//Demonstration of reduce method(Filters out odd numbers, adds up remaining numbers => "reduce")
		int even = nums.stream().filter(x -> x%2 == 0).reduce(0, (ans,i) -> ans + i);
		System.out.println(even);
		
		
		
		
	}

}
