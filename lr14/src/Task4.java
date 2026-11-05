import java.io.*;
import java.util.Locale;
import java.util.Scanner;

void main() {
    Scanner console = new Scanner(System.in);
    console.useLocale(Locale.US);

    File file = new File("noise.txt");

    try (PrintWriter writer = new PrintWriter(file)) {
        System.out.println("Введите 15 значений уровня шума (используйте точку, например 45.5):");
        for (int i = 0; i < 15; i++) {
            double val;
            while (true) {
                System.out.print("Шум " + (i + 1) + ": ");
                val = console.nextDouble();
                if (val < 0) {
                    System.out.println("Ошибка! Уровень шума не может быть отрицательным. Попробуйте снова.");
                } else {
                    break;
                }
            }
            writer.println(val);
        }
        System.out.println("Данные записаны в файл noise.txt");
    } catch (FileNotFoundException e) {
        System.out.println("Ошибка: " + e.getMessage());
    }

    System.out.println("\n--- Значения из файла ---");
    double sum = 0;
    int count = 0;
    try (Scanner fileScanner = new Scanner(file)) {
        fileScanner.useLocale(Locale.US);

        while (fileScanner.hasNextDouble()) {
            double val = fileScanner.nextDouble();
            System.out.printf(Locale.US, "%.2f ", val);
            sum += val;
            count++;
        }
        System.out.println();
        if (count > 0) {
            System.out.printf(Locale.US, "Средний уровень шума: %.2f\n", (sum / count));
        }
    } catch (FileNotFoundException e) {
        System.out.println("Файл не найден: " + e.getMessage());
    }
}