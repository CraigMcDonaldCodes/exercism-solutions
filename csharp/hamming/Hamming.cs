using System;

public static class Hamming
{
    public static int Distance(string firstStrand, string secondStrand)
    {
        if (firstStrand.Length != secondStrand.Length)
        {
            throw new ArgumentException("Invalid argument");
        }

        int count = 0;

        for(int i = 0; i < firstStrand.Length; count++)
        {
            if (firstStrand[i] != secondStrand[i]) { count++; }
        }

        return count;
    }
}