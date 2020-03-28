using System.Collections.Generic;
using System.Linq;

public static class SumOfMultiples
{
    public static int Sum(IEnumerable<int> multiples, int max)
    {
        return Enumerable.Range(1, max - 1)
                         .Where(x => multiples.Where(y => y != 0 && x % y == 0).Count() > 0)
                         .Sum();
    }
}
