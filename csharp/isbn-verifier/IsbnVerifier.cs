﻿using System;

public static class IsbnVerifier
{
    public static bool IsValid(string isbnNumber)
    {
        if (string.IsNullOrEmpty(isbnNumber) ||
            isbnNumber.Length != 13)
        {
                return false;
        }

        long result = 0;
        int multiplier = 10;

        foreach (var item in isbnNumber)
        {
            if (item == '-')             { continue; }
            else if (item == 'X')        { result += 10; }
            else if (char.IsDigit(item)) { result += multiplier * (long)item; }
            multiplier--;
        }

        return result % 11 == 0;
    }
}