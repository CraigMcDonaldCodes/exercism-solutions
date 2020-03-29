using System;

public static class BinarySearch
{
    public static int Find(int[] input, int value)
    {
        if (input.Length == 0) return -1;

        int low = 0;
        int high = input.Length - 1;
        int mid = high / 2;

        while (value != input[mid] && high != low)
        {
            if (value > input[mid])
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }

            mid = (high + low) / 2;
        }

        return input[mid] == value ? mid : -1;
    }
}