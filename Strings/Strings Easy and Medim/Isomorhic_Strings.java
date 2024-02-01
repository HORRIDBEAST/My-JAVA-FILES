//optimal
import java.util.HashMap;
class Isomorphic_Strings {
    public boolean isIsomorphic(String s, String t) {
         int n1 = s.length();
        int n2 = t.length();

        if (n1 != n2) {
            return false;
        }

       HashMap<Character,Character>mpp=new HashMap<>();
       for(int i=0;i<n1;i++){
           char orignal=s.charAt(i);
           char repl=t.charAt(i);
           if(!mpp.containsKey(orignal)){
               if( !mpp.containsValue(repl)){
                   mpp.put(orignal,repl);
               }
               else return false;
           }
           else{
               char mappedchar=mpp.get(orignal);
               if(mappedchar!=repl) return false;
           }
       }
       return true;
    }
}
//bute force - found by me
/*
 * import java.util.HashSet;
public class Solution {
    public static boolean areIsomorphic(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();

        if (n1 != n2) {
            return false;
        }

        HashSet<Character> a = new HashSet<>();
        HashSet<Character> b = new HashSet<>();

        for (int i = 0; i < n1; i++) {
            a.add(str1.charAt(i));
            b.add(str2.charAt(i));
        }

        return a.size() == b.size();
    }
}
 */