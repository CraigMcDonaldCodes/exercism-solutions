import java.util.List;

class ResistorColor {

    private List<String> colors = List.of(
        "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"
    );

    int colorCode(String color) {
        return colors.indexOf(color);
    }

    String[] colors() {
        return colors.toArray(new String[0]);
    }
}
