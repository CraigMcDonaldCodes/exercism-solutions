using System;
using System.Collections.Generic;

public static class NucleotideCount
{
    private const string ErrorMessage = "Invalid nucleotide value.";

    public static IDictionary<char, int> Count(string sequence)
    {
        var data = new Dictionary<char, int>();

        // Populate the valid keys
        data['A'] = 0;
        data['C'] = 0;
        data['G'] = 0;
        data['T'] = 0;

        foreach(char c in sequence)
        {
            if (data.ContainsKey(c))
            {
                data[c]++;
            }
            else
            {
                // Key not found, not a valid nucleotide value
                throw new ArgumentException(ErrorMessage);
            }
        }

        return data;
    }
}