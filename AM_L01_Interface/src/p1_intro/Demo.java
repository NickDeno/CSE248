package p1_intro;

public class Demo {

	public static void main(String[] args) {
		System.out.println(Moveable.COLLEGE_NAME); //Static variable of Movable Interface
		Moveable.fly(); // Static method of Movable Interface
		System.out.println();
		
		//MyMoveable Class Implementation (Creating Class to implement interface to create concrete object)
		//Allows us to implement walk and run abstract methods in MyMovable class.
		MyMoveable m1 = new MyMoveable();
		m1.walk();
		m1.run();
		m1.swim(); //Default method inherited from Movable Interface
		Moveable.fly(); //Static method from Movable Interface
		System.out.println();
		
		//Anonymous Class Implementation
		Moveable m2 = new Moveable() {
			@Override
			public void walk() {
				System.out.println("Walk!");
			}

			@Override
			public void run() {
				System.out.println("Run!");
			}
		};
		m2.walk();
		m2.run();
		m2.swim();
		
	}

}
