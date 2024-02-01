//most optimal
public class Clone_LL {
    static class Node {
        public int data;
        public Node next;
        public Node random;

        Node() {
            this.data = 0;
            this.next = null;
            this.random = null;
        }

        Node(int data) {
            this.data = data;
            this.next = null;
            this.random = null;
        }

        Node(int data, Node next, Node random) {
            this.data = data;
            this.next = next;
            this.random = random;
        }
    }

    public static void insertCpyNodesInbetween(Node head) {
        Node tmp = head;
        while (tmp != null) {
            Node cpy = new Node(tmp.data);
            cpy.next = tmp.next;
            tmp.next = cpy;
            tmp = tmp.next.next;
        }
    }

    public static void connectRandomPtrs(Node head) {
        Node tmp = head;
        while (tmp != null) {
            Node copyNode = tmp.next;

            if (tmp.random != null) {
                copyNode.random = tmp.random.next;
            } else {
                copyNode.random = null;
            }

            tmp = tmp.next.next;
        }
    }

    public static Node connectNextPtr(Node head) {
        Node tmp = head;
        Node dummy = new Node(-1);
        Node result = dummy;

        while (tmp != null) {
            result.next = tmp.next;
            tmp.next = tmp.next.next;

            result = result.next;
            tmp = tmp.next;
        }

        return dummy.next;
    }

    public static Node cloneLL(Node head) {
        insertCpyNodesInbetween(head);
        connectRandomPtrs(head);
        return connectNextPtr(head);
    }

    public static void main(String[] args) {
        // Example list: [[7, null], [13, 0], [11, 4], [10, 2], [1, 0]]
        Node head = new Node(7);
        Node node1 = new Node(13);
        Node node2 = new Node(11);
        Node node3 = new Node(10);
        Node node4 = new Node(1);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        head.random = null;
        node1.random = head;
        node2.random = node4;
        node3.random = node2;
        node4.random = head;

        // Clone the linked list
        Node clonedHead = cloneLL(head);

        // Print original linked list with random pointers
        System.out.println("Original Linked List:");
        printList(head);

        // Print cloned linked list with random pointers
        System.out.println("\nCloned Linked List:");
        printList(clonedHead);
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print("[" + temp.data + ", ");
            if (temp.random != null) {
                System.out.print(temp.random.data);
            } else {
                System.out.print("null");
            }
            System.out.print("] -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
//brute force - using hashMap
/*
 *  public static Node cloneLL(Node head) {
        Node tmp = head;
        Node dummy = new Node(-1);
        HashMap<Node, Node> mpp = new HashMap<>();

        // First loop: Create new nodes and map original nodes to new nodes
        while (tmp != null) {
            Node NN = new Node(tmp.data);
            mpp.put(tmp, NN);
            tmp = tmp.next;
        }

        // Reset tmp to head for the second loop
        tmp = head;

        // Second loop: Update next and random pointers of the new nodes
        while (tmp != null) {
            Node cpy = mpp.get(tmp);
            cpy.next = (tmp.next != null) ? mpp.get(tmp.next) : null;
            cpy.random = mpp.get(tmp.random);
            tmp = tmp.next;
        }

        return mpp.get(head);
    }
 */