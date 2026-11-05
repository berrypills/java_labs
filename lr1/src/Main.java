import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Выберите задание:");
    System.out.println("Задание 1 - Разность чисел");
    System.out.println("Задание 2 - Min");
    System.out.println("Задание 3 - Сумма чисел (0-N)");

    int choice = scanner.nextInt();

    if (choice == 1) {
        System.out.println("Задание 1 - Разность чисел");
        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();
        int res = num1 - num2;
        System.out.println("Результат:" + res);
    } else if (choice == 2) {
        System.out.println("Задание 2 - Min");
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        if (a < b) {
            System.out.println("Min: " + a);
        } else if (b < a) {
            System.out.println("Min: " + b);
        } else {
            System.out.println("Числа равны");
        }
    } else if (choice == 3) {
        System.out.println("Задание 3 - Сумма чисел (0-N)");
        System.out.println("Введите N: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Ошибка! N должно быть >0");
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }
            System.out.println("Сумма чисел: " + sum);
        }
    } else {
        System.out.println("Неверный выбор!");
    }

    scanner.close();
}
