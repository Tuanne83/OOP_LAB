package hust.soict.globalict.aims.media;
import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();
    public CompactDisc(String title, String category, float cost, String artist, ArrayList<Track> tracks) {
        super(title, category, cost);
        this.artist = artist;
        this.tracks = tracks;
    }
    public CompactDisc(String title, String category, float cost) {
        super(title, category, cost);
        tracks = new ArrayList<>();
    }
    public String getArtist() {
        return artist;
    }
    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
        }
    }
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
        }
    }
    public int getLength() {
        for (Track track:tracks) {
            length += track.getLength();
        }
        return length;
    }
@Override
    public void play() {
        // TODO Auto-generated method stub
        for (Track track: tracks) {
            track.play();
        }
    }
}
