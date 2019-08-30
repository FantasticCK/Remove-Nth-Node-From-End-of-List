package com.CK;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode s = head, f = head, prev = dummy;

        for (int i = 1; i < n; i++) {
            f = f.next;
        }

        while (f.next != null) {
            f = f.next;
            s = s.next;
            prev = prev.next;
        }

        prev.next = s.next;
        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}