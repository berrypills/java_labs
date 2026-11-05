public class Electronics extends Product {
    private int warranty;

    public Electronics(String name, double price, double weight, int warranty) {
        super(name, price, weight);
        this.warranty = warranty;
    }

    public int getWarranty() { return warranty; }

    @Override
    public String getDiscount() {
        return "Скидка 5%";
    }

    public void checkWarranty() {
        System.out.println("Гарантия: " + warranty + " месяцев");
    }
}