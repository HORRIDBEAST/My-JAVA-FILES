import java.util.Arrays;
public class LongestCommonPrefix {
   

    public static String commonPrefix(String[] arr, int n) {
        if (n == 0) return "-1";
        StringBuilder result = new StringBuilder();
        Arrays.sort(arr);
        char[] first = arr[0].toCharArray();
        char[] last = arr[n - 1].toCharArray();
        
        int minLength = Math.min(first.length, last.length);

        for (int i = 0; i < minLength; i++) {
            if (first[i] != last[i]) break;
            result.append(first[i]);
        }

        if (result.length() == 0) return "-1";
        else return result.toString();
    }
    public static void main(String[] args) {
        String[] input = {"Codingninjas", "Coding", "Coders", "Codezen"};
        System.out.println(commonPrefix(input, input.length));
    }
}


