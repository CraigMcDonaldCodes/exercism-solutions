import java.util.HashSet;

public class PangramChecker {

    public boolean isPangram(String input) {

        var set = new HashSet<Character>();
        var chars = input.toLowerCase().toCharArray();

        for (var c : chars) {

            if (c >= 'a' && c <= 'z') {
                set.add(c);
            }
        }

        return set.size() == 26;
    }
}
