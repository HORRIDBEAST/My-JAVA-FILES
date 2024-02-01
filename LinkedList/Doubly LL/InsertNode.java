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

public class InsertNode {
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

    public static Node insertatKth(Node head,int k,int val){
        if(k==1) return insert(head, val);
        Node temp=head;
        int cnt=0;
        while (temp.next!=null) {
            cnt++;
            if(cnt==k) break;
            temp=temp.next;
        }
        Node prevNode=temp.back;
        Node NN=new Node(val,temp,prevNode);
        prevNode.next=NN;
        temp.back=NN;
        return head;
    }
    public static void insertnode(Node head,int val){
        Node tmp=head;
        Node prev=tmp.back;
        Node NN=new Node(val,tmp,prev);
        prev.next=NN;
        tmp.back=NN;

    }
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5,9 };
        Node head = constructDLL(arr);
        Basic_Implementation obj = new Basic_Implementation();
        insertnode(head.next.next.next, 100);
        obj.print(head);
    }
}


