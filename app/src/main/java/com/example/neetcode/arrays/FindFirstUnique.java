package com.example.neetcode.arrays;

public class FindFirstUnique {
    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 2, 6, 6};
        int result = findFirstUnique(arr);
        System.out.println(result);
    }

    static int findFirstUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }

            }
            if (isUnique) {
                return arr[i];
            }
        }
        return -1;
    }


}
