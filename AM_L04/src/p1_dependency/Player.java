package p1_dependency;

public class Player {
	private String name;
	
	public void play(Dice dice) {
		dice.rolls();
	}
}
