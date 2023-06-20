package com.example.neetcode.arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 6};
        int[] result = rotateArray(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }


   static int[] rotateArray(int[] array) {
        // Array rotated by one element from right to left
        int lastElement = array[array.length - 1];

        for (int i= array.length - 1; i > 0; i--) {
            array[i] =  array[i - 1];
        }
        array[0] = lastElement;
        return array;
    }
}
