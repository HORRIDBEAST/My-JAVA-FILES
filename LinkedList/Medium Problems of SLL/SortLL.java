//brute force
import java.util.ArrayList;
import java.util.Collections;

/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

public class SortLL {
    public Node merge(Node left, Node right) {
        if (left == null) return right;
        if (right == null) return left;

        Node res = new Node(-1);
        Node temp = res;

        while (left != null && right != null) {
            if (left.data < right.data) {
                temp.next = left;
                temp = temp.next; // Fix: Update temp.next, not temp
                left = left.next;
            } else {
                temp.next = right;
                temp = temp.next; // Fix: Update temp.next, not temp
                right = right.next;
            }
        }

        // remaining elements of left
        while (left != null) {
            temp.next = left;
            temp = temp.next; // Fix: Update temp.next, not temp
            left = left.next;
        }

        // remaining elements of right
        while (right != null) {
            temp.next = right;
            temp = temp.next; // Fix: Update temp.next, not temp
            right = right.next;
        }

        return res.next;
    }

    public Node findMid(Node head) {
        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node sortList(Node head) {
        if (head == null || head.next == null) return head;

        // find mid of the linked list
        Node mid = findMid(head);

        // break the linked list into two halves
        Node left = head;
        Node right = mid.next;
        mid.next = null;

        // recursive calls to sort two halves
        left = sortList(left);
        right = sortList(right);

        // merge the sorted halves
        return merge(left, right);
    }
}
//most optimal
/* 
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
/* 
class Solution {
    
        public ListNode merge(ListNode left, ListNode right) {
        if (left == null) return right;
        if (right == null) return left;

        ListNode res = new ListNode(-1);
        ListNode temp = res;

        while (left != null && right != null) {
            if (left.val < right.val) {
                temp.next = left;
                temp = temp.next; // Fix: Update temp.next, not temp
                left = left.next;
            } else {
                temp.next = right;
                temp = temp.next; // Fix: Update temp.next, not temp
                right = right.next;
            }
        }

        // remaining elements of left
        while (left != null) {
            temp.next = left;
            temp = temp.next; // Fix: Update temp.next, not temp
            left = left.next;
        }

        // remaining elements of right
        while (right != null) {
            temp.next = right;
            temp = temp.next; // Fix: Update temp.next, not temp
            right = right.next;
        }

        return res.next;
    }

    public ListNode findMid(ListNode head) {
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        // find mid of the linked list
        ListNode mid = findMid(head);

        // break the linked list into two halves
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;

        // recursive calls to sort two halves
        left = sortList(left);
        right = sortList(right);

        // merge the sorted halves
        return merge(left, right);
    }
    }

*/