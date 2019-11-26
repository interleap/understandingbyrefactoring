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

            System.out.println(calculateAnswerForTestCase(a, b));

        }
    }

     static int calculateAnswerForTestCase(int a, int b) {
        int r;//using MACRO and determining GCD of p,q
        int k= orderInsensitiveGCD(a, b);

        // bring the numbers to their smallest possible forms
        a/=k;
        b/=k;

        int[] A = new int[b+5];
         int x=0,ans=-1;

        int flag=1;
        a=a%b;
        while(true)
        {
            if(a==0)
            {
                flag=0;
                break;
            }
            a*=10;
            while(a<b)
            {
                a*=10;
                x++;
            }
            r=a%b;
            if(A[r]!=0)
            {
                ans=x-A[r];
                break;
            }
            A[r]=x;
            x++;
            a=r;
        }
        if(flag==0) ans = -1;
        return ans;
    }

     static int orderInsensitiveGCD(int a, int b) {
        return gcd((a>b)?a:b,(a<b)?a:b);
    }
}
