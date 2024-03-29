//brute force



//most optimal solution

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class SegeregateOddandEvenNodes {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        // Separate odd and even indices
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even; // Save the head of the even list

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        // Combine odd and even lists
        odd.next = evenHead;

        return head;
    }
}
