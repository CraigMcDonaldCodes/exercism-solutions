import java.math.BigInteger;

class Grains {

    private final int MAX_SQUARES = 64;

    BigInteger grainsOnSquare(final int square) {

        return new BigInteger(Double.toString(Math.pow(2, square - 1)));
    }

    BigInteger grainsOnBoard() {
        return grainsOnSquare(MAX_SQUARES);
    }
}

