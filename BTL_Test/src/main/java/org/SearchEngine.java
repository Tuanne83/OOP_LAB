package org;
import java.util.ArrayList;
import java.util.List;

public class SearchEngine {
    private List<Product> products;

    // Constructor
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




