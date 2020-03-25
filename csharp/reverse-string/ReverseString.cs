using System;
using System.Text;

public static class ReverseString
{
    // Must be an shorter way to reverse a string
    public static string Reverse(string input)
    {
        if (String.IsNullOrEmpty(input) || input.Length == 1 )
        {
            return input;
        }

        var sb = new StringBuilder();

        for (int i = input.Length - 1; i >= 0; i--)
        {
            sb.Append(input[i]);
        }

        return sb.ToString();
    }
}