public class Main {
    public static void main(String[] args) {
        Building b = new Building("ул. Ленина, 10", 5, 1500.0);
        Building b1 = new Building("пр-т Независимости, 10", 8,2000.0,5);

        System.out.println("Адрес: " + b.getAddress());
        System.out.println("Этажей: " + b.getFloors());
        System.out.println("Общая площадь: " + b.getTotalArea());
        System.out.println("Средняя площадь этажа: " + b.averageAreaPerFloor());

        b.setFloors(10);
        System.out.println("Новое количество этажей: " + b.getFloors());
        System.out.println("Новая средняя площадь: " + b.averageAreaPerFloor());
    }
}