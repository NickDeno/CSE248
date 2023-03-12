package p1_intro;

public interface Moveable {	
	public static final String COLLEGE_NAME = "SCCC"; //Only type of variables aloud in interface
	
	//abstract methods: Delays implementation of methods
	void walk();
	void run();
	
	//static methods: Already implemented methods that can be accessed by calling Movable Class
	public static void fly() {
		System.out.println("Fly!!");
	}
	
	//Default methods: Inherited by subclasses of Movable interface 
	public default void swim() {
		System.out.println("Swim!!");
	}
}
