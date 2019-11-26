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

            System.out.println(calculateAnswerForTestCase(new Fraction(a,b)));

        }
    }

     static int calculateAnswerForTestCase(Fraction fraction) {
        int r;

         final Fraction reducedFraction = fraction.reduce();


         int x=0,ans=-1;

        int flag=1;
        Fraction fractionWithoutWholeNumber = reducedFraction.withoutWholeNumber();
         int numerator=fractionWithoutWholeNumber.getNumerator();
         int denominator=fractionWithoutWholeNumber.getDenominator();
         int[] A = new int[denominator+5];

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

}
