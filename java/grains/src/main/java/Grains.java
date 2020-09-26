import java.math.BigInteger;

class Grains {

    private final int BASE = 2;
    private final int MIN_SQUARES = 1;
    private final int MAX_SQUARES = 64;
    private final String MSG_OUT_OF_RANGE = "square must be between 1 and 64";

    BigInteger grainsOnSquare(final int square) {

        boolean outOfRange = square < MIN_SQUARES
                             ||
                             square > MAX_SQUARES;

        if (outOfRange) {
            throw new IllegalArgumentException(MSG_OUT_OF_RANGE);
        }

        return BigInteger.valueOf(BASE)
                         .pow(square - 1);
    }

    BigInteger grainsOnBoard() {

        return BigInteger.valueOf(BASE)
                         .pow(MAX_SQUARES)
                         .subtract(BigInteger.valueOf(1));
    }
}

