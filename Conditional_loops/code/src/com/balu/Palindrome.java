package com.balu;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a string : ");
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        /*
        take a sample palindrome - kayak
        string indexes 0 - k, 1 - a, 2 - y, 3 - a, 4 - k
        int i = 0
        int j = 4
malayalam
        while loop - condition - loop until you reach the middle of the word
        for each loop - compare the chars at the ith and jth index (chars at each end of the word)
            if chars at ith and jth index are equal then increment i and decrease j
        Loop 1 - i = 0, j = 4
            since k == k --> i=1, j=3
        Loop 2 - i = 1, j = 3
            since a == a --> i=2, j=2
        Loop 3 - i = 2, j = 2
            since y == y --> i=3, j=1

        Middle of the word reached. Exit while loop.

        if i > string length / 2
            then print - Word is a Palindrome.
        else
            then print - Word is not a Palindrome

         */

        int i = 0;
        int j = word.length() - 1;
        while (i <= word.length()/2){
            if (word.charAt(i) == word.charAt(j)){
                i++;
                j--;
            }
            else{
                break;
            }
        }
        if (i > word.length()/2){
            System.out.println("The word "+word+" is a palindrome");
        }
        else{
            System.out.println("The word "+word+" is not a palindrome");;
        }
    }
}
