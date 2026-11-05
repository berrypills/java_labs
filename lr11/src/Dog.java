public class Dog extends Animal {

    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }


    @Override
    public void move() {
        System.out.println("Бегает");
    }


    @Override
    public void makeSound() {
        System.out.println("Гав-гав");
    }
}