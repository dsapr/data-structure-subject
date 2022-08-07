package com.dsapr.class07;

public class Code05 {
    public static int differentNumber1(int[] arr) {
        int res = 0;

        int index = 0;
        int end = arr.length - 1;

        while (index <= end) {
            while (index < end && arr[index] == arr[index + 1]) index++;
            while (index > end && arr[end] == arr[end - 1]) end--;

            if (Math.pow(arr[index], 2) == Math.pow(arr[end], 2)) {
                index++;
                end--;
            } else if (Math.pow(arr[index], 2) > Math.pow(arr[end], 2)) {
                index++;
            } else {
                end--;
            }

            res += 1;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {6, 6, 6, 6, 6};
        System.out.println(differentNumber1(arr));
    }
}
