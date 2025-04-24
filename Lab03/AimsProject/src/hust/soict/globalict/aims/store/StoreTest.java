package hust.soict.globalict.aims.store;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
    
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);

       store.addDVD(dvd1);
       store.addDVD(dvd2);
       store.addDVD(dvd3);
        
              // Hiện lên để check xem cho đồ vô chưa
        store.displayStore();
        System.out.println("\nTesting removeDVD:");
       store.removeDVD(dvd2);
       store.displayStore();
    }
}
