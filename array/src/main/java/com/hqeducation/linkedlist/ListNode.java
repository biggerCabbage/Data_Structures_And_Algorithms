package com.hqeducation.linkedlist;

/**
 * @author dzz
 * @create 2020-11-14 13:56
 * @since jdk1.8.0_131
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}