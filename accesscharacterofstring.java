import java.util.*;
public class accesscharacterofstring {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER  THE STRING 1");
        String firstname=sc.nextLine();
        System.out.println("ENTER  THE STRING 2");
        String secondname=sc.nextLine();
        String Fullname= firstname + secondname;
        for(int i=0;i<Fullname.length();i++){
            System.out.println(Fullname.charAt(i));
        }
    
}}
