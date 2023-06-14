package com.example.neetcode.arrays;

public class RemoveEven {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 10, 6, 4};
        int[] result = removeEven(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    static int[] removeEven(int[] arr) {
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
             if (arr[i] % 2 != 0) {
                 oddCount++;
             }
        }
        int[] result = new int[oddCount];
        int index = 0;
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[index] = arr[i];
                index++;
            }
        }

        return result;
    }
}