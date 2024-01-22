import java.util.*;
public class Stringarray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF YOUR ARRAY\t");
        int size=sc.nextInt();
        String name[]= new String[size];

        //input
        System.out.println("ENTER THOSE STRINGS");
        for(int i=0;i<size;i++);{
        name[i]=sc.next();
        }
        
        //output
        System.out.println(" THOSE STRINGS ARE");   
        for(int i=0;i<name.length;i++);{
            System.out.println("name"+i+1+"is :"+name[i]);
        }
    
    }
}
