package svidersky.andrey;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by User1 on 06.04.2016.
 */
public class GameField
{
    private int[][] _position;
    private int _size;
    public static  final int NOBODY=-1;
    public static  final int ALIVE=1;
    public static final int DEAD=0;

        GameField()
        {
            _size=10;
            _position=new int[_size][_size];
            for(int i = 0; i<_size; ++i)
                for(int j = 0; j< _size; ++j)
                    _position[i][j]=NOBODY;
        }

        GameField(int size)
        {
            _size=size;
            _position=new int[_size][_size];
            for(int i = 0; i<_size; ++i)
                for(int j = 0; j< _size; ++j)
                    _position[i][j]=NOBODY;
        }

        public int[][] getPosition()
        {
            return _position;
        }
        public int get_size()
         {
              return _size;
         }

        public void drawField()
        {


            System.out.println("   A B C D E F G H I H");

            for(int i = 0; i< _size; ++i)
            {
                System.out.print(i+1+((i>8) ?" ":"  "));


                for (int j = 0; j < _size; ++j)
                {
                    if (_position[i][j] ==NOBODY)
                        System.out.print("_ ");
                    else
                    {
                        if ((_position[i][j] == ALIVE))
                            System.out.print("* ");
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
