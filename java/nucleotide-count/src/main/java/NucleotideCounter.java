import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class NucleotideCounter {

    private final String input;
    private final Map<Character, Integer> data;

    public NucleotideCounter(final String input) {

        this.input = Objects.requireNonNull(input);
        data = prepDataStructure();
        parseSuppliedData(input);
    }

    public Map<Character, Integer> nucleotideCounts() {
        return Collections.unmodifiableMap(data);
    }

    public String getInput() {
        return input;
    }

    private void parseSuppliedData(final String input) {

        for (var c : input.toCharArray()) {

            if (data.containsKey(c)) {
                data.put(c, data.get(c) + 1);
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    private Map<Character, Integer> prepDataStructure() {

        var data = new HashMap<Character, Integer>();
        data.put('A', 0);
        data.put('C', 0);
        data.put('G', 0);
        data.put('T', 0);

        return data;
    }

}
