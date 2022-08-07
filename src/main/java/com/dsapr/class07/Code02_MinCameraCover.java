package com.dsapr.class07;

public class Code02_MinCameraCover {
    class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;
    }

    public static int min(int ...nums) {
        int min = nums[0];
        for (int num : nums) {
            min = Math.min(min, num);
        }
        return min;
    }
}
