import java.util.Map;
import java.util.Stack;

public class BracketChecker {

    private final boolean matched;
    private final Map<Character, Character> closingChar;

    public BracketChecker(final String text) {
        closingChar = Map.of(']', '[', '}', '{', ')', '(');
        matched = calculate(text);
    }

    public boolean areBracketsMatchedAndNestedCorrectly() {
        return matched;
    }

    private boolean calculate(final String text) {

        var stack = new Stack<Character>();

        for (var c : text.toCharArray()) {

            switch (c) {

                case '[':
                case '{':
                case '(':
                    stack.push(c);
                    break;
                case ']':
                case '}':
                case ')':
                    if (stack.size() > 0 && (stack.peek() == closingChar.get(c))) {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
            }
        }

        return stack.size() == 0;
    }
}
