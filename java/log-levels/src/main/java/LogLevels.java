import java.util.Objects;

public class LogLevels {

    public static String message(String logLine) {

        Objects.requireNonNull(logLine);

        var message = logLine.substring(logLine.indexOf(" ") + 1);
        message = message.trim();

        return message;
    }

    public static String logLevel(String logLine) {

        Objects.requireNonNull(logLine);
        String logLevel = null;

        if (logLine.contains("INFO")) {
            logLevel = "info";
        }

        if (logLine.contains("ERROR")) {
            logLevel = "error";
        }

        if (logLine.contains("WARNING")) {
            logLevel = "warning";
        }

        return logLevel;
    }

    public static String reformat(String logLine) {

        Objects.requireNonNull(logLine);

        return String.format(
            "%s (%s)",
            message(logLine),
            logLevel(logLine)
        );
    }
}
