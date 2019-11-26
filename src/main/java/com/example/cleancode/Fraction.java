package com.example.cleancode;

import java.util.Objects;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

     int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

     public Fraction reduce() {
        int orderInsensitiveGCD= orderInsensitiveGCD(this.getNumerator(), this.getDenominator());

        return new Fraction(
                    this.getNumerator()/orderInsensitiveGCD,
                            this.getDenominator()/orderInsensitiveGCD);
    }

     int orderInsensitiveGCD(int a, int b) {
        return gcd((a>b)?a:b,(a<b)?a:b);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator &&
                denominator == fraction.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }
}
