import java.util.*;
public class DiameterOfBT{
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
        public static int CalculateHeight(Node root) {
            if(root==null){
                return 0;
            }
            int leftHeight=CalculateHeight(root.left);
            int rightHeight=CalculateHeight(root.right);
            int maxHeight=rightHeight;
            if(maxHeight<leftHeight){
                maxHeight=leftHeight;
            }
             return maxHeight+1;
            }
            public static int FindDiameter(Node root){
                if (root==null){
                    return 0;
                }
                int dia1= FindDiameter(root.left);
                int dia2=FindDiameter(root.right);
                int dia3=CalculateHeight(root.left)+CalculateHeight(root.right)+1;

                return Math.max(dia3 , Math.max(dia1,dia2));
            }
        
        public static void main(String args[]) {
            int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            BT tree= new BT();
            Node root=tree.buildTree(nodes);
            System.out.println("THE DIAMETER OF YOUR TREE IS");
            System.out.println(FindDiameter(root));
        }
    
    }