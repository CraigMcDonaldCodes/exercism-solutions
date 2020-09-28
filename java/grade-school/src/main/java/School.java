import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.TreeMap;

public class School {

    private final int MIN_GRADE = 1;
    private final int MAX_GRADE = 7;
    private final String MSG_OUT_OF_RANGE = "Grade not in range.";
    private final Map<Integer, Set<String>> grades;

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public School() {
        grades = createDataStructure();
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public void add(final String name, final int grade) {

        if (invalidGrade(grade)) { throw new IllegalArgumentException(MSG_OUT_OF_RANGE); }

        grades.get(grade).add(name);
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public List<String> grade(final int grade) {

        if (invalidGrade(grade)) { throw new IllegalArgumentException(MSG_OUT_OF_RANGE); }

        return new ArrayList<String>(grades.get(grade));
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public List<String> roster() {

        var tmpRoster = new ArrayList<String>();

        grades.values()
              .forEach(g -> tmpRoster.addAll(g));

        return tmpRoster;
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    private Map<Integer, Set<String>> createDataStructure() {

        var tmpData = new TreeMap<Integer, Set<String>>();

        for (int i = MIN_GRADE; i <= MAX_GRADE; i++) {
            tmpData.put(i, new TreeSet<String>());
        }

        return tmpData;
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    private boolean invalidGrade(final int grade) {

        return grade < MIN_GRADE
               ||
               grade > MAX_GRADE;
    }
}
