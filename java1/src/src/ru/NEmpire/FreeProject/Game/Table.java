package ru.NEmpire.FreeProject.Game;

/**
 * Created by Василий on 27.03.2016.
 */
public class Table {
    public char[][] table;

    public Table(char c){
        table = new char[5][5];

        for(int i= 0; i<5; i++){
            table[0][i] = '┈';
            table[4][i] = '┈';
        }
        for(int i = 1; i<4; i++){
            table[i][0] = '┊';
            table[i][4] = '┊';
        }
        for(int i = 1; i<4;i++){
            for(int k = 1; k<4; k++){
                table[i][k] = '▒';
            }
        }
    }
    public void render(){
        for(int i = 0; i<5;i++){
            for(int k = 0; k<5; k++){
                System.out.print(table[i][k]);
            }
            System.out.println();
        }
    }
    public void setTable(int x, int y, char c){
        table[x][y] = c;
    }


}
