package p5;
import java.util.function.Supplier;

public class Demo {

	public static void main(String[] args) {
		//Create a program that uses the Supplier functional interface to generate a random number
		//between 1 and 100.
		Supplier<Integer> randSupplier = () -> (int)((Math.random() * 99) + 1);
		Integer randNum = randSupplier.get();
		System.out.println(randNum);

	}

}
