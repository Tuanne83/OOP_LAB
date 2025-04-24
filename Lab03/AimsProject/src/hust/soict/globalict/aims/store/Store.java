package hust.soict.globalict.aims.store;
import java.util.ArrayList;
import java.util.List;

import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;
public class Store {
    public static final int MAX_STORE_ITEMS = 100;
    private ArrayList<Media> itemsInStore = new ArrayList<>();

    public void addMedia(Media media) {
        if (itemsInStore.size() >= MAX_STORE_ITEMS || getMedia(media.getTitle()) != null) {
            return;
        }
        itemsInStore.add(media);
    }

    public void removeMedia(String title) {
        itemsInStore.remove(getMedia(title));
    }

    public Media getMedia(String titleMedia) {
        for (Media media : itemsInStore) {
            if (media.getTitle().equals(titleMedia)) {
                return media;
            }
        }
        return null;
    }
    }
    
    

