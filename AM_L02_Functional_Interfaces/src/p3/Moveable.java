package p3;

public interface Moveable {
	int CREDIT = 4;
	void move(); //All interface methods have "public abstract" inferred
	
	default void eat() {
		System.out.println("Eat");
	}
	
	static void drink() {
		System.out.println("Drink!");
	}
}
