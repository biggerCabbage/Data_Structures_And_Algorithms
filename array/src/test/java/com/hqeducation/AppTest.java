package com.hqeducation;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        int[] arr1 = new int[]{1,2,3,4,5};
        int [] arr2 = twoSumSimple(arr1,6);




        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
//        assertTrue( arr2[0] );
//        assertTrue( true );
//        assertTrue( true );
    }

    /**/
    public int[] twoSumSimple(int[] nums, int target) {
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
