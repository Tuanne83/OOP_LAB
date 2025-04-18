package hehehe;

public class Sunscreen extends Product {
    private int spf;                  // Chỉ số SPF
    private boolean isWaterResistant;  // Có chống nước không?

    @Override
    public void displayDetails() {
        System.out.println("Kem chống nắng: " + name + " | Giá: " + price + "đ | SPF: " + spf);
    }

    @Override
    public boolean matchesKeyword(String keyword) {
        return name.toLowerCase().contains(keyword.toLowerCase()) ||
               description.toLowerCase().contains(keyword.toLowerCase());
    }
}

