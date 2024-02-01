import java.util.*;
class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
       int n=s.length();
       int res=0;
       for(int i=0;i<n;i++){
           boolean visited[]= new boolean[256];
           for(int j=i;j<n;j++){
               if (visited[s.charAt(j)]==true){
                   break;
               }
               else{
                   res=Math.max(res,j-i+1);
                   visited[s.charAt(j)]=true;
               }

           }
           visited[s.charAt(i)]=false;
       }
       return res;
}
public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    String s=sc.next();
    int answer = lengthOfLongestSubstring(s);
    System.out.println(answer);
}
}