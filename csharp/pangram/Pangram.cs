using System;
using System.Collections.Generic;

public static class Pangram
{
    public static bool IsPangram(string input)
    {
        var data = new List<char>("abcdefghijklmnopqrstuvwxyz");

        foreach (char c in input.ToLower())
        {
            data.Remove(c);
            if (data.Count == 0) { break; }
        }

        return data.Count == 0;
    }
}
