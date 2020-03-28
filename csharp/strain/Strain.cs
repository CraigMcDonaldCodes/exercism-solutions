using System;
using System.Collections.Generic;

// Using basic language features as request
public static class Strain
{
    public static IEnumerable<T> Keep<T>(this IEnumerable<T> collection, Func<T, bool> predicate)
    {
        var data = new List<T>();

        foreach (T item in collection)
        {
            if (predicate.Invoke(item)) { data.Add(item); }
        }

        return data;
    }

    public static IEnumerable<T> Discard<T>(this IEnumerable<T> collection, Func<T, bool> predicate)
    {
        var data = new List<T>();

        foreach(T item in collection)
        {
            if (!predicate.Invoke(item)) { data.Add(item); }
        }

        return data;
    }
}