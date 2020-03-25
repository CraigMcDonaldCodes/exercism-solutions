using System;

public class CircularBuffer<T>
{
    private T[] _data;
    private int _rPosition;
    private int _wPosition;

    public CircularBuffer(int capacity)
    {
        if (capacity < 1) { throw new ArgumentException(); }
        _data = new T[capacity];

        _rPosition = -1;
        _wPosition = 0;
    }

    public T Read()
    {
        if (_rPosition == -1) {
            throw new InvalidOperationException();
        }

        T value = _data[_rPosition];
        _rPosition++;

        return value;
    }

    public void Write(T value)
    {
        // TODO Is this the best way to manage this
        if (_rPosition == -1) { _rPosition = 0; }

        _data[_wPosition] = value;
        _wPosition++;
        _wPosition %= _data.Length;
    }

    public void Overwrite(T value)
    {
        throw new NotImplementedException("You need to implement this function.");
    }

    public void Clear()
    {
        int capacity = _data.Length;
        _data = new T[capacity];
    }
}