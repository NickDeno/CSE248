package p1_ships;

public class EnemyShipFactory {
    public EnemyShip createEnemyShip(String type){
        switch(type){
        case "large":
            return new LargeEnemyShip();
        case "median":
            return new MedianEnemyShip();
        case "small":
            return new SmallEnemyShip();
        default:
            return null;
        }
    }
}
