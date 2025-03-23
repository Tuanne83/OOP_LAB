package Lab02;

public class AimsProject {
    public static void main(String[] args) {
        //Create a new cart
    Cart anOrder = new Cart();
    
    //Create new dvd objects and add them to the cart
    DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
    anOrder.addDigitalVideoDisc(dvd1);

    DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
    anOrder.addDigitalVideoDisc(dvd2);

    DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation",  18.99f);
    anOrder.addDigitalVideoDisc(dvd3);
/* 14.1 ??Add a single DVD
        anOrder.addDigitalVideoDisc(dvd1);
        
        // Add multiple DVDs at once using the overloaded method
        DigitalVideoDisc[] dvdArray = { dvd2, dvd3 };
        anOrder.addDigitalVideoDisc(dvdArray);
 * 
 */
/*
 * 14.2
 * // Add two DVDs at once using the overloaded method
        anOrder.addDigitalVideoDisc(dvd1, dvd2);
        
        // Print total cost of the items in the cart
        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost());
 */
    //Print total cost of the items in the cart
    System.out.println("Total Cost is: " + anOrder.totalCost());
    anOrder.removeDigitalVideoDisc(dvd1);
    System.out.println("Total Cost is: " + anOrder.totalCost());
    }
    
}
