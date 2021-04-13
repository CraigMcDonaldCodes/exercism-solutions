using System;
using System.Linq;

public static class DifferenceOfSquares
{
    /**************************************************************************************************/
    public static int CalculateSquareOfSum(int max)
    {
        int sum = Enumerable.Range(1, max)
                            .Sum();

        return (int)(Math.Pow(sum, 2));
    }


    /**************************************************************************************************/
    public static int CalculateSumOfSquares(int max)
    {
        return Enumerable.Range(1, max)
                         .Select(s => (int)(Math.Pow(s, 2)))
                         .Sum();
    }


    /**************************************************************************************************/
    public static int CalculateDifferenceOfSquares(int max)
    {
        return CalculateSquareOfSum(max) - CalculateSumOfSquares(max);
    }
}