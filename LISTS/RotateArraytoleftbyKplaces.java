import java.util.ArrayList;
public class RotateArraytoleftbyKplaces {
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int n = arr.size();

        if (n == 0) {
            return arr; // Return the original array if it's empty
        }

        k = k % n; // Ensure k is within the range [0, n]

        for (int i =0; i < k; i++) {
            temp.add(arr.get(i));
        }
        for (int i =0; i<n-k; i++) {
            arr.set(i, arr.get(i+k));
        }
        for (int i = n-k; i < n; i++) {
            arr.set(i, temp.get(i-n+k));
        }
        return arr;
    }
}

