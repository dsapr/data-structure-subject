package com.dsapr.class01;

public class Code01 {
    public int maxPoint(int arr[], int K) {
        int N = arr.length;
        int max = 0;
        int L = 0;
        int R = 0;

        while (L < N) {
            while (R < N && arr[R] - arr[L] <= K) {
                R++;
            }
            max = Math.max(max, R - (L++));
        }

        return max;
    }
}
