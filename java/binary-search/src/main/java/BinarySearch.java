import java.util.List;
import java.util.Objects;

public class BinarySearch {

    private List<Integer> list;

    public BinarySearch(List<Integer> list) {

        Objects.requireNonNull(list);
        this.list = list;
    }

    public int indexOf(int toFind) throws ValueNotFoundException {

        // Quick test for an empty list
        if (list.size() == 0) { throw new ValueNotFoundException("Value not in array"); }

        final int MAX_INDEX = list.size() - 1;
        final int MIN_INDEX = 0;
        int upper = MAX_INDEX;
        int lower = 0;
        int current = list.get(0);
        int index = (lower + upper) / 2;
        int lastIndex = Integer.MIN_VALUE;

        while ((index != MAX_INDEX) && (index != MIN_INDEX)) {

            index = (lower + upper) / 2;
            if (lastIndex == index) { break; }

            current = list.get(index);

            if (current == toFind) { break; }

            if (toFind > current) {

                if (MAX_INDEX == index + 1) {
                    lower = index + 1;
                } else {
                    lower = index;
                }
            } else {
                upper = index;
            }

            lastIndex = index;
        }

        if (current == toFind) {
            return index;
        } else {
            throw new ValueNotFoundException("Value not in array");
        }
    }
}
