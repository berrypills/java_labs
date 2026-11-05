import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Film> films = new ArrayList<>();
        films.add(new Film(1, "Интерстеллар", "Sci-Fi", 5, Arrays.asList(5, 4, 5)));
        films.add(new Film(2, "Титаник", "Drama", 4, Arrays.asList(3, 2, 4)));
        films.add(new Film(3, "Форсаж", "Action", 3, Arrays.asList(2, 2, 3)));
        films.add(new Film(4, "Аватар", "Sci-Fi", 5, Arrays.asList(4, 5, 5)));
        films.add(new Film(5, "Матрица", "Action", 4, Arrays.asList(4, 4, 3)));

        System.out.println("=== Удаление фильмов с рейтингом < 3 ===");
        Iterator<Film> iterator = films.iterator();
        while (iterator.hasNext()) {
            Film f = iterator.next();
            if (f.getAverageRating() < 3.0) {
                System.out.println("Удален: " + f.getTitle());
                iterator.remove();
            }
        }


        System.out.println("\n=== Повышение рейтинга ===");
        for (Film f : films) {
            if (f.getAverageRating() >= 4.0) {
                f.setRating(f.getRating() + 1);
                System.out.println(f.getTitle() + " повышен до " + f.getRating());
            }
        }



        films.sort(Comparator.comparingDouble(Film::getAverageRating).reversed()
                .thenComparing(Film::getTitle));

        for (Film f : films) {
            System.out.println(f);
        }

        System.out.println("\n=== Фильмы с рейтингом 4 ===");
        printFilms(films, 4);
    }

    public static void printFilms(List<Film> films, int rating) {
        for (Film f : films) {
            if (f.getRating() == rating) {
                System.out.println(f);
            }
        }
    }
}