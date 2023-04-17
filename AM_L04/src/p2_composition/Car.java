package p2_composition;

public class Car {
	private final Engine engine;
	
	//Composition Relationship since "Car owns engine" or "engine is a part of car". Since the engine is created
	//in Car constructor, if we destroy/remove this Car object, the Engine object will be destroyed as well =>
	//composition relationship.
	
	//To ensure Car object cannot be built without creating Engine object since the engine is part of car, we can
	//add the "final" parameter to the Engine object.
	public Car() {
		engine = new Engine();
	}
}
