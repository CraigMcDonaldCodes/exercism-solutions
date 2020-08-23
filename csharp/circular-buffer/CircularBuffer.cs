using System;

public class CircularBuffer<T>
{
    private T[] _data;
    private int _readPos;
    private int _writePos;

    public CircularBuffer(int capacity)
    {
        if (capacity < 1) { throw new ArgumentException(); }
        _data = new T[capacity];

        _readPos = -1;
        _writePos = 0;
    }

    public T Read()
    {
        if (_readPos == -1) {
            throw new InvalidOperationException();
        }

        T value = _data[_readPos];
        _readPos++;

        return value;
    }

    public void Write(T value)
    {
        // TODO Is this the best way to manage this
        if (_readPos == -1) { _readPos = 0; }

        _data[_writePos] = value;
        _writePos++;
        _writePos %= _data.Length;
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