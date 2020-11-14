package com.hqeducation.linkedlist;

/**
 *
 * 假设存在链表 1→2→3→∅，我们想要把它改成 ∅←1←2←3。
 */
public class LinkReverse {

    /*
     * 1，单链表翻转 方法1
     * */
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}