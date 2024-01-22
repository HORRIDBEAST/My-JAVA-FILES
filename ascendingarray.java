import java.util.*;
public class ascendingarray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF YOUR ARRAY\t");
        int size=sc.nextInt();
        int number[] = new int[size];
        System.out.println(" enter the your array elemnts");
        //imput
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }

        boolean isAscending=true;
        for(int i=0;i<number.length-1;i++){              //notice number.length - 1 as the terminating condition
            if(number[i]>number[i+1]){
                isAscending =false;
            }

        }
        if(isAscending){
            System.out.println("the array is sorted in ascending order");
        }
        else{
            System.out.println("the array is not sortedd in ascending order");
        }
        }}
