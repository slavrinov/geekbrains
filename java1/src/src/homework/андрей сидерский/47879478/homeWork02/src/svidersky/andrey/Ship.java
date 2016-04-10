package svidersky.andrey;

/**
 * Created by User1 on 06.04.2016.
 */
public class Ship
{

    private TypeOfShip _type;
    private int _startPositionX;
    private int _startPositionY;
    private Direction _direction;
    private boolean _alive;

    Ship()
    {
        _alive=true;
    }
    public Ship(TypeOfShip t)
    {
         _type=t;
    }

    public TypeOfShip get_type()
    {
        return _type;
    }

    public void set_type(TypeOfShip type)
    {
        this._type = type;
    }

    public int get_startPositionX()
    {
        return _startPositionX;
    }

    public void set_startPositionX(int startPositionX)
    {
        this._startPositionX = startPositionX;
    }

    public int get_startPositionY()
    {
        return _startPositionY;
    }

    public void set_startPositionY(int startPositionY)
    {
        this._startPositionY = startPositionY;
    }

    public Direction get_direction()
    {
        return _direction;
    }

    public void set_direction(Direction direction)
    {
        this._direction = direction;
    }


}
