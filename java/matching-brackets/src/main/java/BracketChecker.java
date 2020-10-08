import java.util.Stack;

public class BracketChecker {

    private final boolean matched;

    ////////////////////////////////////////////////////////////////////////////////
    public BracketChecker(final String text) {
        matched = calculate(text);
    }


    ////////////////////////////////////////////////////////////////////////////////
    public boolean areBracketsMatchedAndNestedCorrectly() {
        return matched;
    }


    ////////////////////////////////////////////////////////////////////////////////
    private boolean calculate(final String text) {

        var stack = new Stack<Character>();

        for (var c : text.toCharArray()) {
            
            // push l val [{(             
            // pop  r val [{)
            // checks matching pairs, break early
        }

        return stack.size() == 0;
    }
}
