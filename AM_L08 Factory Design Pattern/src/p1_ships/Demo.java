package p1_ships;

public class Demo {
    public static void main(String[] args){
        String type = "small";
        EnemyShip ship1 = EnemyShipFactory.createEnemyShip(type);
        System.out.println("Ship Name: " + ship1.getName() + ", Ship Speed: " + ship1.getSpeed());
    }
}
