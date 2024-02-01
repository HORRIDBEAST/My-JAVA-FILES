
//brute force - using extra data sructure - mi kelay
import java.util.ArrayList;
/*
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



public class Solution {
    public static boolean isPalindrome(Node head) {
        Node temp=head;
        int cnt=0;
        ArrayList <Integer> al=new ArrayList<>();
        while(temp!=null){
            al.add(temp.data);
            cnt++;
            temp=temp.next;

        }
        
        boolean flag=true;
        for(int i=0;i<cnt/2;i++){
            if(!al.get(i).equals(al.get(cnt-i-1))){ flag=false;
            break;}
        }
        return flag;
    }
} 
 */
//orignal brute force - stack
import java.util.ArrayList;
import java.util.Stack;

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
/* 
public class Solution {
    public static boolean isPalindrome(Node head) {
        Node temp=head;
       Stack <Integer> st=new Stack<>();
       while(temp!=null){
           st.add(temp.data);
           temp=temp.next;
       }
       temp=head;
       boolean flag=true;
       while(temp!=null){
           if(temp.data != st.pop()) flag=false;
           temp=temp.next;
       }
       return flag;
    }
}
*/
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
class Solution {
     public static ListNode reverseLinkedList(ListNode head)
    {
        ListNode tmp=head,prev=null;
        while(tmp!=null){
          ListNode  front=tmp.next;
            tmp.next=prev;
            prev=tmp;
            tmp=front;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        } 
        ListNode nh=reverseLinkedList(slow.next);
        ListNode f=head,s=nh;
        while(s!=null){
            if(f.val != s.val){
                reverseLinkedList(nh);
                return false;
            }
            s=s.next;
            f=f.next;
        }
        reverseLinkedList(nh);
        return true;
    }
}