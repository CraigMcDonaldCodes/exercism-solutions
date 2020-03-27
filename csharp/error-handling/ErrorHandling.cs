using System;

public static class ErrorHandling
{
    public static void HandleErrorByThrowingException()
    {
        throw new Exception("Error codes? We don't need no stinking error codes.");
    }

    public static int? HandleErrorByReturningNullableType(string input)
    {
        if (Int32.TryParse(input, out int value))
        {
            return value;
        }
        else
        {
            return null;
        }
    }

    public static bool HandleErrorWithOutParam(string input, out int result)
    {
        return Int32.TryParse(input, out result);
    }

    public static void DisposableResourcesAreDisposedWhenExceptionIsThrown(IDisposable disposableObject)
    {
        disposableObject.Dispose();
        throw new Exception("Is this the exception you are looking for?");
    }
}
