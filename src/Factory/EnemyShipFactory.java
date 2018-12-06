package Factory;

public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String newShipType){
        //Receive a string and based on that string
        //creates a type of enemy ship.
        EnemyShip newShip = null;

        if (newShipType.equals("U")){
            return new UFOEnemyShip();
        }
        else if (newShipType.equals("R")){
            return new RocketEnemyShip();
        }
        else if (newShipType.equals("B")){
            return new BigUFOEnemyShip();
        }
        return null;
    }
}
