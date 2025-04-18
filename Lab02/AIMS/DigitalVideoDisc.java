package Lab02.AIMS;

public class DigitalVideoDisc {
    private static int nbDigitalVideoDiscs = 0; 
    private int id;
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }
    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title) {
        nbDigitalVideoDiscs++;  // Increment the count of DVDs created
        this.id = nbDigitalVideoDiscs;
        super();
        this.title = title;
    }


    public DigitalVideoDisc(String title, String category, float cost) {
        nbDigitalVideoDiscs++;  // Increment the count of DVDs created
        this.id = nbDigitalVideoDiscs;
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        nbDigitalVideoDiscs++;  // Increment the count of DVDs created
        this.id = nbDigitalVideoDiscs;
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        nbDigitalVideoDiscs++;  // Increment the count of DVDs created
        this.id = nbDigitalVideoDiscs;
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
