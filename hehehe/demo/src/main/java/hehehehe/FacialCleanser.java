public class FacialCleanser extends Product {
    private String skinType;           // Loại da phù hợp (da dầu, da khô, da nhạy cảm)
    private boolean isOrganic;         // Có phải sản phẩm hữu cơ không?

    @Override
    public void displayDetails() {
        System.out.println("Sữa rửa mặt: " + name + " | Giá: " + price + "đ | Loại da: " + skinType);
    }

    @Override
    public boolean matchesKeyword(String keyword) {
        return name.toLowerCase().contains(keyword.toLowerCase()) ||
               description.toLowerCase().contains(keyword.toLowerCase());
    }
}
