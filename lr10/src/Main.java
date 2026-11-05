public class Main {
    public static void main(String[] args) {
        Manager m1 = new Manager("Иван", 1000, "Manager", 5);
        Manager m2 = new Manager("Петр", 1200, "Manager", 8);

        Developer d1 = new Developer("Анна", 800, "Developer", "Java");
        Developer d2 = new Developer("Олег", 900, "Developer", "Python");
        Developer d3 = new Developer("Мария", 850, "Developer", "C++");

        Workable[] workers = {m1, m2, d1, d2, d3};

        System.out.println("=== РАБОТА ===");
        for (Workable w : workers) {
            w.work();
        }

        System.out.println("\n=== ПОВЫШЕНИЕ ===");
        m1.promote();
        d1.promote();
        d3.promote();
    }
}