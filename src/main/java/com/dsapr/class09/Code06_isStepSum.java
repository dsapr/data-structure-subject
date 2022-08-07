package com.dsapr.class09;

import java.util.HashMap;

public class Code06_isStepSum {
    public static boolean isStepSum(int stepSum) {
        int L = 0;
        int R = stepSum;
        int M = 0;
        int cur = 0;

        while (L <= R) {
            M = L + ((R - L) >> 1);
            cur = getStepSum(M);
            if (cur == stepSum) {
                return true;
            } else if (cur < stepSum) {
                L = M + 1;
            } else {
                R = M - 1;
            }
        }

        return false;
    }

    public static int getStepSum(int num) {
        int res = 0;

        while (num != 0) {
            res += num;
            num /= 10;
        }

        return res;
    }

    public static void main(String[] args) {
        int max = 1;
        int maxStepSum = getStepSum(max);
        HashMap<Integer, Integer> ans = generateStepSumNumberMap(max);
        System.out.println("test start...");
        for (int i = 0; i <= maxStepSum; i++) {
            if (isStepSum(i) ^ ans.containsKey(i)) {
                System.out.println("test Error!!");
            }
        }
        System.out.println("test over.");
    }

    // for test
    public static HashMap<Integer, Integer> generateStepSumNumberMap(int numMax) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= numMax; i++) {
            map.put(getStepSum(i), i);
        }
        return map;
    }
}
