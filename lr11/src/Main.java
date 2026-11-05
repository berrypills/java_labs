public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик", 3, 15.5);
        Fish fish = new Fish("Немо", 1, 0.5);

        System.out.println("=== ПЕРЕГРУЗКА (в классе Animal) ===");
        dog.makeSound();
        dog.makeSound(10);
        dog.makeSound("радостный");

        System.out.println("\n=== ПЕРЕОПРЕДЕЛЕНИЕ (move) ===");
        Animal[] animals = {dog, fish};
        for (Animal a : animals) {
            a.move();
        }
    }
}