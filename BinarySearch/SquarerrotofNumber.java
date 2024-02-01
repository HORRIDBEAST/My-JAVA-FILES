public class SquarerrotofNumber {
    //brute force linear search 
    /*
     * import java.util.* ;
import java.io.*; 

public class Solution {

	public static int sqrtN(long N) {
		int ans=0;
		for(long i=1;i<=N;i++){
			if(i*i<=(long)N){
				 ans=(int)i;
			}
			else { break;
			}
		}
		return ans;
	}
}
//optimal -Binary Search
import java.util.* ;
import java.io.*; 

public class Solution {

	public static int sqrtN(long N) {
		int ans=1;
		int low=0,high=(int)N;
		while(low<=high){
			long mid=(low+high)/2;
			if(mid*mid<=N){
				ans=(int)mid;
				low=(int)mid+1;
			}
			else high=(int)(mid-1);
		}
		return ans;
	}
}

     */
}
