public class frequencyof1 {
    //brute force 1 -gives TLE
    /* 
    public class Solution {
        public static int getSingleElement(int []arr){
            int n=arr.length;
            int frq[]=new int[n];
            int v=-1;
            for(int i=0;i<n;i++){
                frq[i]=v;
            }
            
            int c=0;
            for(int i=0;i<n;i++){
                c=1;
                for(int j=i+1;j<n;j++){
                    if(arr[i]==arr[j]){
                        c++;
                        frq[j]=0;
                    }
                }
                if(frq[i]!=0) frq[i]=c;
            }
            for(int i=0;i<n;i++){
                if(frq[i]==1) return arr[i];
            }
            return -1;
        }
    }

    */
    //using hashmap
    import java.util.HashMap;

public class Solution {
    public static int getSingleElement(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) == 1) {
                return arr[i];
            }
        }

        return -1;
    }
}

//most optimal solution -XOR
public class Solution {
    public static int getSingleElement(int[] arr) {
    int n = arr.length;
    int xor=0;
    for(int i=0;i<n;i++){
        xor=xor^ arr[i];
    }
       
        //This line will never execute
        //if the array contains a single element.
        return xor;
    }
}


}
