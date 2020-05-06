import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Gigasecond {

    private LocalDateTime localDateTime;
    private long gigaSecond = 1_000_000_000;

    public Gigasecond(LocalDate moment) {
        this(LocalDateTime.of(moment, LocalTime.of(0, 0, 0)));
    }

    public Gigasecond(LocalDateTime moment) {
        localDateTime = moment.plusSeconds(gigaSecond);
    }

    public LocalDateTime getDateTime() {
        return localDateTime;
    }
}
