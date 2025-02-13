package playlist;

import java.util.Comparator;

public class ArtistTitleComparator implements Comparator<Song> {

    @Override
    public int compare(Song obj1, Song obj2) {
        int artistCompare = obj1.getArtist().compareTo(obj2.getArtist());
        if (artistCompare != 0) {
            return artistCompare;
        }
        return obj1.getTitle().compareTo(obj2.getTitle());
    }
}
