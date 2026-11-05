public class Animal {
    private String name;
    private int age;
    private double weight;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void makeSound() {
        System.out.println("Издает звук");
    }

    public void makeSound(int volume) {
        System.out.println("Издает звук громкостью " + volume);
    }

    public void makeSound(String mood) {
        System.out.println("Издает " + mood + " звук");
    }



    public void move() {
        System.out.println("Животное двигается");
    }
}