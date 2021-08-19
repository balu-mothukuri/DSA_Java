/*
Ceiling of a number in an array is the smallest number greater than the target in the array.
If array = [2,4,7,9,12,13,16,19,21] and target = 15 then output = 16.
*/
package com.balu;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ceiling_number {
    public static void main(String[] args) {
        int target = 25;
        int[] arr = {2,4,7,9,12,13,16,19,21};
        int ans = ceiling(arr, target);
        if(ans == -1){
            System.out.println("The target "+target+" is greater than the biggest number in the array "+Arrays.toString(arr));
        }
        else{
            System.out.println("The ceiling of the target number "+target+" in the array "+ Arrays.toString(arr) + " is "+arr[ans]);
        }

    }

    public static int ceiling(int arr[], int target){
        int s=0;
        int e=arr.length-1;

        while(s<=e){
            if(target > arr[arr.length-1]){
                return -1;
            }
            int mid = s + (e-s)/2;

            if (target>arr[mid]){
                s=mid+1;
            }
            else if (target<arr[mid]){
                e=mid-1;
            }
            else{
                return mid;
            }
        }

        return s;
    }
}
