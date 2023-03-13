package p7;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Demo {

	public static void main(String[] args) {
		//Create a program that uses the BinaryOperator functional interface to find the maximum value
		//in a list of integers.
		
		List<Integer> nums = Arrays.asList(22,8,4,53,2,1,5);
		BinaryOperator<Integer> b1 = (Integer x1, Integer x2) -> {
			if(x1 > x2) return x1;
			return x2;
		};
		Integer max = nums.stream().reduce(b1).get();
		System.out.println(max);
	
		
		
	}

}
