using System;

public static class ArmstrongNumbers
{
    public static bool IsArmstrongNumber(int number)
    {
        int power = number.ToString().Length;
        int currentValue = number;
        long sum = 0;

        while (currentValue > 0)
        {
            sum += (long)Math.Pow(currentValue % 10, power);
            currentValue /= 10;
        }

        return number == sum;
    }
}