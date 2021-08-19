/*
 1. Define an input array to hold the integers.
 2. Call a function which returns the count of digits which have even digits and assign it to an int variable. Pass the array as an input.
 3. loop the array and for each integer in the array, call a function to check if the number of digits in the integer is even or not.
  */

package com.balu;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {345, 34, 2342, 4, 6, 75};
        int count = countofevendigits(arr);
        System.out.println("The count of numbers with even digits - "+count);
    }
     static int countofevendigits(int nums[]){
        int integercount = 0;
         for (int num : nums) {
             if (iscountofdigitseven(num)) {
                 integercount = integercount + 1;
             }
         }
        return integercount;
    }
    static boolean iscountofdigitseven(int number){
        int countofdigits = countofdigits(number);
        return countofdigits % 2 == 0;
    }
    static int countofdigits(int number){
        int digitcount=0;
        while(number > 0){
            number /= 10;
            digitcount = digitcount+1;
        }
        return digitcount;
    }
}
