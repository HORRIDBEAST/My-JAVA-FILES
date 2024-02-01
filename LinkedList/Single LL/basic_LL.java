import java.util.*;

class Node {
    public int data;
    public Node next;

    Node() {
        this.data = 0;
        this.next = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class basic_LL {
    public static Node convert(int arr[]) {
        int n = arr.length;
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < n; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static Node constructLL(int[] arr) {
        return convert(arr);
    }

    public static void printLinkedList(Node head) {
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + "->");
            tmp = tmp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node head = constructLL(arr);
        printLinkedList(head);
    }
}
