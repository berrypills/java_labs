package org.example;

public class Main {
    static void main() {
        Fraction f1 = new Fraction(1,2);
        Fraction f2 = new Fraction(3,4);
        System.out.println("Дробь 1: " + f1);
        System.out.println("Десятичное: " + f1.toDecimal());

        System.out.println("Дробь 2: " + f2);
        System.out.println("Десятичное: " + f2.toDecimal());

        System.out.println();

        Car[]cars = {
                new Car("BMW", 2015, 25000),
                new Car("Mercedes", 2010, 17000),
                new Car("Audi", 2020, 30000),
                new Car("Ford", 2000,11000),
                new Car("Kia", 2015, 15000)
        };
        Car mostExpensive = cars[0];
        Car oldest = cars[0];
        for(int i=1;i< cars.length;i++){
            if(cars[i].getPrice()> mostExpensive.getPrice()){
                mostExpensive = cars[i];
            }
            if(cars[i].getYear()< oldest.getYear()){
                oldest=cars[i];
            }
        }

        System.out.println("Самое дорогое авто: " + mostExpensive);
        System.out.println("Самое старое авто: " + oldest);

        User[] users = {
                new User("Иван", Role.ADMIN),
                new User("Петр", Role.USER),
                new User("Анна", Role.ADMIN),
                new User("Олег", Role.GUEST),
                new User("Мария", Role.USER)
        };

        System.out.println("\nАдминистраторы:");
        for (User u : users) {
            if (u.getRole() == Role.ADMIN) {
                System.out.println(u);
            }
        }
    }
}
