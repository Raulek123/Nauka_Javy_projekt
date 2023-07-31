package TabliceISterowanie.Playlista;

public class Main {
    public static void main(String[] args) {
        Song song1 = new Song("Ulalala", 3000);
        Song song2 = new Song("Blanka", 600);

        int playlistLength = Playlist.playlistLength(song1, song2);
        Playlist.printTime(playlistLength);
    }
}
