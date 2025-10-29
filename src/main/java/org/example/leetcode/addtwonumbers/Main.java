package org.example.leetcode.addtwonumbers;

public class Main {
    public static void main(String[] args) {
        ListNode result = new Solution().addTwoNumbers(
                new ListNode(2, new ListNode(4, new ListNode(3, null))),
                new ListNode(5, new ListNode(6, new ListNode(4, null))));

        System.out.print("[");
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) System.out.print(" -> ");
            result = result.next;
        }
        System.out.println("]");
    }
}
