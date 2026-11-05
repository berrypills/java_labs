public class Developer implements Workable, Promotable {
    private String name;
    private double salary;
    private String position;
    private String language;

    public Developer(String name, double salary, String position, String language) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.language = language;
    }

    @Override
    public void work() {
        System.out.println(name + " пишет код на " + language + ".");
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void promote() {
        position = "Senior " + position;
        salary = salary * 1.15;
        System.out.println(name + " повышен! Новая должность: " + position + ", новая зарплата: " + salary);
    }

    @Override
    public String getPosition() {
        return position;
    }
}