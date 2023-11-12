import java.util.Objects;

public class LogLine {

    private final LogLevel logLevel;
    private final String shortLog;

    public LogLine(String logLine) {

        Objects.requireNonNull(logLine);

        // this is making assumptions that the supplied
        // string is in a correct format

        var tmp = logLine.substring(1, 4);

        logLevel = switch(tmp) {
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };

        // generate the short message
        shortLog = String.format("%d:%s", logLevel.getLevel(), logLine.substring(7));
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public String getOutputForShortLog() {
        return shortLog;
    }
}
