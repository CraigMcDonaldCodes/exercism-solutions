using System;

public class Clock
{
    private static int MinHours = 0;
    private static int MaxHours = 24;
    private static int MinMinutes = 0;
    private static int MaxMinutes = 60;

    private int _hours;
    private int _minutes;

    public Clock(int hours, int minutes)
    {
        _hours = hours;
        _minutes = minutes;
    }

    public Clock Add(int minutesToAdd)
    {
        throw new NotImplementedException("You need to implement this function.");
    }

    public Clock Subtract(int minutesToSubtract)
    {
        throw new NotImplementedException("You need to implement this function.");
    }

    public override string ToString() 
    {
        return $"{_hours:00}:{_minutes:00}";
    }
}
