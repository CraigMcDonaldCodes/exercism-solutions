import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class Anagram {

    private final String word;
    private final SortedMap<Character, Integer> charCount;

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public Anagram(String word) {

        this.word= word;
        charCount = splitWord(word);
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public List<String> match(List<String> words) {

        var list = new ArrayList<String>();

        for (String word : words) {

            var otherCharCount = splitWord(word);

            for (char key : otherCharCount.keySet()) {

                if (charCount.containsKey(key)) {
                }
            }
        }

        return list;
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    private SortedMap<Character, Integer> splitWord(String word) {

        // TODO: Probably a nice way to use streams for this
        var map = new TreeMap<Character, Integer>();

        for (char c : word.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        return map;
    }
}
