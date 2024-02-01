//brute force
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

public class SortLLof012
{
    public static Node sortList(Node head) {
        Node tmp=head;
        int cnt0=0,cnt1=0,cnt2=0;
        while(tmp!=null){
            if(tmp.data==0) cnt0++;
            else if(tmp.data==1) cnt1++;
            else cnt2++;
            tmp=tmp.next;
        }
        tmp=head;
        while(tmp!=null){
            if(cnt0!=0){
                tmp.data=0;
                cnt0--;
            } 
            else if(cnt0==0 && cnt1!=0){
                tmp.data=1;
                cnt1--;
            }
            else {
                tmp.data=2;
                cnt2--;
            }
            tmp=tmp.next;
        }
        return head;

    }
}
//most optimal
