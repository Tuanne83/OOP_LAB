public class Main {
    public static void main(String[] args) {
        List<Product> productList = DataLoader.loadFromCSV("data.csv");  // Đọc file dữ liệu
        SearchEngine searchEngine = new SearchEngine(productList);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập từ khóa bạn cần tìm:");
        String keyword = scanner.nextLine();

        List<Product> results = searchEngine.searchByKeyword(keyword);
        for (Product p : results) {
            p.displayDetails();
            System.out.println("→ " + AIAssistant.generateRecommendation(p));
        }
    }
}
