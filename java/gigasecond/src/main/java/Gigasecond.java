import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
<<<<<<< HEAD
 * Created by johan on 2017-02-18.
 */
public class Gigasecond {
    long epochBirthTime;
    public Gigasecond(LocalDate date) {
        this.epochBirthTime  = Instant.from(date).getEpochSecond();
    }

    public Gigasecond(LocalDateTime dateTime) {
        epochBirthTime  = Instant.from(dateTime).getEpochSecond();
    }

    public LocalDateTime getDate() {
        Instant i = Instant.ofEpochSecond(epochBirthTime + 1000000000);
        return LocalDateTime.ofInstant(i);
    }
}
