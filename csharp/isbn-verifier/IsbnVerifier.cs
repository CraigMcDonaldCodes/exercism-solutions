public static class IsbnVerifier
{
    public static bool IsValid(string isbnString)
    {
        string isbn = isbnString.Replace("-", "").ToLower();

        if (isbn.Length != 10)
        {
            return false;
        }

        int sum = 0;
        int count = 10;

        foreach (var value in isbn)
        {
            if (char.IsNumber(value))
            {
                sum += (int)char.GetNumericValue(value) * count;
            }
            else if (value == 'x' && count == 1)
            {
                sum += 10;
            }
            else
            {
                // Some value that is not valid, finish early
                sum = -1;
                break;
            }

            count--;
        }

        return sum % 11 == 0;
    }
}