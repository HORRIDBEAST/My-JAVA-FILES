import java.util.*;

public class transposematrixarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(" ENTERTHE NUMBER OF ROWS AND COLOUMNS RESPECTIVELY");
        int n=sc.nextInt();
        int m=sc.nextInt();

        int matrix[][]=  new int[n][m];
        System.out.println("ENTER YOUR ARRAY ELEMNTS IN ORDER ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                matrix[i][j]=sc.nextInt();
            }
        }
         System.out.println(" THE TRANSPOSE IS: ");

         //to print tranopse
         for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
         }
        }}