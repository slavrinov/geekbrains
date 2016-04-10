package lesson3.shipgame;

/**
 * Created by Alla on 06.08.2014.
 */
public class Ship {
    int x, y;
    boolean oriental;
    public int hitCounter = 0;
    int deck;
    boolean isHit;
    public boolean isDied;
    lesson3.shipgame.Cell[] shipCells;

    Ship(int x, int y, boolean oriental, int deck) {
        this.x = x;
        this.y = y;
        this.oriental = oriental;
        this.deck = deck;

        shipCells = new Cell[deck];
        // корабль горизонтальный oriental = true
        // корабль вертикальный oriental = false

        shipCells[0] = new Cell(x, y);

        for (int i = 1; i < deck; i++) {
            if (oriental == true) {
                shipCells[i] = new Cell(x + i, y);
            } else {
                shipCells[i] = new Cell(x, y + i);
            }
            shipCells[i].busy = true;
        }
    }

    public boolean isHit(int x, int y) {
        if (this.oriental == true) {
            if (x >= this.x && x <= (this.x + this.deck) && y == this.y) {
                isHit = true;
                System.out.println("Yes");
                hitCounter++;
            } else {
                isHit = false;
                System.out.println("No");
            }
        }
        if (this.oriental == false) {
            if (y >= this.y && y <= (this.y + this.deck) && x == this.x) {
                isHit = true;
                System.out.println("Yes");
                hitCounter++;
            } else {
                isHit = false;
                System.out.println("No");
            }
        }
        if (hitCounter == this.deck){
            isDied = true;
            System.out.println("Ship is died");
        } else {
            isDied = false;
        }
        return isDied;
        }
}