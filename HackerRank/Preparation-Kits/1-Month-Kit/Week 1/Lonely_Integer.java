/*
 * Given an array of integers, where all elements but one occur twice, find the unique element. 
 */
import java.util.*;
 class Result {
    public static int lonelyinteger(List<Integer> a) {
    // Write your code here
        HashMap<Integer, Integer> numOccurences = new HashMap<>();
        int value = 0;
        for(Integer num : a) {
            numOccurences.put(num, numOccurences.getOrDefault(num, 0)+1);
        }
        for (HashMap.Entry<Integer, Integer> entry : numOccurences.entrySet()) {
            if (entry.getValue() == 1) {
                value = entry.getKey();
            }
        }
        return value;
    }

    /*
    * There's an alternative to this problem with a simpler approach
    * using XOR...
    */
    public static int lonelyinteger2(List<Integer> a) {
        // Write your code here
            int value = 0;
            for (Integer num : a) {
                value ^= num;
            }
            return value;
        }
}
