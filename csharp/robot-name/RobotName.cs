using System;
using System.Collections.Generic;
using System.Text;

public class Robot
{
    private static List<string> names;
    private string name;

    static Robot()
    {
        names = new List<string>();
    }

    public Robot()
    {
        name = NewName();
    }

    public string Name
    {
        get
        {
            return name;
        }
    }

    public void Reset()
    {
        name = NewName();
    }

    private string NewName()
    {
        var rand = new Random();
        var sb = new StringBuilder();
        bool notFound = true;

        while (notFound)
        {
            sb.Clear();
            sb.Append((char)rand.Next(65, 90));
            sb.Append((char)rand.Next(65, 90));
            sb.Append(rand.Next(9));
            sb.Append(rand.Next(9));
            sb.Append(rand.Next(9));

            if (!names.Contains(sb.ToString()))
            {
                notFound = false;
            }
        }

        names.Add(sb.ToString());

        return sb.ToString();
    }
}