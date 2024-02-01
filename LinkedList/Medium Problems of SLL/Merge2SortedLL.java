
import java.io.*;
import java.util.*;

/************************************************************

    Following is the linked list LinkedListNode structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Merge2SortedLL {
    public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
        LinkedListNode<Integer> t1 = first, t2 = second;
        LinkedListNode<Integer> dnode = new LinkedListNode<>(-1);
        LinkedListNode<Integer> temp = dnode;
        while (t1 != null && t2 != null) {
            if (t1.data < t2.data) {
                temp.next = t1;
                temp = t1;
                t1 = t1.next;
            } else {
                temp.next = t2;
                temp = t2;
                t2 = t2.next;
            }
        }
        if (t1 != null) temp.next = t1;
        else if (t2 != null) temp.next = t2;
        return dnode.next;
    }
}
