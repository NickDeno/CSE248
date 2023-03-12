package p1_funcInterface;

import java.util.function.Function;

public class Demo {
	
	public static void main(String[] args) {
		Function<Double, Double> square = (x)-> x *x;
		System.out.println(square.apply(5.0));
	}
	
}
