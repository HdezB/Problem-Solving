/*
 * the counting sort, does not require comparison. 
 * Instead, you create an integer array whose index range covers the entire range of values in your array to sort. 
 * Each time a value occurs in the original array, you increment the counter at that index. 
 * At the end, run through your counting array, printing the value of each non-zero valued index that number of times.
 */
import java.util.*;
class Result {
    public static List<Integer> countingSort(List<Integer> arr) {
    // Write your code here
        ArrayList<Integer> result = new ArrayList<>(Collections.nCopies(100, 0));
        for (Integer number : arr) {
            result.set(number, result.get(number) + 1);
        }
        return result;
    }

}