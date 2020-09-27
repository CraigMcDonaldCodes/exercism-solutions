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

    }

    public Map<Character, Integer> nucleotideCounts() {
        return Collections.unmodifiableMap(data);
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
