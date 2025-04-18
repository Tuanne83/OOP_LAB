import com.fasterxml.jackson.databind.ObjectMapper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ShopeeFaceWashCrawler {
    // Lớp để biểu diễn dữ liệu sản phẩm
    static class Product {
        private String name;
        private String price;
        private String description;
        private String rating;
        private List<String> reviews;

        // Constructor
        public Product(String name, String price, String description, String rating, List<String> reviews) {
            this.name = name;
            this.price = price;
            this.description = description;
            this.rating = rating;
            this.reviews = reviews;
        }

        // Getters and setters (tạo tự động bằng IDE hoặc viết tay nếu cần)
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getPrice() { return price; }
        public void setPrice(String price) { this.price = price; }
        public String getDescription() { return description; }
        public void setDescription(String description) { this.description = description; }
        public String getRating() { return rating; }
        public void setRating(String rating) { this.rating = rating; }
        public List<String> getReviews() { return reviews; }
        public void setReviews(List<String> reviews) { this.reviews = reviews; }
    }

    public static void main(String[] args) {
        // URL tìm kiếm sữa rửa mặt trên Shopee
        String url = "https://shopee.vn/search?keyword=s%E1%BB%AFa%20r%E1%BB%ADa%20m%E1%BA%B7t";

        try {
            // Danh sách lưu trữ các sản phẩm
            List<Product> products = new ArrayList<>();

            // Kết nối và lấy dữ liệu từ Shopee
            Document doc = Jsoup.connect(url)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36")
                    .get();

            // Lấy danh sách các sản phẩm từ trang tìm kiếm
            Elements productElements = doc.select("div.shopee-search-item-result__item");

            // Giới hạn số sản phẩm để crawl (ví dụ: 10 sản phẩm)
            int limit = Math.min(productElements.size(), 10);
            for (int i = 0; i < limit; i++) {
                Element productElement = productElements.get(i);

                // Lấy tên sản phẩm
                String name = productElement.select("div._3Gla5X > div._3UZI0W > div").text();

                // Lấy giá sản phẩm
                String price = productElement.select("div._3e3aQH > span._2lG9Tt").text();

                // Lấy link sản phẩm để crawl chi tiết
                String productLink = "https://shopee.vn" + productElement.select("a").attr("href");

                // Crawl trang chi tiết sản phẩm
                Document detailDoc = Jsoup.connect(productLink)
                        .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36")
                        .get();

                // Lấy mô tả sản phẩm
                String description = detailDoc.select("div._3oW_FM").text();

                // Lấy đánh giá (rating)
                String rating = detailDoc.select("div._1oL4LU").text();

                // Lấy các review (bình luận)
                List<String> reviews = new ArrayList<>();
                Elements reviewElements = detailDoc.select("div._3Z6HUl > div._3eJ7Ul");
                for (Element review : reviewElements) {
                    String reviewText = review.select("div._3eJ7Ul").text();
                    if (!reviewText.isEmpty()) {
                        reviews.add(reviewText);
                    }
                }

                // Tạo đối tượng sản phẩm
                Product product = new Product(name, price, description, rating, reviews);
                products.add(product);

                // In thông tin sản phẩm để kiểm tra
                System.out.println("Product: " + name);
                System.out.println("Price: " + price);
                System.out.println("Description: " + description);
                System.out.println("Rating: " + rating);
                System.out.println("Reviews: " + reviews);
                System.out.println("------------------------");
            }

            // Lưu dữ liệu vào file JSON
            ObjectMapper mapper = new ObjectMapper();
            File outputFile = new File("face_wash_products.json");
            mapper.writerWithDefaultPrettyPrinter().writeValue(outputFile, products);
            System.out.println("Dữ liệu đã được lưu vào file: " + outputFile.getAbsolutePath());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}