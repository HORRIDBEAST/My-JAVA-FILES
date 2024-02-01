public class FindUnionofArrays {
    //brute force - solved by me
    /* 
    import java.util.*;
public class Solution {
    public static List<Integer> sortedArray(int[] a, int[] b) {
        ArrayList<Integer> temp = new ArrayList<>();
        int n1 = a.length;
        int n2 = b.length;
        
        for (int i = 0; i < n1; i++) {
            temp.add(a[i]);
        }
        for (int i = 0; i < n2; i++) {
            temp.add(b[i]);
        }
        
        int n = temp.size();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (temp.get(i).equals(temp.get(j))) {
                    temp.remove(j);
                    n--; // Decrement the size after removal
                    j--; // Adjust the loop variable
                }
            }
        }
        
        Collections.sort(temp);
        return temp;
    }
}
*/
//using HashMap
import java.util.*;
public class Solution {
    public static List<Integer> sortedArray(int[] a, int[] b) {
        ArrayList<Integer> temp = new ArrayList<>();
        int n1 = a.length;
        int n2 = b.length;
        HashMap<Integer,Integer> f=new HashMap<>();
       for(int i=0;i<n1;i++)
           f.put(a[i],f.getOrDefault(a[i],0)+1);
       
         for(int i=0;i<n2;i++)
           f.put(b[i],f.getOrDefault(b[i],0)+1);
       
       for(int it: f.keySet())
           temp.add(it);
       
       Collections.sort(temp);
       return temp;
    }
}
//Using Set


//OPTIMAL SOLUTION - using 2 pointer appreoch
import java.util.*;

public class Solution {
    public static List<Integer> sortedArray(int[] a, int[] b) {
        ArrayList<Integer> temp = new ArrayList<>();
        int n1 = a.length;
        int n2 = b.length;
        int i = 0, j = 0;

        while (i < n1 && j < n2) {
            if (a[i] < b[j]) {
                if (temp.size() == 0 || temp.get(temp.size() - 1) != a[i]) {
                    temp.add(a[i]);
                }
                i++;
            } else {
                if (temp.size() == 0 || temp.get(temp.size() - 1) != b[j]) {
                    temp.add(b[j]);
                }
                j++;
            }
        }

        while (i < n1) {
            if (temp.get(temp.size() - 1) != a[i]) {
                temp.add(a[i]);
            }
            i++;
        }

        while (j < n2) {
            if (temp.get(temp.size() - 1) != b[j]) {
                temp.add(b[j]);
            }
            j++;
        }

        return temp;
    }
}



}
