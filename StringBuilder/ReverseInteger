class Solution {
    public int reverse(int x) {
     StringBuilder s=new StringBuilder();
     s.append(Math.abs(x));
     s.reverse();
     if(s.length()>=10){
       int n1=Integer.parseInt(s.substring(0,5));
       int n2=Integer.parseInt(s.substring(5,10));
       if(n1>21474 || n2>83647)
       return 0;
     }
     int n=Integer.parseInt(s.toString());
     if(x>0)
     return n;
     else 
     return -n;
}
}