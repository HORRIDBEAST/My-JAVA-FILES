import java.util.*;
public class BTIsSubtree{
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
        public boolean isIdentical(TreeNode root,TreeNode subRoot){
            if(subRoot == null && root == null){
                return true;
            }
            if(root == null || subRoot == null){
                return false;
            }
            if(root.data == subRoot.data){
                return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
            }
            return false;
        }
       
        public boolean isSubtree(TreeNode root, TreeNode subRoot) {
            if(subRoot == null){
                return true;
            }
            if(root == null){
                return false;
            }
            if(isIdentical(root, subRoot)){
                return true;
            }
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }
     
        
        public static void main(String args[]) {
            int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            BT tree= new BT();
            Node root=tree.buildTree(nodes);
            System.out.println(isSubtree());
            System.out.println(isIdentical());
        }
    
    }