using System.Text;

public static class BeerSong
{
    private const string Template = 
        "{0} bottles of beer on the wall, {0} bottles of beer.\n" +
        "Take one down and pass it around, {1} bottles of beer on the wall.";
    private const string ThirdLastMessage = 
        "2 bottles of beer on the wall, 2 bottles of beer.\n" +
        "Take one down and pass it around, 1 bottle of beer on the wall.";
    private const string SecondLastMessage =
        "1 bottle of beer on the wall, 1 bottle of beer.\n" +
        "Take it down and pass it around, no more bottles of beer on the wall.";
    private const string LastMessage =
        "No more bottles of beer on the wall, no more bottles of beer.\n" +
        "Go to the store and buy some more, 99 bottles of beer on the wall.";
        
    public static string Recite(int start, int round)
    {
        var sb = new StringBuilder();

        while (round > 0)
        {
            switch (start)
            {
                case 0:
                    sb.Append(LastMessage);
                    break;
                case 1:
                    sb.Append(SecondLastMessage);
                    break;
                case 2:
                    sb.Append(ThirdLastMessage);
                    break;
                default:
                    sb.Append(string.Format(Template, start, start - 1));
                    break;
            }

            if (round > 1) { sb.Append("\n\n"); }

            start--;
            round--;
        }

        return sb.ToString();
    }
}