package svidersky.andrey;

/**
 * Created by User on 08.04.2016.
 */
public enum Direction
{
    UP,RIGHT,DOWN,LEFT;

    public static Direction castToEnum(int i)
    {
        switch (i)
        {
            case (0):
                return Direction.UP;
            case (1):
                return Direction.RIGHT;
            case (2):
                return Direction.DOWN;
            case (3):
                return Direction.LEFT;
        }
         return Direction.UP;
    }

}
