package com.hqeducation.array;

import static org.junit.Assert.assertTrue;

import com.hqeducation.array.TwoSum;
import org.junit.Test;


public class TwoSumTest {

    private TwoSum twoSum = new TwoSum();

    @Test
    public void shouldAnswerWithTrue0() {
        int[] arr1 = new int[]{1,2,3,4,5};
        int [] arr2 = twoSum.twoSumSimple(arr1,6);

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        assertTrue( true );
    }

    @Test
    public void shouldAnswerWithTrue1() {
        int[] arr1 = new int[]{3,2,4};
        int [] arr2 = twoSum.twoSumHash(arr1,6);

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        assertTrue( true );
    }



}