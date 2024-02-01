
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

public class InsertatKthElemnt {
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
        System.out.println("ENTER THE POSITION AT WHCIH IS TO BE INSERTED");
        int k=sc.nextInt();
        System.out.println("ENTER THE ELEMENTs THAT IS TO BE INSERTED");
        int val=sc.nextInt();

        Basic_Implementation obj = new Basic_Implementation();
        head=insertatKth(head,k,val);
        obj.print(head);
    }
}


