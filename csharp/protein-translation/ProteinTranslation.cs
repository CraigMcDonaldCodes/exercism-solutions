using System;
using System.Collections.Generic;

public static class ProteinTranslation
{
    private static string STOP_VALUE = "STOP";
    private static string SKIP_VALUE = "SKIP";
    private static Dictionary<string, string> map = new Dictionary<string, string>() {
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
        throw new NotImplementedException();
    }
}