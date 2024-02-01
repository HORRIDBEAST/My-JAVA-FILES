//brute force:- i got

public class Largest_Odd_number_in_string {
        public String largestOddNumber(String num) {
            int n=num.length();
            boolean flag=false;
            int odd=Integer.MIN_VALUE;
            int last=num.charAt(n-1)-'0';
            int k=0;
            if (last%2==1) return num;
            
            else{
            for(int i=0;i<n;i++){
                int a=num.charAt(i)-'0';
                if(a%2==1){
                    flag=true;
                    odd=Math.max(odd,a);
                    k=i;
                }
                else continue;
            }
           StringBuilder sb = new StringBuilder();
            if(flag) {
                for(int i=0;i<=k;i++){
                    sb.append(num.charAt(i));
                }
                return sb.toString();
            }
            else return "";
            }
        }
    
}
//most optimal
/*
 * class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();
        
        for(int i=num.length()-1;i>=0;i--){
            int current=num.charAt(i)-'0';
           if(current%2!=0){
                 return num.substring(0,i+1);
           }
        }
    return "";
    }
}
//intutuion
To get the largest odd number in string we will search for first odd character in the string from the end of the array and
 then we will return the string from zero index to its index +1 because substring methods excludes the ending index given to it,
  and any number ending with a odd digit will always be odd and if we search from last we will get the largest no. as well and that
 what our question is asking us to return;

//approach
Iterate the String from last character using for loop and when you find your first odd character using if condition u just 
return the string from 0 index to that index, if there is no even digit than return the empty string which will happen automatically 
when all iterations of loop is complete.
 */