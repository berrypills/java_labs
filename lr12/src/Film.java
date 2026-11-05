import java.util.List;

public class Film {
    private int id;
    private String title;
    private String genre;
    private int rating;
    private List<Integer> criticScores;

    public Film(int id, String title, String genre, int rating, List<Integer> criticScores) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.criticScores = criticScores;
    }

    public double getAverageRating() {
        if (criticScores == null || criticScores.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int score : criticScores) {
            sum += score;
        }
        return (double) sum / criticScores.size();
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }

    @Override
    public String toString() {
        return "ID: " + id + " | Название: " + title + " | Средний балл: " + String.format("%.2f", getAverageRating());
    }
}