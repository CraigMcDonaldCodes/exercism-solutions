// This is a fucking dumb challenge

using System;

public static class Bob
{
    public static string Response(string statement)
    {
        // Clean this sucker up
        statement = statement.Trim();

        string msg = "Whatever.";

        if (statement.EndsWith("?"))
        {
            if (IsUpper(statement))
            {
                msg = "Calm down, I know what I'm doing!";
            }
            else {
                msg = "Sure.";
            }
        }
        else if (string.IsNullOrWhiteSpace(statement) || string.IsNullOrEmpty(statement))
        {
            msg = "Fine. Be that way!";
        }
        else if (statement.EndsWith("!") || IsUpper(statement))
        {
            msg = "Whoa, chill out!";
        }
        else if (IsUpper(statement)){
            msg = "Whoa, chill out!";
        }

        return msg;
    }

    private static bool IsUpper(string str)
    {
        bool isUpper = true;

        foreach (char s in str)
        {
            if (char.IsLetter(s) && !char.IsUpper(s)) { isUpper = false; break; }
        }

        return isUpper;
    }
}
