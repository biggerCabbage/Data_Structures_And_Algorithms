package com.hqeducation.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dzz
 * @create 2020-11-08 18:28
 * @since jdk1.8.0_131
给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。

注意：答案中不可以包含重复的三元组。

例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，

满足要求的三元组集合为： [ [-1, 0, 1], [-1, -1, 2] ]
 */
public class ThreeSum {

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



}
