/*import java.util.* ;
import java.io.*; 

class Node {
    public int data;
    public Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Add1toLL {
    public static Node reverseLinkedList(Node head) {
        Node tmp = head, prev = null;
        while (tmp != null) {
            Node front = tmp.next;
            tmp.next = prev;
            prev = tmp;
            tmp = front;
        }
        return prev;
    }

    public static Node addNode(Node head) {
        Node tmp = head;
        int carry = 1;

        // Reverse the linked list
        tmp = reverseLinkedList(head);

        // Traverse the reversed linked list and add 1 to each node
        while (tmp != null) {
            tmp.data += carry;

            if (tmp.data < 10) {
                carry = 0;
                break;
            } else {
                tmp.data = 0;
                carry = 1;
            }

            tmp = tmp.next;
        }

        // If there is still a carry after traversal, add a new node with value 1
        if (carry == 1) {
            Node newHead = new Node(1);
            newHead.next = tmp;
            return newHead;
        }

        // Reverse the linked list back to its original order
        head = reverseLinkedList(tmp);

        return head;
    }

    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);

        System.out.println("Original linked List is");
        printLinkedList(head);

        System.out.println("LL after adding 1 is");
        head = addNode(head);
        printLinkedList(head);
    }
}
*/
import java.util.*;

class Node {
    public int data;
    public Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Add1toLL {
    public static int helper(Node temp) {
        if (temp == null)
            return 1; // If temp is null, consider it as a carry of 1 for the leftmost digit.
        int carry = helper(temp.next);
        temp.data += carry;
        if (temp.data < 10)
            return 0;
        temp.data = 0;
        return 1;
    }

    public static Node addNode(Node head) {
        int carry = helper(head);
        if (carry == 1) {
            Node newHead = new Node(1);
            newHead.next = head;
            return newHead;
        }
        return head;
    }

    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);

        System.out.println("Original linked List is");
        printLinkedList(head);

        System.out.println("LL after adding 1 is");
        head = addNode(head);
        printLinkedList(head);
    }
}
