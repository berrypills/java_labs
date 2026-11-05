package org.example;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(){}

    public double toDecimal() {
        return (double) numerator / denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}
