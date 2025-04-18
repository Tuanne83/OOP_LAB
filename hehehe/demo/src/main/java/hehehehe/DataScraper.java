import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataScraper {
    public static List<Product> scrapeShopeeData(String url) {
        List<Product> products = new ArrayList<>();
        
        try {
            // Tải trang Shopee
            Document doc = Jsoup.connect(url).get();
            
            // Lấy tất cả các sản phẩm trên trang
            Elements productElements = doc.select(".shopee-search-item-result__item");
            
            for (Element productElement : productElements) {
                String name = productElement.select(".yQmmFK").text();  // Tên sản phẩm
                String price = productElement.select(".zp9xm5").text();  // Giá sản phẩm
                String description = productElement.select(".Z1F5d4").text();  // Mô tả (nếu có)
                String rating = productElement.select(".shopee-rating-stars__score").text();  // Đánh giá
                
                // Tạo đối tượng Product
                Product product = new Product(name, price, description, rating);
                products.add(product);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return products;
    }

    public static void main(String[] args) {
        // URL của trang Shopee cần thu thập
        String url = "https://shopee.vn/search?keyword=sữa%20rửa%20mặt";
        
        List<Product> products = scrapeShopeeData(url);
        
        // Chuyển đối tượng Java thành JSON (lưu vào file JSON)
        saveDataToJSON(products);
    }

    public static void saveDataToJSON(List<Product> products) {
        // Dùng Gson để chuyển danh sách sản phẩm thành JSON
        com.google.gson.Gson gson = new com.google.gson.Gson();
        String json = gson.toJson(products);
        
        try (java.io.FileWriter writer = new java.io.FileWriter("shopee_products.json")) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
