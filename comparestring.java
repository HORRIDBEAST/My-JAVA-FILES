import java.util.*;
public class comparestring {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER  THE STRING 1");
        String firstname=sc.nextLine();
        System.out.println("ENTER  THE STRING 2");
        String secondname=sc.nextLine();

        /*    string 1>string2  =>+ve value
                string1=string 2 => 0
                string 1 <string 2 =>-ve value   */


        if (firstname.compareTo(secondname)==0){
            System.out.println("Strings are equal");
        }else
        System.out.println("Strings are not equal");
    }}