import java.util.List;
import java.util.Objects;

public class BinarySearch {

    public static void main(String... args) {

        DEBUG = true;
    }

    private static final int NOT_FOUND = -1;
    private static boolean DEBUG = false;
    private List<Integer> list;

    public BinarySearch(List<Integer> list) {

        Objects.requireNonNull(list);
        this.list = list;
    }

    public int indexOf(int toFind) throws ValueNotFoundException {

        int upper = list.size() - 1;
        int lower = 0;
        int index;
        int current;

        while (true) {

            index = (upper + lower) / 2;
            current = list.get(index);

            if (current == toFind) { break; }
            if (upper == lower)    { break; }

            if (toFind > current) {
                lower = index;
            } else {
                upper = index;
            }

            if (DEBUG) {
                System.out.println("index: " + index);
                System.out.println("upper: " + upper);
                System.out.println("lower: " + lower);
            }
        }

        if (current == toFind) {
            return index;
        } else {
            throw new ValueNotFoundException("Value not in array");
        }
    }
}
