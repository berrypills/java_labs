import java.util.Scanner;
import java.util.Random;

void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Выберите задание:");
    System.out.println("1 - Min");
    System.out.println("2 - Отрицательные под диагональю");

    int choice = scanner.nextInt();

    switch (choice) {
        case 1:
            System.out.println("Введите количество элементов массива: ");
            int n = scanner.nextInt();
            int[] arr = new int[n];
            Random random = new Random();

            for (int i = 0; i < n; i++) {
                System.out.println("Введите " + (i + 1) + " элемент массива: ");
                arr[i] = random.nextInt(51);
            }
            int min = arr[0];
            for (int i = 0; i < n; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }

            System.out.println("Минимальный элемент: " + min);

            break;

        case 2:
            System.out.println("Введите размер матрицы N: ");
            int N = scanner.nextInt();
            int[][] arr1 = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print("Введите элемент [" + i + "] [" + j + "]: ");
                    arr1[i][j] = scanner.nextInt();

                }
            }

            int sum = 0;
            int count = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (i >= j ) {
                        if (arr1[i][j] < 0) {
                            sum = sum + arr1[i][j];
                            count = count + 1;
                        }
                    }
                }
            }
            System.out.println("Сумма: " + sum);
            System.out.println("Количество: " + count);

            break;
        default:
            System.out.println("Неверный выбор");
    }
    scanner.close();
}
