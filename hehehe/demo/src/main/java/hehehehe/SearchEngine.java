package hehehe;

public class SearchEngine {
    private List<Product> products;

    public SearchEngine(List<Product> products) {
        this.products = products;
    }

    public List<Product> searchByKeyword(String keyword) {
        List<Product> result = new ArrayList<>();
        for (Product p : products) {
            if (p.matchesKeyword(keyword)) {
                result.add(p);
            }
        }
        return result;
    }
}


