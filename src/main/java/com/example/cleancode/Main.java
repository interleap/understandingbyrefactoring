package com.example.cleancode;

import java.util.Scanner;

public class Main {

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }


    public static void main(String[] args) {
        int t, a, b, r;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while (t-- > 0) {
            a = in.nextInt();
            b = in.nextInt();

            System.out.println(calculateAnswerForTestCase(new Fraction(a,b)));

        }
    }

     static int calculateAnswerForTestCase(Fraction fraction) {
        int r;//using MACRO and determining GCD of p,q
        int orderInsensitiveGCD= orderInsensitiveGCD(fraction.getNumerator(), fraction.getDenominator());

        // bring the numbers to their smallest possible forms
        int numerator=fraction.getNumerator()/orderInsensitiveGCD;
        int denominator=fraction.getDenominator()/orderInsensitiveGCD;

        int[] A = new int[denominator+5];
         int x=0,ans=-1;

        int flag=1;
        numerator=numerator%denominator;
        while(true)
        {
            if(numerator==0)
            {
                flag=0;
                break;
            }
            numerator*=10;
            while(numerator<denominator)
            {
                numerator*=10;
                x++;
            }
            r= numerator % denominator;
            if(A[r]!=0)
            {
                ans=x-A[r];
                break;
            }
            A[r]=x;
            x++;
            numerator = r;
        }
        if(flag==0) ans = -1;
        return ans;
    }

     static int orderInsensitiveGCD(int a, int b) {
        return gcd((a>b)?a:b,(a<b)?a:b);
    }
}
