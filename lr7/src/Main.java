public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Иванов Иван", "Программист", 1500);
        Employee e2 = new Employee("Петров Петр", "Менеджер", 1200);
        Employee e3 = new Employee("Сидоров Сидор", "Тестировщик", 1000);
        Employee e4 = new Employee("Анна Смирнова", "Дизайнер", 1300);
        Employee e5 = new Employee("Олег Кузнецов", "Аналитик", 1400);

        System.out.println("Средняя зарплата: " + Employee.getAverageSalary());
    }
}