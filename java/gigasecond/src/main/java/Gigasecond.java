import java.time.*;
import java.time.temporal.TemporalAccessor;

/**
 * Created by johan on 2017-02-18.
 */
public class Gigasecond {
    long epochBirthTime;
    public Gigasecond(LocalDate date) {
        this.epochBirthTime = date.atStartOfDay(ZoneOffset.UTC).toInstant().getEpochSecond();
    }

    public Gigasecond(LocalDateTime dateTime) {
        this.epochBirthTime  = dateTime.toInstant(ZoneOffset.UTC).getEpochSecond();
    }

    public LocalDateTime getDate() {
        Instant i = Instant.ofEpochSecond(epochBirthTime + 1000000000);
        return LocalDateTime.ofInstant(i, ZoneOffset.UTC);
    }
}
