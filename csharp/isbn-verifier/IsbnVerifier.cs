using System.Text.RegularExpressions;

public static class IsbnVerifier
{
    public static bool IsValid(string isbnNumber)
    {
        if (isbnNumber == null || !ValidIsbnString(isbnNumber))
        {
            return false;
        }

        long result = 0;
        int multiplier = 10;

        foreach (var item in isbnNumber)
        {
            if (item == '-')
            {
                continue;
            }
            else if (item == 'X' || item == 'x')
            {
                result += multiplier * 10;
            }
            else if (char.IsDigit(item))
            {
                result += multiplier * (long)item;
            }
            multiplier--;
        }

        return result % 11 == 0;
    }

    private static bool ValidIsbnString(string isbnNumber)
    {
        var regexMatch = new Regex(@"^\d-?\d\d\d-?\d\d\d\d\d-?(\d|x|X)$").Match(isbnNumber);
        return regexMatch.Success;
    }
}
