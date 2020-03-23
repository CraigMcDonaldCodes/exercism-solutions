using System;
using System.Linq;
using System.Text;

public static class Acronym
{
    public static string Abbreviate(string phrase)
    {
        phrase = phrase.ToUpper();
        var sb = new StringBuilder();

        foreach (var s in phrase.Split(new char[] {' ', '-', '_'}))
        {
            if (s.Length == 0) { continue; }

            char c = s[0];
            
            if (Char.IsLetter(c))
            {
                sb.Append(c);
            }
        }

        return sb.ToString();
    }
}