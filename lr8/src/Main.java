public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Electronics("Ноутбук", 1200, 2.5, 24);
        products[1] = new Electronics("Телефон", 800, 0.3, 12);
        products[2] = new Electronics("Наушники", 150, 0.2, 6);
        products[3] = new Food("Хлеб", 2.5, 0.5, "2026-10-15");
        products[4] = new Food("Молоко", 1.8, 1.0, "2026-10-20");

        for (Product p : products) {
            p.displayInfo();
            System.out.println(p.getDiscount());
            System.out.println("---");
        }

        Electronics e = (Electronics) products[0];
        e.checkWarranty();

        Food f = (Food) products[3];
        f.isExpired();
    }
}