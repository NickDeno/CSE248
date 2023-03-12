package p1;

public class Demo {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		Moveable.drink(); //static interface method
		MyMoveable m1 = new MyMoveable();
		m1.move();
		m1.eat();
	}

}
