package hust.soict.globalict.aims.media;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;   
public abstract class Media {
    protected int id;
    private String title;
    private String category;
    private float cost;
    private static int numMedia =0;
    List<Media> mediae = new ArrayList<Media>();
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    public Media(String title, String category, float cost ){
        this.id = ++numMedia;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    @Override
    public boolean equals (Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null || !(obj instanceof Media)){
            return false;
        }
        Media other= (Media) obj;
        return this.title.equals(other.getTitle());
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    
}
