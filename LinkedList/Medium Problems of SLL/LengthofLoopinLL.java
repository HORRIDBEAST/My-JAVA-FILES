import java.util.HashMap;

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

public class LengthofLoopinLL {
    public static int lengthOfLoop(Node head) {
        int length = 0;
        int timer = 1;
        HashMap<Integer, Integer> m = new HashMap<>();
        Node tmp = head;
        while (tmp != null) {
            if (m.containsKey(tmp.data)) {
                int val = m.get(tmp.data);
                return timer - val;
            }
            m.put(tmp.data, timer);
            timer++;
            tmp = tmp.next;
        }

        return length;
    }
}
