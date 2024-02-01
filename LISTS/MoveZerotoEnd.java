import java.util.ArrayList;

public class MoveZerotoEnd {
    //brute force
     public static int[] moveZeros(int n, int []a) {
            ArrayList<Integer> temp=new ArrayList<>();
            
            int count=0;
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                temp.add(a[i]);
            } 
        }
            int size=temp.size();
             for(int i=0;i<size;i++){
            a[i]=temp.get(i);
        }
         for(int i=size;i<n;i++){
            a[i]=0;
        }
    return a;
}
