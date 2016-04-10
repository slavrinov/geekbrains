package lesson3.shipgame;

/**
 * Created by Alla on 06.08.2014.
 */
public class Cell {
    zinchenko.alla.Ship owner;
    boolean busy;
    int x,y;

    Cell(int x, int y){
        this.x = x;
        this.y = y;
        this.busy = true;
    }

    Cell[] toBusyCell(Cell BusyCells[], int x, int y){
        Cell newCell = new Cell(x,y);
        int l = BusyCells.length;
        System.out.println("l" + l);
        //Cell[] temp = new Cell[BusyCells.length+1];
        //temp[l+1] = newCell;
       // for (int i = 0; i < l+1; i++) {
        //    System.out.println("Занятые клетки" +temp);
        //}
    return BusyCells;
    }

}
