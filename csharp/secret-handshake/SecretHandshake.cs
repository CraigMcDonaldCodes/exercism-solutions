using System.Collections.Generic;

public static class SecretHandshake
{
    public static string[] Commands(int commandValue)
    {
        var result = new List<string>();

        if ((commandValue & 1) == 1)   { result.Add("wink"); }
        if ((commandValue & 2) == 2)   { result.Add("double blink"); }
        if ((commandValue & 4) == 4)   { result.Add("close your eyes"); }
        if ((commandValue & 8) == 8)   { result.Add("jump"); }
        if ((commandValue & 16) == 16) { result.Reverse(); }

        return result.ToArray();
    }
}
