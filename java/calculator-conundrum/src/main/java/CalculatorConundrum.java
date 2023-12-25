public class CalculatorConundrum {

    public String calculate(int operand1, int operand2, String operation) {

        if (operation == null) {
                throw new IllegalArgumentException("Operation cannot be null");
        }

        if (operation.isEmpty()) {
                throw new IllegalArgumentException("Operation cannot be empty");
        }

        var prefix = "%d %s %d = ".formatted(operand1, operation, operand2);
        String answer = null;

        switch (operation) {
            case "+":
                answer = prefix + (operand1 + operand2);
                break;
            case "-":
                answer = prefix + (operand1 - operand2);
                break;
            case "*":
                answer = prefix + (operand1 * operand2);
                break;
            case "/":
                if (operand2 == 0) {
                    throw new IllegalOperationException("Division by zero is not allowed", new ArithmeticException());
                }
                answer = prefix + (operand1 / operand2);
                break;
            default:
                throw new IllegalOperationException("Operation '%s' does not exist".formatted(operation));
        }

        return answer;
    }
}
