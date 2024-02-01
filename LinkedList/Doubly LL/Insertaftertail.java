

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

public class Insertaftertail {
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
    public static Node insert(Node head,int val){
        Node NN=new Node(val,head,null);
            head.back=NN;
            return NN;
    }
    public static Node insertAtTail(Node list, int val) {
        if (list == null) {
            // If the list is empty, create a new node and return it as the new list.
            return new Node(val);
        }

        Node tmp = list;
        while (tmp.next != null) {
            tmp = tmp.next;
        }

        Node newNode = new Node(val);
        tmp.next = newNode;
        newNode.back = tmp;
        return list;
    }
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5,9 };
        Node head = constructDLL(arr);
        int val=10;

        Basic_Implementation obj = new Basic_Implementation();
        head = insertAtTail(head, val);
        obj.print(head);
    }
}


