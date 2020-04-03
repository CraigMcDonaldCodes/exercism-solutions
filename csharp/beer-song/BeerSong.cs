using System.Text;

public static class BeerSong
{
    public static string Recite(int startBottles, int takeDown)
    {
        int bottles = startBottles;
        var sb = new StringBuilder();

        while (takeDown > 0)
        {
            sb.Append($"{bottles} bottles of beer on the wall, {bottles} bottles of beer.\n");
            bottles--;
            sb.Append($"Take one down and pass it around, {bottles} bottles of beer on the wall.");
            takeDown--;
        }

        return sb.ToString();
    }
}