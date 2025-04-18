package org;

public abstract class Product {
    protected String name;
    protected String title;         // Tên sản phẩm
    protected String brand;         // Thương hiệu
    protected String price;         // Giá sản phẩm
    protected String originalPrice; // Giá gốc (nếu có)
    protected String description;   // Mô tả sản phẩm
    protected String rating;        // Đánh giá
    protected String ratingCount;   // Số lượng đánh giá

    // Constructor
    public Product(String title, String brand, String price, String originalPrice, String description, String rating, String ratingCount) {
        this.title = title;
        this.brand = brand;
        this.price = price;
        this.originalPrice = originalPrice;
        this.description = description;
        this.rating = rating;
        this.ratingCount = ratingCount;
    }

    public Product(String name, String title, String brand, String price, String originalPrice, String description, String rating, String ratingCount) {
        this.name = name;
        this.title = title;
        this.brand = brand;
        this.price = price;
        this.originalPrice = originalPrice;
        this.description = description;
        this.rating = rating;
        this.ratingCount = ratingCount;
    }

    // Các phương thức trừu tượng sẽ được implement trong các lớp con
    public abstract void displayDetails();
    public abstract boolean matchesKeyword(String keyword);

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
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

    public String getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(String ratingCount) {
        this.ratingCount = ratingCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

