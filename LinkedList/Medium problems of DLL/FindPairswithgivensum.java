
import java.util.ArrayList;
import java.util.AbstractMap;



class Node {
    public int data;
    public Node prev;
    public Node next;

    public Node() {
        this.data = 0;
        this.prev = null;
        this.next = null;
    }

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    public Node(int data, Node next, Node prev) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}

public class FindPairswithgivensum {
    public static ArrayList<AbstractMap.SimpleEntry<Integer, Integer>> findPairs(Node head, int k) {
        Node temp1 = head;
        ArrayList<AbstractMap.SimpleEntry<Integer, Integer>> nn = new ArrayList<>();
    
        while (temp1 != null) {
            Node temp2 = temp1.next;
    
            while (temp2 != null && temp1.data + temp2.data <= k) {
                if (temp2.data + temp1.data == k) {
                    nn.add(new AbstractMap.SimpleEntry<>(temp1.data, temp2.data));
                }
    
                temp2 = temp2.next;
            }
    
            temp1 = temp1.next;
        }
    
        return nn;
    }
    
    public static void main(String[] args) {
        Node head = new Node(0);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(5);
        Node fifth = new Node(7);
        Node sixth = new Node(8);

        // Connect the nodes to form a doubly linked list
        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev = third;
        fourth.next = fifth;
        fifth.prev = fourth;
        fifth.next = sixth;
        sixth.prev = fifth;

        int targetSum = 10;

        ArrayList<AbstractMap.SimpleEntry<Integer, Integer>> result = findPairs(head, targetSum);

        System.out.println("Pairs with sum " + targetSum + ":");
        for (AbstractMap.SimpleEntry<Integer, Integer> pair : result) {
            System.out.println("(" + pair.getKey() + ", " + pair.getValue() + ")");
        }
    }
}
//most optimal
/*
 * Node* temp1 = head;
   vector<pair<int, int>> nn;
   while (temp1 != NULL) {
       Node* temp2 = temp1->next;
       while (temp2 != NULL && temp1->data + temp2->data <= k) {
           if (temp2->data + temp1->data == k) {
               nn.push_back(make_pair(temp1->data, temp2->data));
           }
           temp2 = temp2->next;
       }
       temp1 = temp1->next;
   }
   return nn;
 */

