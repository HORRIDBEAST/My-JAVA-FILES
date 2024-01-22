import java.util.*;
public class cummulativelengthofstring {
    
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println(" ENTER TH ENUMBER OF STRINGS U WANT OT HAVE");
        int n =sc.nextInt();
        String name[]= new String[n];
        int l=0;
        System.out.println("enter ur strings");
        for(int i=0;i<n;i++){

         name[i]=sc.next();
            l=l+name[i].length();
        }
        System.out.println("THE TOTAL LENGHT  OF UR ENTERED STRINGS IS\t"+l);
    }}