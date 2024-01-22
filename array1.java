import java.util.*;
public class array1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements nn array");
        int size = sc.nextInt();
        int numbers[]=new int [size];
         System.out.println("print those numbers");
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
//print the numbers in array
System.out.println("those elemnts are");
for(int i=0;i<size;i++){
    System.out.println(numbers[i]+" ");
}
    }
}
