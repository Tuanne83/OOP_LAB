package org;

public class Sunscreen extends Product {
    private String spf;  // Chỉ số SPF

    // Constructor
    public Sunscreen(String title, String brand, String price, String originalPrice, String description, String rating, String ratingCount, String spf) {
        super(title, brand, price, originalPrice, description, rating, ratingCount);
        this.spf = spf;
    }

    @Override
    public void displayDetails() {
        System.out.println("Kem chống nắng: " + title + " | Thương hiệu: " + brand + " | Giá: " + price + " | SPF: " + spf);
    }

    @Override
    public boolean matchesKeyword(String keyword) {
        return title.toLowerCase().contains(keyword.toLowerCase()) || description.toLowerCase().contains(keyword.toLowerCase());
    }
}

