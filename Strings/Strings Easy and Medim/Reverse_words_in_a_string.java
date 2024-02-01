import java.util.Stack;
//brute force-using stack
public class Reverse_words_in_a_string {
    public static String reverseString(String str) {
        int n = str.length();

        // Push the words into the stack
        Stack<String> s = new Stack<>();
        String ans = "";

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ') {
                s.push(ans);
                ans = "";
            } else {
                ans += str.charAt(i);
            }
        }

        // Push the remaining content of ans into the stack
        s.push(ans);

        String reversedString = "";

        // Reverse the words into the string by popping from the stack
        while (!s.isEmpty()) {
            reversedString += s.peek() + " ";
            s.pop();
        }

        // Remove the trailing space
        reversedString = reversedString.trim();

        return reversedString;
    }
}
//optimal-using stringBuilder
/*
 * String[] s1 = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = s1.length-1; i >= 0; i--) {
           sb.append(s1[i] + " ");
        }
        String s2 = sb.toString();
        return s2.trim();
 */

//most optimal-
/*
 * public class Solution {
    public static String reverseString(String str) {
        int n = str.length();

        String temp = "";
        String ans = "";
        int left = 0;

        while (left < n) {
            char ch = str.charAt(left);

            if (ch != ' ') {
                temp += ch;
            } else {
                if (!temp.equals("")) {
                    if (!ans.equals("")) {
                        ans = temp + " " + ans;
                    } else {
                        ans = temp;
                    }
                    temp = "";
                }
            }

            left++;
        }

        // Handle the last word
        if (!temp.equals("")) {
            if (!ans.equals("")) {
                ans = temp + " " + ans;
            } else {
                ans = temp;
            }
        }

        return ans;
    }
}

 */