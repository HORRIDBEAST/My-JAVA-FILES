import java.util.*;
public class Stringbuilder {
    public static void main(String args[]){
        StringBuilder ab=new StringBuilder("Rajas");
        System.out.println(ab);
    

    //char at index 0
    System.out.println(ab.charAt(0));

    //set character at index
    ab.setCharAt(0,'P' );
    System.out.println(ab);
}}
