package p1_ships;

public class Demo {
    public static void main(String[] args){
        String type = "small";
        EnemyShipFactory factory = new EnemyShipFactory();
        EnemyShip ship1 = factory.createEnemyShip(type);
        System.out.println("Ship Name: " + ship1.getName() + ", Ship Speed: " + ship1.getSpeed());
    }
}
