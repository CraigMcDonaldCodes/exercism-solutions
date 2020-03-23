using System;
using System.Collections.Generic;
using System.Linq;

public class HighScores
{
    private List<int> data;

    public HighScores(List<int> list)
    {
        data = list;
    }

    public List<int> Scores()
    {
        return new List<int>(data);
    }

    public int Latest()
    {
        return data.Last();
    }

    public int PersonalBest()
    {
        return data.Max();
    }

    public List<int> PersonalTopThree()
    {
        return new List<int>(data.OrderByDescending(x => x).Take(3));
    }
}