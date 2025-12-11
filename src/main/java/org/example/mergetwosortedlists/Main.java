package org.example.mergetwosortedlists;


public class Main {
    public static void main(String[] args) {
        ListNode result = new Solution().mergeTwoLists(
                new ListNode(2, new ListNode(3, new ListNode(4, null))),
                new ListNode(4, new ListNode(5, new ListNode(6, null))));

        System.out.print("[");
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) System.out.print(" -> ");
            result = result.next;
        }
        System.out.println("]");
    }
}
