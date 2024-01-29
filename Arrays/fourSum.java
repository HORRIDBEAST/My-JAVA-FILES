import java.util.*;
public class fourSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("ENTER THE TARGET ELEMENT");
        int target = sc.nextInt();
        int ans[]=new int[4];
         HashMap<Integer, Integer> map1
          = new HashMap<>();
         HashMap<Integer, Integer> map = new HashMap<>();
         
         for(int i=0;i<N;i++){
        for(int j=0;j<i+1;j++){
            int reqsum=target-a[i]-a[j];
            if(map.containsKey(reqsum)){
                ans[0]=a[i],ans[1]=a[2],ans[3]=a[3];
            }
        }
         }
}
}
/* 
import java.util.*;

class TwoSum {
    
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int sno = target - a[i];
            if (map.containsKey(sno)) {
                ans[0] = i;
                ans[1] = map.get(sno);
                break;
            }
            map.put(a[i], i);
        }
        System.out.println(ans[0] + " " + ans[1]);
    }
}
*/