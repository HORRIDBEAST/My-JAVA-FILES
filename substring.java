
import java.util.*;
public class substring {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER  THE STRING 1");
        String firstname=sc.nextLine();
        System.out.println("ENTER THE BEGINNNING INDEX AND END INDEX OF YOUR STRING TO GET THE SUBSTRING");
         int b=sc.nextInt();
         int e=sc.nextInt();
    
        System.out.println(firstname.substring(b,e));
    }}
    