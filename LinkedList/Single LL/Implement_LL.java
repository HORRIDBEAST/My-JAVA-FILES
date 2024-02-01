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

public class Implement_LL {
     public static Node constructLL(int[] arr) {
          int n=arr.length;
        Node head= new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<n;i++){
                Node temp=new Node(arr[i]);
                mover.next=temp;
                mover=temp;
        }
        return head;

    }
}