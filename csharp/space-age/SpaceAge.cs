using System;

public class SpaceAge
{
    private readonly int _seconds;
    public double EarthYears { get; private set; }

    public SpaceAge(int seconds)
    {
        _seconds = seconds;
    }

    public double OnEarth() => _seconds / 31_557_600.0;

    public double OnMercury() => OnEarth() / 0.2_408_467;

    public double OnVenus() => OnEarth() / 0.61_519_726;

    public double OnMars() => OnEarth() / 1.8_808_158;

    public double OnJupiter() => OnEarth() / 11.8_626_15;

    public double OnSaturn() => OnEarth() / 29.447_498;

    public double OnUranus() => OnEarth() / 84.016_846;

    public double OnNeptune() => OnEarth() / 164.79_132;
}