package p5_built_in_funcInterfaces;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo {
	public static void main(String[] args) {
		BiFunction<Double, Double, Double> func1 = (x,y) -> x+y; //Takes in 2 Double values, returns Double
		System.out.println(func1.apply(10.5, 20.5));
		System.out.println();
		
		Function<Double,String> func2 = (x) -> String.valueOf(x * 2); //Takes in Double value, returns String
		System.out.println(func2.apply(100.5));
		System.out.println();
		
		Consumer<String> c1 = (s) -> System.out.println(s); //Takes in a data type and "consumes it"(uses it). No return
		Consumer<String> c2 = System.out::println; //Method reference version
		c1.accept("Hello World");
		c2.accept("Bye World");
		System.out.println();
		
		Predicate<Double> p1 = (x) -> x > 3.5; //"Tests if x is > 3.5, If so returns true'
		System.out.println(p1.test(3.6));
		System.out.println(p1.test(3.2));
		System.out.println();
		
		Supplier<Double> s1 = () -> Math.random() * 100; //Takes in no data type, it is "supplying" a Double number
		Double num = s1.get();
		System.out.println(num);
		System.out.println();
	}
}
