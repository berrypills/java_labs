public class Product {
    private String name;
    private double price;
    private double weight;

    public Product(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public double getWeight() { return weight; }

    public String getDiscount() {
        return "Скидка 0%";
    }

    public void displayInfo() {
        System.out.println(name + " | Цена: " + price + " | Вес: " + weight);
    }
}