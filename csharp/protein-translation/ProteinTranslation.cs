using System;
using System.Text.RegularExpressions;
using System.Collections.Generic;

public static class ProteinTranslation
{
    private static string CodonSplit = "(?<=\\G.{3})";
    private static string StopValue = "STOP";
    private static string SkipValue = "SKIP";
    private static Dictionary<string, string> map = new Dictionary<string, string>()
    {
        { "AUG", "Methionine" },
        { "UUU", "Phenylalanine" },
        { "UUC", "Phenylalanine" },
        { "UUA", "Leucine" },
        { "UUG", "Leucine" },
        { "UCU", "Serine" },
        { "UCC", "Serine" },
        { "UCA", "Serine" },
        { "UCG", "Serine" },
        { "UAU", "Tyrosine" },
        { "UAC", "Tyrosine" },
        { "UGU", "Cysteine" },
        { "UGC", "Cysteine" },
        { "UGG", "Tryptophan" },
        { "UAA", "STOP" },
        { "UAG", "STOP" },
        { "UGA", "STOP" }
    };

    public static string[] Proteins(string strand)
    {
        string[] rnaParts = Regex.Split(strand, CodonSplit);
        var result = new List<string>();

        foreach(var entry in rnaParts)
        {
            string current = map.GetValueOrDefault(entry, SkipValue);

            if (current == StopValue)
            {
                break;
            }
            else if (current == SkipValue)
            {
                continue;
            }
            else
            {
                result.Add(current);
            }
        }

        return result.ToArray();
    }
}