//brute force-direct some methods being used

import java.util.HashMap;
import java.util.stream.Collectors;

class SortacctoFrequency {
    public String frequencySort(String s) {
          HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each character in the string
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Sort the map entries by frequency in descending order
        String result = frequencyMap.entrySet().stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .map(entry -> new String(new char[entry.getValue()]).replace('\0', entry.getKey()))
                .collect(Collectors.joining());

        return result;
    }
}

//better - using hashArray
/*
 * import java.util.ArrayList;
public class Solution {
    public static String sortByFrequency(int n, String s) {
        char c[]=new char[256];
       for(int i=0;i<n;i++){
           c[s.charAt(i)]++;
       }
       StringBuilder sb=new StringBuilder("");
       for(int i=0;i<256;i++){
           while(c[i]>0){
               sb.append((char) i);
               c[i]--;
           }
       }
       return sb.toString();
    }
}
 */



//optimal -using hashMap and Pririrty Queue
/*
 * import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;
public class Solution {
    public static String sortByFrequency(int n, String s) {
                    HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each character in the string
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Use a PriorityQueue to sort characters by their frequency in descending order
        PriorityQueue<Character> pq = new PriorityQueue<>((x, y) -> frequencyMap.get(y) - frequencyMap.get(x));

        // Add all unique characters to the PriorityQueue
        pq.addAll(frequencyMap.keySet());

        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            char ch = pq.poll();

            // Append the character to the StringBuilder based on its frequency
            for (int i = 0; i < frequencyMap.get(ch); i++) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
 */