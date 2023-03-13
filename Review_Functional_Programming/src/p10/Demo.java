package p10;

import java.util.function.DoubleSupplier;

public class Demo {

	public static void main(String[] args) {
		//Write a program that uses the DoubleSupplier functional interface to generate a random double
		//between 0 and 1.
		
		DoubleSupplier d1 = () -> Math.random()  * 1;
		System.out.println(d1.getAsDouble());
		
	}

}
