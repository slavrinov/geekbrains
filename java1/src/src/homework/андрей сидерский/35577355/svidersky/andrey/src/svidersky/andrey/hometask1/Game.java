package svidersky.andrey.hometask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


/**
 * Created by User on 31.03.2016.
 */
public class Game {
    private boolean _end;
    private int _who;
    public static final int SIZE = 3;
    public static final int NOBODY = -1;
    public static final int PLAYERO = 0;
    public static final int PLAYERX = 1;


    Game()
    {
        _end = false;
        _who = PLAYERX;

        System.out.println("New game. Make you move by entering two int digits row and column.");
        System.out.println("Fist move belongs to player with X. Make your moves in turn.");
        System.out.println();
    }

    int rowTemp, columnTemp;
    public void gameStart()
    {
        GameField newField = new GameField(SIZE);
        Random r = new Random();

        while (!_end)
        {
            if(_who==PLAYERX)
            {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

                try
                {
                    System.out.println("Input row. Press enter.");
                    rowTemp = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("Input column. Press enter.");
                    columnTemp = Integer.parseInt(bufferedReader.readLine());
                    System.out.println();

                } catch (IOException e) {
                    System.out.println("Wrong input. Try again.");
                    continue;
                } catch (NumberFormatException e) {
                    System.out.println("Wrong input. Try again.");
                    continue;
                }
            }
            if(_who==PLAYERO)
            {
                rowTemp=r.nextInt(SIZE);
                columnTemp=r.nextInt(SIZE);
            }
            if(this.checkRowColumn(rowTemp,columnTemp))
            {
                this.makeMove(rowTemp, columnTemp, newField);

                try
                {
                    Runtime.getRuntime().exec("clc");
                }
                catch (IOException e)
                {

                }

                newField.drawField();
                this.checkWin(newField.getPosition());
            }
            else
                System.out.println("Wrong numbers for row or column. Try again.");
        }
        System.out.println("Game Over");
    }

    public void makeMove(int row, int column, GameField field)
    {


        _end = true;
        for (int i = 0; i < SIZE; ++i)
            for (int j = 0; j < SIZE; ++j)
                if (field.getPosition()[i][j] == NOBODY)
                    _end = false;
        if (_end)
        {
            System.out.println("It's a draw.");
            System.out.println();
            return;
        }
        if (field.getPosition()[row][column] != NOBODY)
        {
            if(_who==PLAYERX)
                System.out.println("The field is occupied.Choose another field.");
            return;

        }
        field.setCurrentPosition(row, column, _who);

        if (_who == PLAYERX)
            _who = PLAYERO;
        else
        {
            _who = PLAYERX;
        }

    }


    public void checkWin(int[][] currentPosition)
    {
        for (int i = 0; i < SIZE; ++i)
        {
            if (((currentPosition[i][0] == currentPosition[i][1]) && (currentPosition[i][1] == currentPosition[i][2])))
            {
                this.checkPlayer(currentPosition[i][0]);
            }
            if (((currentPosition[0][i] == currentPosition[1][i]) && (currentPosition[1][i] == currentPosition[2][i])))
            {
                this.checkPlayer(currentPosition[0][i]);
            }
        }
        if ((currentPosition[0][0] == currentPosition[1][1]) && (currentPosition[1][1] == currentPosition[2][2]))
        {
            this.checkPlayer(currentPosition[0][0]);
        }
        if ((currentPosition[0][2] == currentPosition[1][1]) && (currentPosition[1][1] == currentPosition[2][0]))
        {
            this.checkPlayer(currentPosition[0][2]);
        }
    }

    private void checkPlayer(int pos)
    {
        if (pos == PLAYERO)
        {
            System.out.println("Player with O wins.");
            _end = true;
        }
        if ((pos == PLAYERX))
        {
            System.out.println("Player with X wins.");
            _end = true;
        }

    }

    private boolean checkRowColumn(int row, int column)
    {
        return((row>=0)&&(column>=0))&&((row<SIZE)&&(column<SIZE));
    }

}
