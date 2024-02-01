import java.util.HashMap;
//mi kela
public class CheckifAnagram {
    public static boolean isAnagram(String str1, String str2) {
        int n1=str1.length();
        int n2=str2.length();
        HashMap<Character,Integer> mpp=new HashMap<>();
        if(n1!=n2) return false;
        boolean flag=true;
        for(int i=0;i<n1;i++){
            char ch=str1.charAt(i);
            if(mpp.containsKey(ch)) mpp.put(ch, mpp.get(ch)+1);
            else  mpp.put(ch,1);
        }
        for(int i=0;i<n1;i++){
            char ch=str2.charAt(i);
            if(!mpp.containsKey(ch) || mpp.get(ch)==0){ flag=false;
            break;
            }
            else  mpp.put(ch,mpp.get(ch)-1);
        }
        return flag;
    }
}
//better-sort the arrays
/*
 * import java.util.Arrays;
public class Solution {
    public static String sortString(String a){
        char b[]=a.toCharArray();
        Arrays.sort(b);
        return b.toString();
    }
    public static boolean isAnagram(String str1, String str2) {
        int n1=str1.length();
        int n2=str2.length();
        str1=sortString(str1);
        str2=sortString(str2);
        boolean flag=true;
       for(int i=0;i<n1;i++){
           if(str1.charAt(i)!=str2.charAt(i)) flag=false;
       }
    return flag;
    }

}
 */
//most optimal - get the frequency of the array
/*
 * import java.util.Arrays;
public class Solution {
     public static boolean isAnagram(String str1, String str2) {
       if (str1.length() != str2.length())
      return false;
 
    int[] freq = new int[26];
    for (int i = 0; i < str1.length(); i++) {
      freq[str1.charAt(i) - 'A']++;
    }
    for (int i = 0; i < str2.length(); i++) {
      freq[str2.charAt(i) - 'A']--;
    }
    for (int i = 0; i < 26; i++) {
      if (freq[i] != 0)
        return false;
    }
    return true;
  
    }

}
 */