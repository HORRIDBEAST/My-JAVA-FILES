import java.util.*;
public class stringlength {
    
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER  THE STRING 1");
        String firstname=sc.nextLine();
        System.out.println("ENTER  THE STRING 2");
        String secondname=sc.nextLine();
        String Fullname= firstname + " "+ secondname;
        System.out.println("Ur mixed string is "+Fullname);
        System.out.println("THE LENGHT OF YOUR STRING IS\t"+Fullname.length());
}}
