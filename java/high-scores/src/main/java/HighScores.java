import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class HighScores {

    private List<Integer> scores;

    public HighScores(List<Integer> highScores) {
        scores = new ArrayList<>(highScores);
    }

    List<Integer> scores() {
        return Collections.unmodifiableList(scores);
    }

    Integer latest() {
        return scores.get(scores.size() - 1);
    }

    Integer personalBest() {

        return scores.stream()
                     .max(Integer::compare)
                     .get();
    }

    List<Integer> personalTopThree() {

        return scores.stream()
                     .sorted(Comparator.reverseOrder())
                     .limit(3)
                     .collect(Collectors.toList());
    }
}
