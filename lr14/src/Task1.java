import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("music.txt");

        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Моя любимая музыка:\n");
            writer.write("1. Rock - Metallica\n");
            writer.write("2. Pop - Michael Jackson\n");
            writer.write("3. Jazz - Louis Armstrong\n");
            System.out.println("Файл успешно создан и записан.");
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }

        System.out.println("\n--- Информация о файле ---");
        System.out.println("Имя: " + file.getName());
        System.out.println("Размер: " + file.length() + " байт");
        System.out.println("Существует: " + file.exists());

        System.out.println("\n--- Чтение из файла ---");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }
}