package Lab02.AIMS;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    public static final int MAX_NUMBER_ORDER = 20;
    private List<DigitalVideoDisc> qtyOrdered = new ArrayList<>(); 
    
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {   
        if (qtyOrdered.size() >= MAX_NUMBER_ORDER) { 
            System.out.println("The cart is full");
        } else {
            qtyOrdered.add(disc);
            System.out.println("The disc has been added");
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {   
        if (qtyOrdered.size() + dvdList.length > MAX_NUMBER_ORDER) {
            System.out.println("Not enough space in the cart to add all DVDs");
        } else {
            for (DigitalVideoDisc dvd : dvdList) {
                qtyOrdered.add(dvd);
                System.out.println("The disc " + dvd.getTitle() + " has been added");
            }
        }
     }
    // Overloaded method to add two DVDs at once
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {   
        if (qtyOrdered.size() + 2 > MAX_NUMBER_ORDER) {
            System.out.println("Not enough space in the cart to add both DVDs");
        } else {
            qtyOrdered.add(dvd1);
            qtyOrdered.add(dvd2);
            System.out.println("Both discs have been added");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered.size() == 0) {
            System.out.println("The cart is empty");
        } else {
            qtyOrdered.remove(disc);
            System.out.println("The disc has been removed");
        }
    }

    /*  public float totalCost() {  
        float total = 0;
        for (DigitalVideoDisc disc : qtyOrdered) {
            total += disc.getCost();
        }
        return total;
    } */
    public float totalCost() {  
        float total = 0;
        // Display each item in the cart with sequence number, title, and cost
        for (int i = 0; i < qtyOrdered.size(); i++) {
            DigitalVideoDisc disc = qtyOrdered.get(i);
            System.out.println((i + 1) + ". " + disc.getTitle() + " " + disc.getCost());
            total += disc.getCost();
        }
        return total;
    }
}
