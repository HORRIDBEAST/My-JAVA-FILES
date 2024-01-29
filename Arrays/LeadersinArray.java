//brute force
import java.util.*;
public class Solution {
    public static List< Integer > superiorElements(int[] a) {
        int n = a.length;
        ArrayList <Integer>AL=new ArrayList<>();
        for(int i=0;i<n;i++){
          boolean flag=true;
          for(int j=i+1;j<n;j++){
            if(a[j]>a[i]){
              flag=false;
              break;
            }
          }
          if(flag) AL.add(a[i]);
        }
        Collections.sort(AL);
  return AL;
   
    }
}
