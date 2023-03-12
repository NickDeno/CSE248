package p1_intro;

public class MyMoveable implements Moveable {

	@Override
	public void walk() {
		System.out.println("Walk!");
	}

	@Override
	public void run() {
		System.out.println("Run!");
	}

}
