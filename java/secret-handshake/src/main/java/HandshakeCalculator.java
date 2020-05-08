import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {

        var result = new ArrayList<Signal>();

        if ((number & 1) == 1)   { result.add(Signal.WINK); }
        if ((number & 2) == 2)   { result.add(Signal.DOUBLE_BLINK); }
        if ((number & 4) == 4)   { result.add(Signal.CLOSE_YOUR_EYES); }
        if ((number & 8) == 8)   { result.add(Signal.JUMP); }
        if ((number & 16) == 16) { Collections.reverse(result); }

        return result;
    }
}
