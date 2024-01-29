public class findMissingElement {
    //better solution than brute force
    public class Solution {
        public static int missingNumber(int []a, int N) {
            int n=N;
           int hash[]=new int[N+1];
           //storing the frequencies
           for(int i=0;i<n-1;i++)
               hash[a[i]]++;
    
            //checking the frequencies from 1 to n
            for(int i=1;i<=N;i++){
                if(hash[i]==0) return i;
            }
           
        return -1;
    }
    }
}
//optimal solution 1
/* 
public class Solution {
    public static int missingNumber(int []a, int N) {
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=a[i];
        }
        int exsum=(N*(N+1))/2;
        int ans=exsum-sum;
        return ans;   
}
}
*/
// optimal solution 2 
int xor1 = 0, xor2 = 0;

        for (int i = 0; i < N - 1; i++) {
            xor2 = xor2 ^ a[i]; // XOR of array elements
            xor1 = xor1 ^ (i + 1); //XOR up to [1...N-1]
        }
        xor1 = xor1 ^ N; //XOR up to [1...N]

        return (xor1 ^ xor2); // the missing number