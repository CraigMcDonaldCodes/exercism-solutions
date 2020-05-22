import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

class ProteinTranslator {

    private final HashMap<String, String> map;
    private final String STOP_VALUE = "STOP";
    private final String SKIP_VALUE = "SKIP";

    public ProteinTranslator() {

        map = new HashMap<String, String>();
        map.put("AUG", "Methionine");
        map.put("UUU", "Phenylalanine");
        map.put("UUC", "Phenylalanine");
        map.put("UUA", "Leucine");
        map.put("UUG", "Leucine");
        map.put("UCU", "Serine");
        map.put("UCC", "Serine");
        map.put("UCA", "Serine");
        map.put("UCG", "Serine");
        map.put("UAU", "Tyrosine");
        map.put("UAC", "Tyrosine");
        map.put("UGU", "Cysteine");
        map.put("UGC", "Cysteine");
        map.put("UGG", "Tryptophan");
        map.put("UAA", "STOP");
        map.put("UAG", "STOP");
        map.put("UGA", "STOP");
    }

    List<String> translate(String rnaSequence) {

        // Not sure of a cleaner way to split the string into equal parts
        String[] rnaParts = rnaSequence.split("(?<=\\G.{3})");
        var result = new ArrayList<String>();

        for (var entry: rnaParts) {

            String current = map.getOrDefault(entry, SKIP_VALUE);

            if (current.equals(STOP_VALUE)) {
                break;
            } else if (current.equals(SKIP_VALUE)) {
                continue;
            } else {
                result.add(current);
            }
        }

        return result;
    }
}

