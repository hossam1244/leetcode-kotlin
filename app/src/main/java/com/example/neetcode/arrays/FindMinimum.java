package com.example.neetcode.arrays;

public class FindMinimum {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 4};
        int result = findMinimum(arr);
        System.out.println(result);
    }


    static int findMinimum(int[] arr) {
        int min = arr[0];

        for (int i = 1; i<arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

}
