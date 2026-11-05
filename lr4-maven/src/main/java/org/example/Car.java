package org.example;

public class Car {
    private String brand;
    private int year;
    private double price;

    public Car(String brand, int year, double price){
        this.brand=brand;
        this.year=year;
        this.price = price;
    }

    public Car(){}

    public String getBrand(){
        return brand;
    }
    public int getYear(){
        return year;
    }
    public double getPrice(){
        return price;
    }

    public String toString(){
        return brand + " (" + year +") -" + price;
    }
}
