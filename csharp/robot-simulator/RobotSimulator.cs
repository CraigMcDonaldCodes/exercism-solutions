using System;

public enum Direction
{
    North,
    East,
    South,
    West
}

public class RobotSimulator
{
    private Direction _direction;
    private (int X, int Y) _position;

    public RobotSimulator(Direction direction, int x, int y)
    {
        _position.X = x;
        _position.Y = y;
        _direction = direction;
    }

    public Direction Direction
    {
        get
        {
            return _direction;
        }
    }

    public int X
    {
        get
        {
            return _position.X;
        }
    }

    public int Y
    {
        get
        {
            return _position.Y;
        }
    }

    public void Move(string instructions)
    {
        foreach (char c in instructions.ToLower())
        {
            switch (c)
            {
                case 'l': ; break;
                case 'r': ; break;
                case 'a': ; break;
            }
        }
    }
}
