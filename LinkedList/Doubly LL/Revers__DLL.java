//Brute Force - Uisn the Stack 

import java.util.Stack;

public class Revers__DLL {
    public static class Node {
        // Data stored in the node
        public int data;
        // Reference to the next node
        //in the list (forward direction)
        public Node next;
        // Reference to the previous nod
        //in the list (backward direction)
        public Node back;

        // Constructor for a Node with both data, 
        //a reference to the next node, and a
        //reference to the previous node
        public Node(int data1, Node next1, Node back1) {
            data = data1;
            next = next1;
            back = back1;
        }

        // Constructor for a Node with data,
        //and no references to the next and
        //previous nodes (end of the list)
        public Node(int data1) {
            data = data1;
            next = null;
            back = null;
        }
    }

    private static Node convertArr2DLL(int[] arr) {
        // Create the head node with the
        //first element of the array
        Node head = new Node(arr[0]);
        // Initialize 'prev' to the head node
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            // Create a new node with data from
            // the array and set its 'back' pointer
            // to the previous node
            
            Node temp = new Node(arr[i], null, prev);
            // Update the 'next' pointer of the
            // previous node to point to the new node
            
            prev.next = temp;
            // Move 'prev' to the newly created node
            //for the next iteration
            prev = temp;
        }
        // Return the head of the doubly linked list
        return head;
    }

    private static void print(Node head) {
        while (head != null) {
            // Print the data in the current node
            System.out.print(head.data + " ");
            // Move to the next node
            head = head.next; 
        }
        System.out.println();
    }
    
        // Initialise a stack st
        public static Node reverseDLL(Node head)
        {
            Node tmp=head;
            Stack<Integer> st=new Stack<>();
            while(tmp!=null){
                st.push(tmp.data);
                tmp=tmp.next;
            }
            Node k=head;
            while(k!=null){
                k.data=st.pop();
                k=k.next;
            }
            return head;
        }

    

    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8, 4};
        // Convert the array to a doubly linked list
        Node head = convertArr2DLL(arr);

        // Print the doubly linked list
        System.out.println("Doubly Linked List Initially:  ");
        print(head);

        System.out.println("Doubly Linked List After Reversing :");

        head =reverseDLL(head);
        print(head);

    }


}

//Optimal solution -- witjout Stack 
/*
 *  public static Node reverseDLL(Node head)
    {
        if(head==null || head.next==null) return head;
       Node last=null;
       Node tmp=head;
       while(tmp!=null){
           last=tmp.prev;
           tmp.prev=tmp.next;
           tmp.next=last;
           tmp=tmp.prev;
       }
    return last.prev;
    }
 */