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

public class ReverseLLingroupsofK {

    public static Node GetKthNode(Node head, int k) {
        Node tmp = head;
        while (tmp != null && k > 0) {
            tmp = tmp.next;
            k--;
        }
        return tmp;
    }

    public static Node reverseLinkedList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseLinkedList(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }

    public static Node kReverse(Node head, int k) {
        Node tmp = head;
        Node PN = null;

        while (tmp != null) {
            Node Kth = GetKthNode(tmp, k - 1);
            if (Kth == null) {
                if (PN != null) {
                    PN.next = tmp;
                }
                break;
            }

            Node NN = Kth.next;
            Kth.next = null;

            tmp = reverseLinkedList(tmp);

            if (tmp == head) {
                head = Kth;
            } else {
                PN.next = Kth;
            }

            PN = tmp;
            tmp = NN;
        }

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(8);
        head.next = new Node(18);
        head.next.next = new Node(0);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next.next = new Node(22);

        System.out.println("Original Linked List:");
        printLinkedList(head);

        int k = 3;
        head = kReverse(head, k);

        System.out.println("Linked List after kReverse:");
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
}
