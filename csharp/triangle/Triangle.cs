using System;
using System.Linq;

public static class Triangle
{
    public static bool IsScalene(double side1, double side2, double side3)
    {
        if (anyZero(side1, side2, side3))
        {
            return false;
        }
        else
        {
            return sideEqualCount(side1, side2, side3) == 0;
        }
    }

    public static bool IsIsosceles(double side1, double side2, double side3) 
    {
        if (anyZero(side1, side2, side3))
        {
            return false;
        }
        else
        {
            return sideEqualCount(side1, side2, side3) == 2;
        }
    }

    public static bool IsEquilateral(double side1, double side2, double side3) 
    {
        if (anyZero(side1, side2, side3))
        {
            return false;
        }
        else
        {
            return sideEqualCount(side1, side2, side3) == 3;
        }
    }

    private static int sideEqualCount(double s1, double s2, double s3)
    {
        int count = 0;

        if (s1 == s2) { count++; }
        if (s1 == s3) { count++; }
        if (s2 == s3) { count++; }

        return count;
    }

    private static bool anyZero(double s1, double s2, double s3)
    {
        return s1 == 0 || s2 == 0 || s3 == 0;
    }
}