public class Product {
    private String name;
    private String price;
    private String description;
    private String rating;

    // Constructor
    public Product(String name, String price, String description, String rating) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.rating = rating;
    }

    // Getter và Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
