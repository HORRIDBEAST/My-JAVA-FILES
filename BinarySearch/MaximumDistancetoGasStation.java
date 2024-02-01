public class MaximumDistancetoGasStation {
    //brute force 
    /*
     * public class Solution {
    public static double MinimiseMaxDistance(int []arr, int K){
       int n=arr.length;
       int manyhow[]=new int [n-1];
        //pick and place k gas stations
       for(int gS=1 ;gS<=K;gS++){
           //find the mmaximum section and insert the gas station
           double maxS=-1;
            int maxInd=-1;
            for(int i=0;i<n-1;i++){
                double diff=arr[i+1]-arr[i];
                double secLen= diff/(double)(manyhow[i]+1);
                if(secLen>maxS){
                    maxS=secLen;
                    maxInd=i;
                }
            }
            //insert the current gas station
            manyhow[maxInd]++;
       }
       //find the maximum distance
       double ans=-1;
       for(int i=0;i<n-1;i++){
              double diff=arr[i+1]-arr[i];
                double secLen= diff/(double)(manyhow[i]+1);
                ans=Math.max(ans,secLen);
       }
       return ans;
    }

}
     */

    //better - using the Priority Queue
    import java.util.PriorityQueue;

public class Solution {
    public static class Pair {
        double first;
        int second;

        Pair(double first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    public static double MinimiseMaxDistance(int []arr, int K){
       int n=arr.length;
       int manyhow[]=new int [n-1];
        //pick and place k gas stations
       PriorityQueue<Pair> pq=new PriorityQueue<>((a,b) -> Double.compare(b.first,a.first));

       //insert the first n-1 elemnts into pq with respective distance values
       for(int i=0;i<n-1;i++){
           pq.add(new Pair(arr[i+1]-arr[i], i));
       }
       //pcik and place k gas Stations

       for(int gS=1;gS<=K;gS++){
           //find the maximum station and insert that gas Station
           Pair tp=pq.poll();
           int secInd=tp.second;

           //insert the current gas Station
           manyhow[secInd]++;

           double indiff=arr[secInd+1]-arr[secInd];
           double newSecLen=indiff/(double) (manyhow[secInd]+1);

           pq.add(new Pair(newSecLen, secInd));

       }
       return pq.peek().first;
    }

}
//optimal-using binary search
/*
 * public class Solution {
    public static int numberofGSreqd(double dist,int arr[]){
        int n=arr.length;
        int c=0;
        for(int i=1;i<n;i++){
            int GSINBTEN=(int)((arr[i] -arr[i-1])/dist);
            if(arr[i]-arr[i-1]==dist*GSINBTEN){
                GSINBTEN--;
            }
            c+=GSINBTEN;
        }
        return c;
    }
    public static double MinimiseMaxDistance(int []arr, int K){
        int n=arr.length;
        double low=0;
        double high=0;
        //find the value of the high
        for(int i=0;i<n-1;i++){
            high=Math.max(high, (double)arr[i+1]-arr[i]);
        }


        double diff=1e-6;
        //apply binary Search
        while(high-low>diff){
            double mid=(low+high)/2;
            int cnt=numberofGSreqd(mid, arr);
            if(cnt>K){
                low=mid;
            }
            else high=mid;
        }
        return high;

    }
}
 */

}
