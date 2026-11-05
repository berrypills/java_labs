import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> staff = new ArrayList<>();

        try {
            staff.add(new Employee("Иван", "Менеджер", 1500, "Продажи"));
            staff.add(new Employee("Анна", "Разработчик", 2000, "IT"));
            staff.add(new Employee("Петр", "Тестировщик", 1200, "QA"));
            staff.add(new Employee("Олег", "Стажер", -500, "IT"));
        }

        catch (InvalidSalaryException e) {
            System.out.println("ОШИБКА ПРИ СОЗДАНИИ: " + e.getMessage());
        }

        System.out.println("\n--- Список сотрудников ---");
        for (Employee emp : staff) {
            System.out.println(emp);
        }

        System.out.println("\n--- Операции ---");
        if (!staff.isEmpty()) {
            Employee emp1 = staff.get(0); // Иван

            try {
                emp1.promote("Старший менеджер");
                emp1.changeDepartment("Маркетинг");
            } catch (PromotionException | DepartmentNotFoundException e) {
                System.out.println("ОШИБКА: " + e.getMessage());
            }

            try {
                emp1.promote("");
            } catch (PromotionException e) {
                System.out.println("Поймали ошибку повышения: " + e.getMessage());
            }

            try {
                emp1.changeDepartment("Уволен");
            } catch (DepartmentNotFoundException e) {
                System.out.println("Поймали ошибку отдела: " + e.getMessage());
            }
        }
    }
}