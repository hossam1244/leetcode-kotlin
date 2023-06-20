package com.example.neetcode.arrays;

public class FindSecondMaximum {
    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 6};
        int result = findSecondMaximum(arr);
        System.out.println(result);
    }

    static int findSecondMaximum(int[] arr) {
        int max = arr[0];
        int secondMax = arr[0];


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        return secondMax;
    }
}
