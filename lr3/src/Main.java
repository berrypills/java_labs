import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Выберите задание:");

    System.out.println("1 - Строка в нижнем регистре");
    System.out.println("2 - Перевернуть слово");
    System.out.println("3 - Классы");
    System.out.println("4 - Регулярные выражения");

    int choice = scanner.nextInt();
    scanner.nextLine();

    switch (choice) {
        case 1:
            System.out.print("Введите строку: ");
            String str = scanner.nextLine();
            String lower = str.toLowerCase();
            System.out.println("Результат: " + lower);
            break;

        case 2:
            System.out.print("Введите предложение: ");
            String text = scanner.nextLine();
            String[] words = text.split(" ");
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < words.length; i++) {
                String reversed = new StringBuilder(words[i]).reverse().toString();
                result.append(reversed);
                if (i < words.length - 1) {
                    result.append(" ");
                }
            }
            System.out.println("Результат: " + result);
            break;

        case 3:
            Employee[] employees = new Employee[3];
            employees[0] = new Employee("Иванов Иван", 1234.50);
            employees[1] = new Employee("Петров Петр", 2500.00);
            employees[2] = new Employee("Сидоров Сидор", 3000.75);

            Report.generateReport(employees);
            break;

        case 4:
            String text2 = "aAXa aeffa aGha aza ax23a a3sSa";
            Pattern pattern = Pattern.compile("a[a-zA-Z]{2}a");
            Matcher matcher = pattern.matcher(text2);
            System.out.println("Найденные строки:");
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
            break;

        default:
            System.out.println("Неверный выбор!");
    }

    scanner.close();
}