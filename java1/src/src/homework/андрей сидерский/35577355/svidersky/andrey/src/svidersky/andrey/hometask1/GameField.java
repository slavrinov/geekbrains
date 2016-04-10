package svidersky.andrey.hometask1;

/**
 * Created by User1 on 31.03.2016.
 */
public class GameField
{


    private int[][] _position;
    private int _size;

    GameField()
    {
        _size=3;
        _position=new int[_size][_size];
        for(int i = 0; i<_size; ++i)
            for(int j = 0; j< _size; ++j)
                _position[i][j]=Game.NOBODY;
        this.drawField();
    }

    GameField(int size)
    {
        _size=size;
        _position=new int[_size][_size];
        for(int i = 0; i<_size; ++i)
            for(int j = 0; j< _size; ++j)
                _position[i][j]=Game.NOBODY;
        this.drawField();
    }

    public int[][] getPosition()
    {
        return _position;
    }

    public void drawField()
    {



        for(int i = 0; i< _size; ++i)
        {
            for (int j = 0; j < _size; ++j) {
                if (_position[i][j] ==Game.NOBODY)
                    System.out.print("_ ");
                else
                {
                    if ((_position[i][j] == Game.PLAYERO))
                        System.out.print("O ");
                    else
                        System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public void setCurrentPosition(int row, int column,int who )
    {
        _position[row][column]=who;
    }
}
