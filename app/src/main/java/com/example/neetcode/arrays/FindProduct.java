package com.example.neetcode.arrays;

public class FindProduct {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] result = findProduct(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }


    static int[] findProduct(int[] arr) {
        int[] result = new int[arr.length];
         int product = 1;

         for (int i = 0; i < arr.length; i++) {
             product = product * arr[i];
         }

         for (int i = 0; i < arr.length; i++) {
             result[i] = product / arr[i];
         }

        return result;

    }
}
