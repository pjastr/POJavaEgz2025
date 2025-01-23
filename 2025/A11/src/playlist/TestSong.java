package playlist;

import java.util.Arrays;

public class TestSong {

    public static void main(String[] args) {
        Song[] songs = new Song[5];
        songs[0] = new Song("Song 1", "Artist 1", 100);
        songs[1] = new Song("Song 2", "Artist 2", 200);
        songs[2] = new Song("Song 1", "Artist 1", 300);
        songs[3] = new Song("Song 2", "Artist 4", 200);
        songs[4] = new Song("Song 5", "Artist 5", 100);
        System.out.println("Before sorting:");
        for (Song song : songs) {
            System.out.println(song);
        }
        System.out.println("Afer sorting:");
        Arrays.sort(songs, new DurationComparator().thenComparing(new ArtistTitleComparator()));
        for (Song song : songs) {
            System.out.println(song);
        }
    }
}
