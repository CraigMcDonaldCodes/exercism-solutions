import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Anagram {

    private final String word;
    private final Map<Character, Integer> wordSummary;

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public Anagram(String word) {

        this.word= word.toLowerCase();
        wordSummary = summarizeWord(word);
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public List<String> match(List<String> words) {

        var list = new ArrayList<String>();

        for (String word : words) {

            var otherWordSummary = summarizeWord(word);
            boolean validWord = true;

            for (char key : otherWordSummary.keySet()) {

                // TODO: This is really ugly, look for a better way
                if (!(wordSummary.containsKey(key) && wordSummary.get(key) >= otherWordSummary.get(key))) {
                    validWord = false;
                    break;
                }
            }

            if (validWord) {
                list.add(word);
            }
        }

        return list;
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    private Map<Character, Integer> summarizeWord(String word) {

        // TODO: Probably a nice way to use streams for this
        var map = new HashMap<Character, Integer>();

        for (char c : word.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        return map;
    }
}
