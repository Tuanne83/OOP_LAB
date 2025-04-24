package hust.soict.globalict.aims.media;
import hust.soict.globalict.aims.media.Disc;
public class DigitalVideoDisc extends Disc implements Playable{
    private static int nbDigitalVideoDiscs = 0; 
    private String director;
    private int length;

    

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    
    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category,String director, int length, float cost) {
        super(title, category, cost, length, director);
    }
    
    public String toString() {
        return "DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getLength() + ": " + this.getCost() + "$"; 
    }

    public boolean isMatch(String titleToCompare) {
        return this.getTitle().equalsIgnoreCase(titleToCompare);
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'play'");
    }

    
}
