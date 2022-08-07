package com.dsapr.utils;

import java.util.function.Function;

public class ArrayUtils {
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static boolean isEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static int[] generalRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];

        // Math.random() -> [0, 1)
        // Math.random() * N -> [0, N)
        // (int) Math.random() * N -> [0, N - 1]
        for (int i = 0; i < arr.length; i++) {
            // 正、负、零
            arr[i] = (int) ((maxValue + 1) * Math.random())
                    - (int) (maxValue * Math.random());
        }

        return arr;
    }
}
