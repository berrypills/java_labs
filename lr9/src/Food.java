public abstract class Food {
    private String name;
    private int calories;
    private double price;

    public Food(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    public String getName() { return name; }
    public int getCalories() { return calories; }
    public double getPrice() { return price; }

    public abstract String cook();
    public abstract int getExpirationDays();

    public void displayInfo() {
        System.out.println(name + " | Калории: " + calories + " | Цена: " + price);
    }
}