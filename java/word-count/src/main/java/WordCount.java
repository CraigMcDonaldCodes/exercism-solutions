import java.util.HashMap;
import java.util.Map;

public class WordCount {

    public static Map<String, Integer> phrase(String sentence) {

        sentence = sentence.toLowerCase().trim();

        var map = new HashMap<String, Integer>();
        // String[] words = sentence.split("[^\\w\\d']+");
        String[] words = sentence.split("[^\\w']+");

        for(String w: words) {

            if (map.containsKey(w)) {
                map.put(w, map.get(w) + 1);
            } else {
                map.put(w, 1);
            }
        }

        return map;
    }
}
