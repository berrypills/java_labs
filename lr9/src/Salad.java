public class Salad extends Food {
    private String dressing;

    public Salad(String name, int calories, double price, String dressing) {
        super(name, calories, price);
        this.dressing = dressing;
    }

    @Override
    public String cook() {
        return "Нарезается и смешивается";
    }

    @Override
    public int getExpirationDays() {
        return 1;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Заправка: " + dressing);
    }
}