package org;

public class FacialCleanser extends Product {
    private String skinType;  // Loại da (da dầu, da khô, da nhạy cảm)

    // Constructor
    public FacialCleanser(String title, String brand, String price, String originalPrice, String description, String rating, String ratingCount, String skinType) {
        super(title, brand, price, originalPrice, description, rating, ratingCount);
        this.skinType = skinType;
    }

    @Override
    public void displayDetails() {
        System.out.println("Sữa rửa mặt: " + title + " | Thương hiệu: " + brand + " | Giá: " + price + " | Loại da: " + skinType);
    }

    @Override
    public boolean matchesKeyword(String keyword) {
        return title.toLowerCase().contains(keyword.toLowerCase()) || description.toLowerCase().contains(keyword.toLowerCase());
    }
}

