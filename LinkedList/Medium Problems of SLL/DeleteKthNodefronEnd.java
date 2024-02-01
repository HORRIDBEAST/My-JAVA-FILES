
/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
 };

 *****************************************************************/

public class Solution
{
    public static Node DeleteKthNodefronEnd(Node head, int K)
    {
        int cnt=0;
        Node tmp=head;
        while(tmp!=null){
            tmp=tmp.next;
            cnt++;
        }
        int tobedel=cnt-K+1;
        if (tobedel <= 0)
        {
            return head;
        }

        // If toBeDeleted is 1, delete the head
        if (tobedel == 1)
        {
            return head.next;
        }
        int i=1;
        tmp=head;
        while(tmp!=null){
            
            if(tobedel-1==i){
                if(tmp.next!=null){
                
                tmp.next=tmp.next.next;
                break;
            }
            }
            tmp=tmp.next;
            i++;
        }
        return head;
    }
}
//most optimal
/*
 * 
 * /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head, slow = head, tmp = head;

        // Move fast K nodes ahead
        for (int i = 0; i < n; i++) {
            if (fast == null) {
                return head; // Handle the case where K is greater than the length of the list
            }
            fast = fast.next;
        }

        // If fast is null, it means K is equal to the length of the list, so remove the head
        if (fast == null) {
            return head.next;
        }

        // Move both pointers until fast reaches the end
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Remove the Kth node
        slow.next = slow.next.next;

        return head;
    }
}
 */