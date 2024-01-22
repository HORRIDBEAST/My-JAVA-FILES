import java.util.*;
public class DiaOptimisedBT{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;

        }}
        static class BT{
            static int index=-1;
            public static Node buildTree(int nodes[]) {
                index++;

                if(nodes[index]==-1){
                    return null;
                }
                Node newNode= new Node(nodes[index]);
                newNode.left=buildTree(nodes);
                newNode.right=buildTree(nodes);
                return newNode;
                
            }
        }
     static class TreeInfo{
        int ht,diam;
        TreeInfo(int ht , int diam){
            this.ht=ht;
            this.diam=diam;
        }
     }
     public static TreeInfo FindDia(Node root){
        if(root == null){
            return new TreeInfo(0,0);
        }
        TreeInfo left=FindDia(root.left);
        TreeInfo right=FindDia(root.right);
        int maxHeight= Math.max(left.ht,right.ht)+1;

        int diam1=left.diam;
        int diam2=right.diam;
        int diam3=left.ht+right.ht+1;

        int maxdiam=Math.max(Math.max(diam1,diam2),diam3);

        TreeInfo MyInfo= new TreeInfo(maxHeight,maxdiam);
        return MyInfo;
    }
        
        public static void main(String args[]) {
            int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            BT tree= new BT();
            Node root=tree.buildTree(nodes);
            System.out.println("THE DIAMETER OF YOUR TREE IS");
            System.out.println(FindDia(root).diam);
        }
    
    }