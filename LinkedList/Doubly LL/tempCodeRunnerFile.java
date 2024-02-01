import java.util.*;

class Node {
    public int data;
    public Node next;
    public Node back;

    Node() {
        this.data = 0;
        this.next = null;
        this.back = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }

    Node(int data, Node next, Node back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }
}

public class DeleteNode {
    public static Node constructDLL(int[] arr) {
        int n = arr.length;
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < n; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public void print(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static Node deleteFirstNode(Node head) {
        if (head == null || head.next == null)
            return null;
        Node newHead = head.next;
        newHead.back = null;
        head.next = null;
        head = newHead;
        return head;
    }

    public static Node deleteLastNode(Node head) {
        if (head == null || head.next == null)
            return null;
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        Node prev = temp.back;
        prev.next = null;
        temp = null;
        return head;
    }

    public static Node deleteNode(Node head, Node temp) {
        if (temp == null || temp.next == null)
            return head;
        Node prev = temp.back;
        Node front = temp.next;

        if (front == null) {
            prev.next = null;
            temp.back = null;
        } else {
            prev.next = front;
            front.back = prev;
            temp.back = temp.next = null;
        }

        return head;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 9 };
        Node head = constructDLL(arr);

        DeleteNode obj = new DeleteNode();
        obj.print(head);

        // Delete first node
        head = deleteFirstNode(head);
        obj.print(head);

        // Delete last node
        head = deleteLastNode(head);
        obj.print(head);

        // Delete a specific node (e.g., node with value 3)
        Node temp = head.next.next; // pointing to node with value 3
        head = deleteNode(head, temp);
        obj.print(head);
    }
}
