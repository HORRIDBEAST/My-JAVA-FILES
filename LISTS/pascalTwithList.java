public class pascalTwithList {
    //most optimal
    import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> generateRow(int r) {
        List<Integer> ans = new ArrayList<>();
        int result = 1;
        for (int i = 1; i <= r; i++) {
            ans.add(result);
            result = result * (r - i) / i;
        }
        return ans;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer> > Al = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            Al.add(generateRow(i + 1));
        }
        return Al;
    }
}

}
