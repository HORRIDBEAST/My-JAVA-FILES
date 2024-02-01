public class Rotate_String{
    public static int isCyclicRotation(String p, String q)  {
        int n=p.length();

       int start=0;

       for(int i=0;i<n;i++){

           if(p.charAt(i)==q.charAt(0)){

               start=i;

               String res=(p.substring(start) +p.substring(0,start));

               if(res.equals(q)){

                   return 1;

               }       

           }

       }

       return 0;
       
   }
}
//better 
/*
 * public static int isCyclicRotation(String p, String q)  {
        String temp=p+p;
        if(temp.contains(q))
            return 1;
         return 0;
        
    }
 */
//optimal 
/*
 * public class Solution {
    public static void reversestring(StringBuilder s, int start, int end) {
        while (start <= end) {
            char ch = s.charAt(start);
            s.setCharAt(start, s.charAt(end));
            s.setCharAt(end, ch);
            start++;
            end--;
        }
    }

   public static int isCyclicRotation(String p, String q) {
    int n1 = p.length();
    int n2 = q.length();
    boolean flag = false;
    StringBuilder sb = new StringBuilder(p);

    for (int i = 0; i < n1; i++) {
        if (sb.toString().equals(q)) {
            flag = true;
            break;
        }

        char firstChar = sb.charAt(0);
        sb.deleteCharAt(0);
        sb.append(firstChar);
    }

    return flag ? 1 : 0;

    }
}

 */