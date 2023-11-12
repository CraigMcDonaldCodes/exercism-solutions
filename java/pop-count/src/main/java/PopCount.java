public class PopCount {

    public int eggCount(int number) {

        // cheating solution, probably slow as fuck too
        // return (int) Integer.toBinaryString(number).chars().filter(c -> c == '1').count();

        int count = 0;

        // don't care about the correct order, just need to count 'em
        while (number != 0) {
            if (number % 2 == 1) { count++; }
            number /= 2;
        }

        return count;
    }
}
