package p2;

public class Demo {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		Moveable.drink(); //static interface method
		
		Moveable m1 = new Moveable() { //Anonymous class implementation of Moveable interface 
			@Override
			public void move() {
				System.out.println("Move!");
			}		
		};
		m1.eat();
		m1.move();
	}

}
