using System;
using System.Collections.Generic;

public static class MatchingBrackets
{
    private static IDictionary<char, char> ClosingChar = new Dictionary<char, char>
    {
        { ']', '['},
        { '}', '{'},
        { ')', ')'}
    };


    public static bool IsPaired(string input)
    {
        var stack = new Stack<char>();

        foreach(var c in input)
        {

            switch(c)
            {
                case '[':
                case '{':
                case '(':
                    stack.Push(c);
                    break;
                case ']':
                case '}':
                case ')':
                    if (stack.Count > 0 && stack.Peek() == ClosingChar[c])
                    {
                        stack.Pop();
                    }
                    else
                    {
                        return false;
                    }
                    break;
            }
        }

        return stack.Count == 0;
    }
}
