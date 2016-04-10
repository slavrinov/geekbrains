package lesson3.shipgame;

/**
 * Created by Alla on 06.08.2014.
 */

public class Field {

    // 4-хпалубный
    public static final int BATTLESHIP_COUNT = 1;
    public static final int BATTLESHIP_DECK = 4;

    // 3-хпалубный
    public static final int CRUISER_COUNT = 2;
    public static final int CRUISER_DECK = 3;

    // 2-х
    public static final int DESTOYER_COUNT = 3;
    public static final int DESTOYER_DECK = 2;

    // 1 клетка
    public static final int SUBMARINE_COUNT = 5;
    public static final int SUBMARINE_DECK = 1;

    int x0,y0;
    int fieldsize = 10;

    Cell BusyCells[] = new Cell[21];
    Ship battleship;

    public Field(){

        // создание однопалубных кораблей

        // генерирование первой точки корабля
        int x = (int)(Math.random()*10);
        int y = (int)(Math.random()*10);

        System.out.println(x);
        System.out.println(y);

        Ship[] submarines = new Ship[SUBMARINE_COUNT];
        for (int i = 0; i < SUBMARINE_COUNT; i++) {
            submarines[i] = new Ship(x, y, true, SUBMARINE_DECK);
            System.out.println("Submarine " + i + " is created!");
        }

        // создание 2-х палубных кораблей

        // генерирование первой точки корабля
        x = (int)(Math.random()*10);
        y = (int)(Math.random()*10);

        System.out.println(x);
        System.out.println(y);

        Ship[] destoyer = new Ship[DESTOYER_COUNT];
        for (int i = 0; i < DESTOYER_COUNT; i++) {
            submarines[i] = new Ship(x, y, true, DESTOYER_DECK);
            System.out.println("Destoyer " + i + " is created!");
        }

        // создание 3-х палубных кораблей

        // генерирование первой точки корабля
        x = (int)(Math.random()*10);
        y = (int)(Math.random()*10);

        System.out.println(x);
        System.out.println(y);

        Ship[] cruiser = new Ship[CRUISER_COUNT];
        for (int i = 0; i < CRUISER_COUNT; i++) {
            submarines[i] = new Ship(x, y, true, CRUISER_DECK);
            System.out.println("Cruiser " + i + " is created!");
        }

        // создание 4-х палубного корабля

        // генерирование первой точки корабля
        x = (int)(Math.random()*10);
        y = (int)(Math.random()*10);

        System.out.println(x);
        System.out.println(y);

        Ship battleship = new Ship(x, y, true, BATTLESHIP_DECK);
        Cell newCell = new Cell (x, y);
        //BusyCells = newCell.toBusyCell(BusyCells, x, y);
        System.out.println("Battleship is created!");

        boolean hit = battleship.isHit(3, 3);

    }
}
