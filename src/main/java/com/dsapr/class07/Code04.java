package com.dsapr.class07;

public class Code04 {
    public static int differentNum(int[] arr) {
        int N = arr.length;
        int left = 0;
        int right = N - 1;
        int res = 0;

        while(left <= right) {
            while(left < right && arr[left] == arr[left + 1]) left++;
            while(left > right && arr[right] == arr[right - 1]) right--;

            if (Math.pow(arr[left], 2) == Math.pow(arr[right], 2)) {
                left++;
                right--;
            } else if (Math.pow(arr[left], 2) > Math.pow(arr[right], 2)) {
                right++;
            } else {
                right--;
            }

            res += 1;
        }

        return res;
    }
}
