package com.hqeducation.linkedlist;

import org.junit.Test;


public class LinkReverseTest {

    @Test
    public void shouldAnswerWithTrue0() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = null;
        System.out.println(listNode1);

        LinkReverse linkReverse = new LinkReverse();
        listNode1 = linkReverse.reverseList(listNode1);

        System.out.println(listNode1);
    }
}