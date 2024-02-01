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
 };

 *****************************************************************/

public class DeleteMiddleofLL {
    public static Node deleteMiddle(Node head) {
        if(head==null || head.next==null) return head.next;
    Node tmp=head;
        int cnt=0;
        while(tmp!=null){
            cnt++;
            tmp=tmp.next;
        }
        int c=0;
        tmp=head;
        
       for(int i=0;i<cnt/2 -1;i++){
           tmp=tmp.next;
       }
       tmp.next=tmp.next.next;
       return head;
    }
    }
//most optimal - tortoise hare
/*
 * class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return head.next;
    ListNode fast=head,slow=head;
    while(fast.next.next!=null && fast.next.next.next!=null){
        fast=fast.next.next;
    slow=slow.next;
    } 
    slow.next=slow.next.next;
       return head;
    }
}
 */