//brute force
import java.util.Scanner;

public class Max_Nesting_depth_of_Paranthesis{
    public static int maxDepth(String s) {
        int count=0;
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(') count++;
            else if(s.charAt(i)==')'){ 
            ans=Math.max(count,ans);
            count--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with parentheses and characters: ");
        String inputString = scanner.nextLine();

        int result = maxDepth(inputString);

        System.out.println("The maximum depth of parentheses in the given string is: " + result);

        scanner.close();
    }
}
//better - using stack
/*
 * public static int maxDepth(String s) {
        int count=0;
        int n=s.length();
        int ans=0;
        Stack <Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(') st.push(s.charAt(i));
            else if (s.charAt(i)==')'){
                count=Math.max(count,st.size());
                 st.pop();
            }
        }
        return count;
    }
 */