package org;

public class AIAssistant {
    public static String generateRecommendation(Product product) {
        return "Sản phẩm \"" + product.title + "\" có thể là lựa chọn tốt cho bạn. " +
               "Thương hiệu: " + product.brand + " | Giá: " + product.price + " | Đánh giá: " + product.rating + " | Mô tả: " + product.description;
    }
}

