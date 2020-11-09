package com.hqeducation;

/**
 * @author dzz
 * @create 2020-11-08 18:28
 * @since jdk1.8.0_131
 */
public class TwoSum {

    /*
    * 1，数组 两数之和 暴力求解
    * */
    public static int[] twoSumSimple(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

}
