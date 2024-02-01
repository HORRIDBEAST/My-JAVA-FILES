
public class Deletealloccurencesofakey {

    static class Node {
        public int data;
        public Node next;
        public Node prev;

        Node() {
            this.data = 0;
            this.next = null;
            this.prev = null;
        }

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public static Node deleteAllOccurrences(Node head, int k) {
        Node dummy = new Node(-1);
        Node tmp = head;
        Node nn = dummy;

        while (tmp != null) {
            if (tmp.data != k) {
                nn.next = tmp;
                nn.next.prev = nn;  // Set the previous pointer for the new node
                nn = nn.next;
            }
            tmp = tmp.next; // Move tmp inside the loop
        }

        // Important: Set nn.next and tmp.prev to null to remove any remaining nodes.
        nn.next = null;

        return dummy.next;
    }

    public static void printList(Node head) {
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node first = new Node(0, null, null);
        Node second = new Node(3, null, first);
        Node third = new Node(5, null, second);
        Node fourth = new Node(7, null, third);
        Node fifth = new Node(8, null, fourth);

        // Set the previous pointers for the initial nodes
        second.prev = first;
        third.prev = second;
        fourth.prev = third;
        fifth.prev = fourth;

        System.out.println("Original Linked List:");
        printList(first);

        int keyToRemove = 5;
        first = deleteAllOccurrences(first, keyToRemove);

        System.out.println("Linked List after removing all occurrences of " + keyToRemove + ":");
        printList(first);
    }
}
//msot optimal
/*
 * /****************************************************************

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
     Node(int data, Node next, Node prev)
     {
         this.data = data;
         this.next = next;
         this.prev = prev;
     }
 }

 *****************************************************************/
/* 
public class Solution {
    public static Node deleteAllOccurrences(Node head, int k) {
        Node tmp=head;
        while(tmp!=null){
            if(tmp.data==k){
                if(tmp==head){
                    head=tmp.next;
                }
                Node PN =tmp.prev;
                Node NN=tmp.next;
                if(NN!=null) NN.prev=PN;
                if(PN!=null) PN.next=NN;
                tmp=tmp.next;
            }
            else{
                tmp=tmp.next;
            }
        }
        return head;
    }
}

 */