public class Food extends Product {
    private String expirationDate;

    public Food(String name, double price, double weight, String expirationDate) {
        super(name, price, weight);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() { return expirationDate; }

    @Override
    public String getDiscount() {
        return "Скидка 15%";
    }

    public void isExpired() {
        System.out.println("Срок годности: " + expirationDate);
    }
}