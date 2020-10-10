import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {

    private final String alphabet = "abcdefghijklmnopqrstuvwxyz";

    List<String> printToList(char a) {

        var list = new ArrayList<String>();
        int index = alphabet.indexOf(a);
        int length = ((index + 1) * 2) + 1;

        for (int i = 0; i <= length / 2; i++) {

        }
    }
}
