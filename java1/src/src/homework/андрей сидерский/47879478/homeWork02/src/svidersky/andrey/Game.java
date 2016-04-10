package svidersky.andrey;

import java.io.*;
import java.lang.invoke.SwitchPoint;
import java.util.*;

/**
 * Created by User on 07.04.2016.
 */
public class Game
{
    private  int countOfOnes=4;
    private  int countOfTwos=3;
    private  int countOfThrees=2;
    private  int countOfFours=1;
    private List<Ship> _allShips;


    public Game()
    {
        _allShips = new ArrayList<Ship>();

        _allShips.add(new Ship(TypeOfShip.FOUR));
        for (int i=0; i<countOfThrees; ++i)
            _allShips.add(new Ship(TypeOfShip.THREE));
        for (int i=0; i<countOfTwos; ++i)
            _allShips.add(new Ship(TypeOfShip.TWO));
        for (int i=0; i<countOfOnes; ++i)
            _allShips.add(new Ship(TypeOfShip.ONE));

        System.out.println("Please, enter your name");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s="";
        try
        {
             s = bufferedReader.readLine();
             System.out.println("Hello, "+s+'\n');
        }
        catch (IOException e)
        {
            System.out.println("Wrong name.");
        }


        GameField newGameField = new GameField();

        for(Ship ship:this._allShips)
            this.setRandomShips(ship,newGameField);

        newGameField.drawField();
        System.out.println("All ships are created!");
    }

    public List<Ship> get_allShips()
    {
        return _allShips;
    }

    public void set_allShips(List<Ship> allShips)
    {
        this._allShips = allShips;
    }


    private void setRandomShips(Ship ship,GameField field)
    {
        boolean end = false;
        int sizeOfField = field.get_size();
        int sizeOfShip = ship.get_type().ordinal();
        Random r = new Random();

        while (!end)
        {
            Again:
            {
                Direction dir=Direction.castToEnum(r.nextInt(4));
                int tempX = r.nextInt(sizeOfField);
                int tempY = r.nextInt(sizeOfField);

                switch (dir)
                {
                    case UP:
                        if(!isOutOfBorders(tempX,tempY-sizeOfShip,field))
                        {
                            if((tempY!=0)&&(tempX!=0)&&(tempY!=9)&&(tempX!=9))
                                if(isOccupied(tempX-1,tempY+1,field)||isOccupied(tempX+1,tempY+1,field)||isOccupied(tempX,tempY+1,field))
                                    break Again;
                            for (int i=0;i<=sizeOfShip; ++i)
                            {
                                if (isOccupied(tempX,tempY-i,field)||isNear(tempX,tempY-i,field,dir))
                                    break Again;
                            }
                            for (int i=0;i<=sizeOfShip; ++i)
                                field.setCurrentPosition(tempX,tempY-i,GameField.ALIVE);
                            end=true;
                        }
                        break;
                    case RIGHT:
                        if(!isOutOfBorders(tempX+sizeOfShip,tempY,field))
                        {
                            if((tempY!=0)&&(tempX!=0)&&(tempY!=9)&&(tempX!=9))
                                if(isOccupied(tempX-1,tempY-1,field)||isOccupied(tempX-1,tempY+1,field)||isOccupied(tempX-1,tempY,field))
                                    break Again;
                            for (int i=0;i<=sizeOfShip; ++i)
                            {
                                if (isOccupied(tempX+i,tempY,field)||isNear(tempX+i,tempY,field,dir))
                                break Again;
                            }
                            for (int i=0;i<=sizeOfShip; ++i)
                                field.setCurrentPosition(tempX+i,tempY,GameField.ALIVE);
                            end=true;
                        }
                        break;
                    case DOWN:
                        if(!isOutOfBorders(tempX,tempY+sizeOfShip,field))
                        {
                            if((tempY!=0)&&(tempX!=0)&&(tempY!=9)&&(tempX!=9))
                                if(isOccupied(tempX-1,tempY-1,field)||isOccupied(tempX+1,tempY-1,field)||isOccupied(tempX,tempY-1,field))
                                    break Again;
                            for (int i=0;i<=sizeOfShip; ++i)
                            {
                                if (isOccupied(tempX,tempY+i,field)||isNear(tempX,tempY+i,field,dir))
                                    break Again;
                            }
                            for (int i=0;i<=sizeOfShip; ++i)
                                field.setCurrentPosition(tempX,tempY+i,GameField.ALIVE);
                            end=true;
                        }
                        break;
                    case LEFT:
                        if(!isOutOfBorders(tempX-sizeOfShip,tempY,field))
                        {
                            if((tempY!=0)&&(tempX!=0)&&(tempY!=9)&&(tempX!=9))
                                if(isOccupied(tempX+1,tempY-1,field)||isOccupied(tempX+1,tempY+1,field)||isOccupied(tempX+1,tempY,field))
                                    break Again;
                            for (int i=0;i<=sizeOfShip; ++i)
                            {
                                if (isOccupied(tempX-i,tempY,field)||isNear(tempX-i,tempY,field,dir))
                                    break Again;

                            }
                            for (int i=0;i<=sizeOfShip; ++i)
                                field.setCurrentPosition(tempX-i,tempY,GameField.ALIVE);
                            end=true;
                        }
                        break;

                }
                if(end)
                {
                    ship.set_startPositionX(tempX);
                    ship.set_startPositionY(tempY);
                    ship.set_direction(dir);
                }
            }
        }

    }

    private boolean isOutOfBorders(int x, int y,GameField field)
    {
        return ((x>=field.get_size())||(y>=field.get_size())||(x<0)||(y<0));
    }

    private boolean isOccupied(int x, int y,GameField field)
    {
        return (field.getPosition()[x][y]==field.ALIVE);
    }

    private boolean isNear(int x, int y,GameField field,Direction dir)
    {
        if ((x>0)&&(y>0)&&(x<9)&&(y<9))
            switch(dir)
            {
                case UP:
                   return isOccupied(x+1,y,field)||isOccupied(x-1,y,field)||isOccupied(x+1,y+1,field)||isOccupied(x-1,y+1,field)||isOccupied(x,y+1,field);
                case RIGHT:
                    return isOccupied(x,y+1,field)||isOccupied(x,y-1,field)||isOccupied(x+1,y+1,field)||isOccupied(x+1,y-1,field)||isOccupied(x+1,y,field);
                case DOWN:
                    return isOccupied(x+1,y,field)||isOccupied(x-1,y,field)||isOccupied(x+1,y-1,field)||isOccupied(x-1,y-1,field)||isOccupied(x,y-1,field);
                case LEFT:
                    return isOccupied(x,y+1,field)||isOccupied(x,y-1,field)||isOccupied(x-1,y+1,field)||isOccupied(x-1,y-1,field)||isOccupied(x-1,y,field);

            }


        return false;
    }

}
