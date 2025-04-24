/*
 * There is a collection of input strings and a collection of query strings. 
 * For each query string, determine how many times it occurs in the list of input strings. 
 * Return an array of the results. 
 */
import java.util.*;
class Result {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
    // Write your code here
        HashMap<String,Integer> entries = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < strings.size(); i++) {
            String key = strings.get(i);
            entries.put(key, entries.getOrDefault(key, 0) + 1);
        }
        for (int i = 0; i < queries.size(); i++) {
            result.add(entries.getOrDefault(queries.get(i), 0));
        }
        return result;
    }

}