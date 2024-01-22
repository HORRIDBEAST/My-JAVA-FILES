import java.util.*;

public class searchinmatrixarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(" ENTERTHE NUMBER OF ROWS AND COLOUMNS RESPECTIVELY");
        int rows=sc.nextInt();
        int cols=sc.nextInt();

         int[][] number=new int[rows][cols];
           System.out.println("ENTER THE ELEMNTS F THE MATRIX ORDER WISE ");
         //imput
         //rows
        
         for(int i=0;i<rows;i++){
            //cloumns
            for(int j=0;j<cols;j++){
                number[i][j]=sc.nextInt();
            }
         }
         System.out.println("ENTER THE NUMBER U WANT TO SEARCH IN THIS ARRAY");
         int x= sc.nextInt();

         for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                //compare with x 
                if(number[i][j]==x){
                    System.out.println("x is found at location("+i+","+j+")");

                }
            }
         }
        }}