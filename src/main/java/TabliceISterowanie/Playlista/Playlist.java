package TabliceISterowanie.Playlista;

import java.util.concurrent.TimeUnit;

public class Playlist {

    public static int playlistLength(Song... songs){
        int durationInSeconds = 0;
        for (int i = 0; i < songs.length; i++) {
            durationInSeconds = durationInSeconds + songs[i].getDurationInSeconds();
        }
        return durationInSeconds;
    }

    public static void printTime(int durationInSeconds){
        long hours = TimeUnit.SECONDS.toHours(durationInSeconds);
        long minutes = TimeUnit.SECONDS.toMinutes(durationInSeconds) % 60;
        long seconds = durationInSeconds % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
