package com.example.neetcode.arrays;

public class MergeTwoSortedList {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        int[] result = merge(arr1, arr2);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int index = 0; // for result array
        int i = 0; // for first array
        int j = 0; // for second array


        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[index] = arr1[i];
                i++;
            } else {
                result[index] = arr2[j];
                j++;
            }
            index++;
        }

        while (i < arr1.length) {
            result[index] = arr1[i];
            i++;
            index++;
        }

        while (j < arr2.length) {
            result[index] = arr2[j];
            j++;
            index++;
        }



        return result;
    }
}
