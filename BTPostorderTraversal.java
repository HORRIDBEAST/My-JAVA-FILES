import java.util.*;
public class BTPostorderTraversal{
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
        public static void POSTORDER(Node root) {
            if(root==null){
                return;
            }
            POSTORDER(root.left);
            POSTORDER(root.right);
            System.out.print(root.data+" ");
       
       
        }
        public static void main(String args[]) {
            int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            BT tree= new BT();
            Node root=tree.buildTree(nodes);
            System.out.println("YOR TREE IN POSTORDER MANNER IS");
            POSTORDER(root);
        }
    }