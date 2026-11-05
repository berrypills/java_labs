import java.io.*;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        File file = new File("f.txt");


        try (PrintWriter writer = new PrintWriter(file)) {
            System.out.println("Введите 10 целых чисел:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Число " + (i + 1) + ": ");
                int num = console.nextInt();
                writer.println(num);
            }
            System.out.println("Данные записаны в файл f.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("\n--- Числа из файла ---");
        int sum = 0;
        int count = 0;
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextInt()) {
                int num = fileScanner.nextInt();
                System.out.print(num + " ");
                sum += num;
                count++;
            }
            System.out.println();
            if (count > 0) {
                System.out.println("Среднее арифметическое: " + ((double) sum / count));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }
}