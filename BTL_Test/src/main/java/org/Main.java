package org;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Đọc dữ liệu từ file JSON
        List<Product> facialCleansers = DataScraper.scrapeDataFromJson("facial_cleansers_data.json");
        List<Product> sunscreens = DataScraper.scrapeDataFromJson("sunscreen_data.json");
        List<Product> moisturizerCreams = DataScraper.scrapeDataFromJson("moisturizer_cream_data.json");

        // Kết hợp tất cả các sản phẩm vào một danh sách
        List<Product> allProducts = new ArrayList<>();
        allProducts.addAll(facialCleansers);
        allProducts.addAll(sunscreens);
        allProducts.addAll(moisturizerCreams);

        // Tạo đối tượng SearchEngine
        SearchEngine searchEngine = new SearchEngine(allProducts);

        // Ví dụ tìm kiếm sản phẩm theo từ khóa
        List<Product> searchResults = searchEngine.searchByKeyword("dưỡng ẩm");

        // Hiển thị các sản phẩm tìm được
        for (Product product : searchResults) {
            product.displayDetails();
            System.out.println(AIAssistant.generateRecommendation(product));
        }
    }
}
