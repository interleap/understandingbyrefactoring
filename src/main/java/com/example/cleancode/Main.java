package com.example.cleancode;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int t, a, b;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while (t-- > 0) {
            a = in.nextInt();
            b = in.nextInt();

            System.out.println(new Fraction(a,b).numberOfDigitsInRepeatingDecimal());

        }
    }

}
