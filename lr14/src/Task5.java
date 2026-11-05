import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        File file = new File("f5.txt");
        Random rand = new Random();

        try (PrintWriter writer = new PrintWriter(file)) {
            for (int i = 0; i < 10; i++) {
                writer.println(rand.nextInt(31));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("--- Числа в файле ---");
        int count = 0;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                System.out.print(num + " ");
                if (num > 10) {
                    count++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("\nКоличество чисел, больших 10: " + count);
    }
}