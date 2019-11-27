package com.example.cleancode;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {


    public static void main(String[] args) {
        int numberOfTestCases, numerator, denominator;
        Scanner inputScanner = new Scanner(in);

        numberOfTestCases = inputScanner.nextInt();

        while (numberOfTestCases-- > 0) {
            numerator = inputScanner.nextInt();
            denominator = inputScanner.nextInt();

            out.println(new Fraction(numerator,denominator).countOfRecurringDecimalDigits());

        }
    }

}
