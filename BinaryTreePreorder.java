import java.util.*;
public class BinaryTreePreorder{
    static class Node{
        int data;
        Node left;                  //FAKTA TREE CHA ROOT ACHPRINT HONAR AHE IE 1
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
        public static void main(String args[]) {
            int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            BT tree= new BT();
            Node root=tree.buildTree(nodes);
            System.err.println("///***  YOUR BINARY TREE ROOT IS       ***\\\\");
            System.out.println(root.data);
        }
    }
