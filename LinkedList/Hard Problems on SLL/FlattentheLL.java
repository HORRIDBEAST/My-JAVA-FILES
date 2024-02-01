public class FlattentheLL {
    import java.util.ArrayList;
import java.util.Collections;
/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node child;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.child = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.child = null;
     }
     Node(int data, Node next, Node child)
     {
         this.data = data;
         this.next = next;
         this.child = child;
     }
 }

 *****************************************************************/

public class Solution {

         public static Node convert(ArrayList<Integer> al) {
        int size = al.size();
        if (size == 0) {
            return null;
        }

        Node head = new Node(al.get(0));
        Node tmp = head;

        for (int i = 1; i < size; i++) {
            Node newNode = new Node(al.get(i));
            tmp.child = newNode;
            tmp = tmp.child;
        }

        return head;
    }

    // Flatten the linked list
    public static Node flattenLinkedList(Node head) {
        Node tmp = head;
        ArrayList<Integer> al = new ArrayList<>();

        // Traverse the linked list and collect all data in ArrayList
        while (tmp != null) {
            Node tmp2 = tmp;
            while (tmp2 != null) {
                al.add(tmp2.data);
                tmp2 = tmp2.child;
            }
            tmp = tmp.next;
        }

        // Sort the ArrayList
        Collections.sort(al);

        // Update the linked list with sorted data
        head = convert(al);

        return head;
    }
    }
}
