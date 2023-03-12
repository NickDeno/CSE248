package p3;

public class Demo {

	public static void main(String[] args) {
		Moveable.drink(); //static interface method
		Moveable m1 = new Moveable() { //Anonymous class implementation of Moveable interface 
			@Override
			public void move() {
				System.out.println("Move!");
			}		
		};
		m1.eat();
		m1.move();
		
		Moveable m2 = () -> System.out.println("Move!"); //Lambda expression of implementing Moveable (1 expression)
		Moveable m3 = () -> {            //Another implementation of lambda expression but with multiple expressions
			System.out.println("Move!");
			System.out.println("Move Again!");
		};
		m2.move();
		m3.move();
	}

}
