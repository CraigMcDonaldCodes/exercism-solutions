import java.util.stream.IntStream;

class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {

        int sum = IntStream.rangeClosed(1, input)
                           .sum();

        return (int)Math.pow(sum, 2);
    }

    int computeSumOfSquaresTo(int input) {

        return IntStream.rangeClosed(1, input)
                        .map(s -> (int)Math.pow(s, 2))
                        .sum();
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }
}
