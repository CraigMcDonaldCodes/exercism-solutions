using System;
using System.Linq;
using System.Collections.Generic;

public static class Change
{
    public static int[] FindFewestCoins(int[] coins, int target)
    {
        var change = new List<int>();

        /*
        while (target != 0)
        {
            foreach (int coin in coins.Reverse())
            {
                if (target % coin == 0)
                {
                    change.Add(coin);
                    target -= coin;
                    break;
                }
            }
        }
        */

        for (int i = coins.Count() - 1; i >= 0; i--)
        {
            while (target >= coins[i])
            {
                change.Add(coins[i]);
                target -= coins[i];
            }
        }

        change.Reverse();
        return change.ToArray();
    }
}
