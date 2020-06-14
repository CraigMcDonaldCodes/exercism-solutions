import java.util.HashSet;
import java.util.Random;

public class Robot {

    private static HashSet<String> robotNames = new HashSet<String>();
    private String name;

    private static String generateName() {

        var sb = new StringBuilder();
        var rand = new Random();

        // Two uppercase chars
        sb.append((char)(rand.nextInt(26) + 65));
        sb.append((char)(rand.nextInt(26) + 65));

        // Three numbers
        sb.append(rand.nextInt(9));
        sb.append(rand.nextInt(9));
        sb.append(rand.nextInt(9));

        return sb.toString();
    }

    private static String getNextName() {

        String name = generateName();

        while (!robotNames.contains(name)) {
            name = generateName();
            robotNames.add(name);
        }

        return name;
    }

    public Robot() {
        setup();
    }

    private void setup() {
        name = getNextName();
    }

    public String getName() {
        return name;
    }

    public void reset() {
        setup();
    }
}
