public class Main {
    public static void main(String[] args) {
        Food[] foods = new Food[5];

        foods[0] = new Pizza("Маргарита", 250, 10.5, "Сыр, томаты");
        foods[1] = new Pizza("Пепперони", 300, 12.0, "Пепперони, сыр");
        foods[2] = new Pizza("Гавайская", 280, 11.5, "Курица, ананас");
        foods[3] = new Salad("Цезарь", 150, 7.0, "Майонез");
        foods[4] = new Salad("Оливье", 200, 6.5, "Сметана");

        for (Food f : foods) {
            f.displayInfo();
            System.out.println("Приготовление: " + f.cook());
            System.out.println("Срок годности: " + f.getExpirationDays() + " дн.");
            System.out.println("---");
        }
    }
}