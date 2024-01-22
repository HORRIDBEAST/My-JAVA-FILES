import java.util.*;
public class maxandminarray{
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

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        
        for(int i =0;i<number.length;i++){
            if(number[i]<min){
                min=number[i];
            }
            if(number[i]>max){
                max=number[i];

            }
        }
            System.out.println(" THE LARGST NUMBER IN THE ARRAY IS "+max);
            System.out.println(" THE SMALLEST NUMBER IN THE ARRAY IS "+min);
        }
    }
