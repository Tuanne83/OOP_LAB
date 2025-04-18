package org;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.List;

public class DataScraper {

    public static List<Product> scrapeDataFromJson(String filename) {
        try {
            // Khởi tạo ObjectMapper từ Jackson
            ObjectMapper objectMapper = new ObjectMapper();

            // Đọc file JSON và chuyển thành đối tượng Java
            File file = new File(DataScraper.class.getClassLoader().getResource(filename).toURI());
            Product[] products = objectMapper.readValue(file, Product[].class);  // Chuyển đổi thành mảng Product

            // In ra thông tin sản phẩm
            for (Product product : products) {
                System.out.println("Name: " + product.getName());
                System.out.println("Price: " + product.getPrice());
                System.out.println("Rating: " + product.getRating());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}


