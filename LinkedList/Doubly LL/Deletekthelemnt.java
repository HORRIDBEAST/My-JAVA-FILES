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

public class Deletekthelemnt {
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
public static Node del1st(Node head){
        if(head==null || head.next==null) return null;
        Node prev=head;
        head=head.next;
        head.back=null;
        prev.next=null;
        return head;
    }
    public static Node deleteLastNode(Node head) {
        if(head==null || head.next==null) return null;
        Node t=head;
        while(t.next!=null) t=t.next;
        Node p=t.back;
        p.next=null;
        p=null;
        return head;
    }
    public static Node Deletekth(Node head,int k){
        Node temp=head;
        int cn=0;
        while(temp.next!=null){
            cn++;
            if(cn==k) break;
            temp=temp.next;
        }
        Node prev=temp.back;
        Node front=temp.next;
        if(prev==null && front==null) return null;
        else if(prev==null){
            del1st(head);
        }
        else if(front==null){
            deleteLastNode(head);
        }
        else{
            prev.next=front;
            front.back=prev;
            temp.next=null;
            temp.back=null;
        }
        return head;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF ELEMENTs OF THE LL");
        int n=sc.nextInt();
        int arr[]=new int[n];
                System.out.println("ENTER THE ELEMENTs OF THE LL");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Node head = constructDLL(arr);
        System.out.println("ENTER THE ELEMENTs THAT IS TO BE DELETED");
        int k=sc.nextInt();
        Basic_Implementation obj = new Basic_Implementation();
        head=Deletekth(head,k);
        obj.print(head);
    }
}


