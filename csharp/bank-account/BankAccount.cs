using System;

public class BankAccount
{
    private enum Status { Open, Closed, NA }

    private readonly object _lock;

    private decimal _balance;
    private Status _status;

    public BankAccount()
    {
        _status = Status.NA;
        _lock = new object();
    }

    public void Open()
    {
        _status = Status.Open;
        _balance = 0;
    }

    public void Close()
    {
        lock(_lock)
        {
            _status = Status.Closed;
        }
    }

    public decimal Balance
    {
        get
        {
            if (_status == Status.Open)
            {
                return _balance;
            }
            else
            {
                throw new InvalidOperationException("Account is not open.");
            }
        }
    }

    public void UpdateBalance(decimal change)
    {
        lock(_lock)
        {
            if (_status == Status.Open)
            {
                _balance += change;
            }
        }
    }
}
