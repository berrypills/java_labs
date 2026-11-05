public class Pizza extends Food {
    private String toppings;

    public Pizza(String name, int calories, double price, String toppings) {
        super(name, calories, price);
        this.toppings = toppings;
    }

    @Override
    public String cook() {
        return "Запекается в духовке 20 минут";
    }

    @Override
    public int getExpirationDays() {
        return 3;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Начинка: " + toppings);
    }
}