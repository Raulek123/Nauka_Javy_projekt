package TabliceISterowanie.Playlista;

public class Song {
    private String name;
    private int durationInSeconds;

    public Song(String name, int durationInSeconds) {
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    public void setDurationInSeconds(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }
}
