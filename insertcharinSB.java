import java.util.*;
public class insertcharinSB {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        StringBuilder ab=new StringBuilder("Rajas");
        ab.insert(0,'p');
        System.out.println(ab);
    

        ab.insert(2,'l');
        System.out.println(ab);


        //delete charachet also ncluded in prg
        ab.delete(2, 3);
        System.out.println(ab);

        ab.delete(1, 2);
        System.out.println(ab);



}}
