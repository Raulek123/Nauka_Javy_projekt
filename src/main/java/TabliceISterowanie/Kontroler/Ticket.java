package TabliceISterowanie.Kontroler;

import java.time.Duration;
import java.time.LocalDateTime;

public class Ticket {
    private LocalDateTime deletionTime;
    private int expirationTime;

    public Ticket(int expirationTime) {
        this(LocalDateTime.now(), expirationTime);
    }

    public Ticket(LocalDateTime deletionTime, int expirationTime) {
        this.deletionTime = deletionTime;
        this.expirationTime = expirationTime;
    }

    public LocalDateTime getDeletionTime() {
        return deletionTime;
    }

    public void setDeletionTime(LocalDateTime deletionTime) {
        this.deletionTime = deletionTime;
    }

    public int getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(int expirationTime) {
        this.expirationTime = expirationTime;
    }
    public boolean isValid(){
        LocalDateTime currentTime = LocalDateTime.now();
        Duration duration = Duration.between(deletionTime, currentTime);
       return duration.toMinutes() < expirationTime;
    }
}
