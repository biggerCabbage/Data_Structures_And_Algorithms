package com.hqeducation;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class ThreeSumTest {

    private ThreeSum threeSum = new ThreeSum();

    @Test
    public void shouldAnswerWithTrue0() {
        int[] arr1 = new int[]{1,2,3,4,5};
        int [] arr2 = threeSum.twoSumSimple(arr1,6);

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        assertTrue( true );
    }



}