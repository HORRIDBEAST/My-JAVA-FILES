public class Remove_outer_Paranthesis {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        if(n<=2) return "";
        char check[] =s.toCharArray();
        StringBuilder u=new StringBuilder();
        int open=1;
        
        for( int i=1;i<n;i++){
            if(check[i]=='('){
            open++;
            if(open>1) u.append('(');
        }
        else{
            if(check[i]==')')
             if(open>1) u.append(')');
             open--;
        }
           }
           return u.toString();
}
}
