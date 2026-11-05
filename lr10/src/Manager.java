public class Manager implements Workable, Promotable {
    private String name;
    private double salary;
    private String position;
    private int teamSize;

    public Manager(String name, double salary, String position, int teamSize) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.teamSize = teamSize;
    }

    @Override
    public void work() {
        System.out.println(name + " управляет командой из " + teamSize + " человек.");
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void promote() {
        position = "Senior " + position;
        salary = salary * 1.2;
        System.out.println(name + " повышен! Новая должность: " + position + ", новая зарплата: " + salary);
    }

    @Override
    public String getPosition() {
        return position;
    }
}