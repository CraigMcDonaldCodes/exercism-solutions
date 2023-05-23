class Lasagna
{
    private int COOKING_TIME = 40;
    private int MINUTES_PER_LAYER = 2;

    /// <summary>
    /// How many minutes the lasagna should be in the oven.
    /// </summary>
    public int ExpectedMinutesInOven() => COOKING_TIME;

    /// <summary>
    /// How many minutes the lasagna still has to remain in the oven.
    /// </summary>
    public int RemainingMinutesInOven(int time) => ExpectedMinutesInOven() - time;

    /// <summary>
    /// How many minutes you spent preparing the lasagna.
    /// </summary>
    public int PreparationTimeInMinutes(int layers) => MINUTES_PER_LAYER * layers;

    /// <summary>
    /// How many minutes you've worked on cooking the lasagna.
    /// </summary>
    public int ElapsedTimeInMinutes(int layers, int time) => PreparationTimeInMinutes(layers) + time;
}
