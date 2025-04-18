package hehehe;

public class FaceMask extends Product {
    private String maskType;           // Loại mặt nạ (mặt nạ giấy, mặt nạ bùn, mặt nạ ngủ)
    private boolean isHydrating;       // Mặt nạ cấp ẩm

    @Override
    public void displayDetails() {
        System.out.println("Mặt nạ: " + name + " | Giá: " + price + "đ | Loại: " + maskType);
    }

    @Override
    public boolean matchesKeyword(String keyword) {
        return name.toLowerCase().contains(keyword.toLowerCase()) ||
               description.toLowerCase().contains(keyword.toLowerCase());
    }
}
 {
    
}
