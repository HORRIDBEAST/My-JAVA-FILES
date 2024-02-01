// public class RotateLL {
//     public static Node findNthNode(Node head,int k){
//         Node tmp=head;
//         int cnt=1;
//         while(tmp!=null){
//             if(cnt==k) return tmp;
//             cnt++;
//             tmp=tmp.next;
//         }
//         return tmp;
//     }
//     public static Node rotate(Node head, int k) {
//         Node tmp=head;
//         int len=1;
//         while(tmp.next!=null){
//             tmp=tmp.next;
//             len++;
//         }
//         if(k%len==0) return head;
//         k=k%len;

//         tmp.next=head;
//         Node NthNode=findNthNode(head,len-k);
//         head=NthNode.next;
//         NthNode.next=null;
//     return head;

//     }
// }
public class RotateLL {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(5);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(9);
        head.next.next.next.next.next = new Node(3);
        head.next.next.next.next.next.next = new Node(53);
        head.next.next.next.next.next.next.next = new Node(33);

        System.out.println("Original Linked List:");
        printLinkedList(head);

        int k = 3;
        head = rotate(head, k);

        System.out.println("Linked List after rotating by " + k + " positions:");
        printLinkedList(head);
    }

    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static class Node {
        public int data;
        public Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static Node findNthNode(Node head, int k) {
        Node tmp = head;
        int cnt = 1;
        while (tmp != null) {
            if (cnt == k) return tmp;
            cnt++;
            tmp = tmp.next;
        }
        return tmp;
    }

    public static Node rotate(Node head, int k) {
        Node tmp = head;
        int len = 1;
        while (tmp.next != null) {
            tmp = tmp.next;
            len++;
        }
        if (k % len == 0) return head;
        k = k % len;

        tmp.next = head;
        Node NthNode = findNthNode(head, len - k);
        head = NthNode.next;
        NthNode.next = null;
        return head;
    }
}
