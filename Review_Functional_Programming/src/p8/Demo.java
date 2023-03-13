package p8;

import java.util.function.IntPredicate;

public class Demo {

	public static void main(String[] args) {
		//Write a program that uses the IntPredicate functional interface to test if an integer is even.
		
		IntPredicate i1 = (int x) -> x%2 == 0;
		System.out.println(i1.test(4));
		System.out.println(i1.test(5));
	}

}
