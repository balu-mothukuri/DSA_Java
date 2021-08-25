// https://leetcode.com/problems/sqrtx/
package com.balu;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner num = new Scanner(System.in);
        int ans = squareroot(num.nextInt());
        System.out.print("The integer square root value is "+ans);
    }

    /*
    Computes the integer equivalent value of square root of a given number x.
    If x = 4, it returns 2.
    If x = 8, then it returns 2. The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
     */
    static int squareroot(int x){
        if (x == 0 || x == 1){
            return x;
        } else {
            // Implement binary search algorithm to find the number which is the integer value of the square root of the given number.
            int start = 1;
            int end = x/2;
            while (start <= end) {
                int mid = start + (end-start)/2;
                if(mid <= x/mid){ //use this instead of mid*mid<=x to avoid int overflow of Integer.MAX_VALUE
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            return end;
        }
    }
}
