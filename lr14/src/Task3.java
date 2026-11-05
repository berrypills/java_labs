import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File f = new File("f.txt");
        File g = new File("g.txt");
        File h = new File("h.txt");
        Random rand = new Random();

        try (PrintWriter writer = new PrintWriter(f)) {
            for (int i = 0; i < 20; i++) {
                writer.println(rand.nextInt(100)); // от 0 до 99
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scanner = new Scanner(f);
             PrintWriter writerG = new PrintWriter(g);
             PrintWriter writerH = new PrintWriter(h)) {

            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num % 10 == 0) { // оканчивается на 0
                    writerG.println(num);
                } else {
                    writerH.println(num);
                }
            }
            System.out.println("Файлы g.txt и h.txt успешно созданы.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}