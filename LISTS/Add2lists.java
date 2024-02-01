
 // Definition for singly-linked list.
  public class Add2lists { //class name should be Add2lists
     int val;
   ListNode next;
   ListNode() {}
   ListNode(int val) { this.val = val; }
   ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode HD=new ListNode(0);
        ListNode T=HD;
        int c=0;
        while( l1!=null || l2!=null ||c!=0){
            int d1,d2;
            if(l1!=null)
            d1=l1.val;
            else 
            d1=0;
            if(l2!=null)
            d2=l2.val;
            else
            d2=0;

            int s=d1+d2+c;
            int d=s%10;
            c=s/10;

            ListNode nN=new ListNode(d);
            T.next=nN;
            T=T.next;
            l1= (l1!=null)? l1.next : null;
            l2= (l2!=null)? l2.next : null; 
        }
        ListNode r=HD.next;
        HD.next=null;
        return r;
    }
}