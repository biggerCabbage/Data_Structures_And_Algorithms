package com.hqeducation;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class TwoSumTest {

    private TwoSum twoSum = new TwoSum();

    @Test
    public void shouldAnswerWithTrue() {
        int[] arr1 = new int[]{1,2,3,4,5};
        int [] arr2 = twoSum.twoSumSimple(arr1,6);

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        assertTrue( true );
    }

}