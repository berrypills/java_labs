public class Report {
    public static void generateReport(Employee[] employees) {

        System.out.printf("%-20s %10s%n", "ФИО", "Зарплата");

        for (int i = 0; i < employees.length; i++) {
            System.out.printf("%-20s |%10.2f%n", employees[i].getFullname(), employees[i].getSalary());
        }

    }
}