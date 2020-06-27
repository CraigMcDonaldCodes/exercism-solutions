public class BeerSong {

    private final String TEMPLATE =
        "%d bottles of beer on the wall, %d bottles of beer.\n" +
        "Take one down and pass it around, %d bottles of beer on the wall.\n\n";
    private final String THIRD_LAST_MESSAGE =
        "2 bottles of beer on the wall, 2 bottles of beer.\n" +
        "Take one down and pass it around, 1 bottle of beer on the wall.\n\n";
    private final String SECOND_LAST_MESSAGE =
        "1 bottle of beer on the wall, 1 bottle of beer.\n" +
        "Take it down and pass it around, no more bottles of beer on the wall.\n\n";
    private final String LAST_MESSAGE =
        "No more bottles of beer on the wall, no more bottles of beer.\n" +
        "Go to the store and buy some more, 99 bottles of beer on the wall.\n\n";

    public BeerSong() {
    }

    public String sing(int start, int round) {

        var sb = new StringBuilder();

        while (round > 0) {

            if (start == 0) {
                sb.append(LAST_MESSAGE);
            } else if (start == 1) {
                sb.append(SECOND_LAST_MESSAGE);
            } else if (start == 2) {
                sb.append(THIRD_LAST_MESSAGE);
            } else {
                sb.append(
                    String.format(TEMPLATE, start, start, start -1)
                );
            }

            start--;
            round--;
        }

        return sb.toString();
    }

    public String singSong() {
        return sing(99, 100);
    }
}
