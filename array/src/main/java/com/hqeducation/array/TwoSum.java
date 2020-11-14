package com.hqeducation.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dzz
 * @create 2020-11-08 18:28
 * @since jdk1.8.0_131
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 */
public class TwoSum {

    /*
     * 1，数组 两数之和 暴力求解 两数不能是自己必须是两个下标
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

    /*
     * 2，数组 两数之和 利用hash计算 两数不能是自己必须是两个下标 然后 hashmap取得是最后的值 不是第一个
     * */
    public static int[] twoSumHash(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[]{hashMap.get(target - nums[i]), i};
            }
            hashMap.put(nums[i], i);
        }
        return new int[0];
    }

    /*
     * 2，数组 两数之和 利用左右双指针方法
     * */
    public static int[] twoSumLink(int[] nums, int target) {

        return new int[0];
    }



}
