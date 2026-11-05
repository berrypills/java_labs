public class Employee {
    private String name;
    private String position;
    private double salary;
    private String department;

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым!");
        }
        this.name = name;
    }

    public void setSalary(double salary) throws InvalidSalaryException {
        if (salary <= 0) {
            throw new InvalidSalaryException("Зарплата должна быть больше нуля! Введено: " + salary);
        }
        this.salary = salary;
    }

    public void setPosition(String position) throws PromotionException {
        if (position == null || position.trim().isEmpty()) {
            throw new PromotionException("Новая должность не может быть пустой!");
        }
        this.position = position;
    }

    public void setDepartment(String department) throws DepartmentNotFoundException {
        if (department == null || department.equals("Уволен")) {
            throw new DepartmentNotFoundException("Отдел '" + department + "' не существует!");
        }
        this.department = department;
    }

    public Employee(String name, String position, double salary, String department)
            throws InvalidSalaryException {
        setName(name);
        this.position = position;
        this.department = department;
        setSalary(salary);
    }

    public String getName() { return name; }
    public String getPosition() { return position; }
    public double getSalary() { return salary; }
    public String getDepartment() { return department; }


    public void promote(String newPosition) throws PromotionException {
        setPosition(newPosition);
        System.out.println(name + " повышен на должность: " + newPosition);
    }

    public void changeDepartment(String newDept) throws DepartmentNotFoundException {
        setDepartment(newDept);
        System.out.println(name + " переведен в отдел: " + newDept);
    }

    @Override
    public String toString() {
        return name + " | Должность: " + position + " | Зарплата: " + salary + " | Отдел: " + department;
    }
}