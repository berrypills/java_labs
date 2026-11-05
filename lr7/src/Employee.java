public class Employee {
    private String fullName;
    private String position;
    private double salary;

    private static int totalTeacher=0;
    private static int totalEmployees = 0;
    private static double totalSalary = 0;

    public Employee(String fullName, String position, double salary) {
        this.fullName = fullName;
        this.position = position;
        this.salary = salary;
        totalEmployees++;
        if(position=="Учитель"){
            totalTeacher++;
        }
        totalSalary = totalSalary + salary;
    }

    public String getFullName() { return fullName; }
    public String getPosition() { return position; }
    public double getSalary() { return salary; }

    public static double getAverageSalary() {
        if (totalEmployees == 0) return 0;
        return totalSalary / totalEmployees;
    }
}