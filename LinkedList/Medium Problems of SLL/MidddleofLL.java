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

public class Solution
{
    public static Node findMiddle(Node head)
    {
        Node tmp=head;
        int cnt=0;
        while(tmp!=null){
            cnt++;
            tmp=tmp.next;
        }
        int c=0;
        tmp=head;
        
       for(int i=0;i<cnt/2;i++){
           tmp=tmp.next;

       }
        
        return tmp;
    }
}
//Optimal :-fast and slow pointer 
  public ListNode middleNode(ListNode head) {
         ListNode slow=head,fast=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;