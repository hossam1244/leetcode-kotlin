package com.example.neetcode.arrays;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = twoSum(arr, 7);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i]; // 7 - 1 = 6
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            } else {
                map.put(arr[i], i);
            }
        }
        return new int[]{-1, -1};

    }
}
