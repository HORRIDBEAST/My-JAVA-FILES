
//brute force - hash set
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class DetectCycleinLL {
    public boolean hasCycle(ListNode head) {
         HashMap<ListNode, Integer> mpp = new HashMap<>();
        ListNode tmp = head;
        while (tmp != null) {
            if (mpp.containsKey(tmp)) return true;
            mpp.put(tmp, 1);
            tmp = tmp.next;
        }
        return false;
    }
}
//optimal solutoin- tortoise hare approach
/*
 * 
 */