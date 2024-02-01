
//brute force
/*
 * import java.util.HashMap;




/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/
/* 
public class Solution {
    public static int findIntersection(Node firstHead, Node secondHead) {
        HashMap<Node , Integer> mpp=new HashMap<>();
        Node t1=firstHead,t2=secondHead;
        while(t1!=null){
            mpp.put(t1, 1);
            t1=t1.next;
        }
        t1=firstHead;
        while(t2!=null){
            if(mpp.containsKey(t2)) return t2.data;
            t2=t2.next;
        }
        return 0;
    }
}
 */
//better solution

public class FindIntersectionof2LL {

    import java.util.HashMap;

/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/
/* 
public class Solution {
    public static int findIntersection(Node firstHead, Node secondHead) {
       Node t1 = firstHead, t2 = secondHead;
       int n1 = 0, n2 = 0;
       
       // Calculate the length of the first list
       while (t1 != null) {
           n1++;
           t1 = t1.next;
       }
       
       // Calculate the length of the second list
       while (t2 != null) {
           n2++;
           t2 = t2.next;
       }
       
       // Reset t1 and t2 to the heads of the lists
       t1 = firstHead;
       t2 = secondHead;

       // Adjust the starting position of t1 or t2 based on the difference in length
       if (n1 > n2) {
           int d = n1 - n2;
           for (int i = 0; i < d; i++) {
               t1 = t1.next;
           }
       } else {
           int d = n2 - n1;
           for (int i = 0; i < d; i++) {
               t2 = t2.next;
           }
       }

       // Move both pointers until intersection is found
       while (t1 !=t2 ) {
           t1 = t1.next;
           t2 = t2.next;
       }
       
       return t1.data;
    }
}

}

*/
//optimal solution
/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

public class Solution {
    public static int findIntersection(Node firstHead, Node secondHead) {
        Node t1=firstHead,t2=secondHead;
        while(t1!=t2){
            t1=t1.next;
            t2=t2.next;
            if(t1==t2) return t1.data;
            if(t1==null) t1=secondHead;
            if(t2==null) t2=firstHead;
        }
        return t1.data;
    }
}
}