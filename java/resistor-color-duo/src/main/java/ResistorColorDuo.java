import java.util.List;

class ResistorColorDuo {

    List<String> resColors = List.of(
        "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"
    );

    int value(String[] colors) {

        if (colors.length < 2) { throw new IllegalArgumentException(); }

        return resColors.indexOf(colors[0]) * 10 + resColors.indexOf(colors[1]);
    }
}
