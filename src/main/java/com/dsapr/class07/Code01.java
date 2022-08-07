package com.dsapr.class07;


import static com.dsapr.utils.ArrayUtils.swap;

public class Code01 {
    public static int maxAndValue1(int[] arr) {
        int res = 0;
        int N = arr.length;

        int last = N;
        for (int i = 30; i >= 0; i--) {
            int index = 0;
            int lastTmp = last; // 垃圾堆里的数字指针
            while (index < last) {
                if ((arr[index] & (1 << i)) == 0) {
                    swap(arr, index, --last);
                } else {
                    index++;
                }
            }

            if (last == 2) {
                return arr[0] & arr[1];
            } else if (last < 2) {
                last = lastTmp;
            } else {
                res |= (1 << i);
            }

        }

        return res;
    }

    public static int maxAndValue(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                ans = Math.max(ans, arr[i] & arr[j]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,32,33,34};
        System.out.println("maxAndValue(arr) = " + maxAndValue(arr));
        System.out.println("maxAndValue1(arr) = " + maxAndValue1(arr));
    }
}
