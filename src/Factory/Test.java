package Factory;

import java.util.Scanner;

public class Test {

    public static void main(String[] args){

        EnemyShipFactory theFactory = new EnemyShipFactory();
        EnemyShip theEnemy = null;
        Scanner userInput = new Scanner(System.in);
        System.out.println("What type of ship? U / R / B");
        String shipType = userInput.nextLine();
        theEnemy = theFactory.makeEnemyShip(shipType);

        if (theEnemy != null){
            theEnemy.displayEnemyShip();
        }
        else System.out.println("Invalid input.");


    }
}
