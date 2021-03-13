using System;

public static class Darts
{
    private const int OuterScore = 1;
    private const int MiddleScore = 5;
    private const int InnerScore = 10;

    public static int Score(double x, double y)
    {
        var radius = Math.Sqrt(x * x + y *y);
        int score = 0;

        if (radius > 10)
        {
            // Outside the circle, no score
        }
        else if (radius > 5)
        {
            // Outer radius
            score = OuterScore;
        }
        else if (radius > 1)
        {
            // Middle radius
            score = MiddleScore;
        }
        else if (radius >= 0)
        {
            // Inner radius
            score = InnerScore;
        }
       
        return score;
    }
}
