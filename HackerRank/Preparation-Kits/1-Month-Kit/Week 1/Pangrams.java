/*
 * A pangram is a string that contains every letter of the alphabet. 
 * Given a sentence determine whether it is a pangram in the English alphabet. 
 * Ignore case. Return either pangram or not pangram as appropriate.
 */
import java.util.*;
class Result {
    public static String pangrams(String s) {
        // Write your code here
        s = s.toLowerCase();
        HashSet<Character> letters = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                letters.add(c);
            }
        }
        for (Character character : letters) {
            System.out.println(character);
        }
        if (letters.size() == 26) {
            return "pangram";
        } else {
            return "not pangram";
        }
    }
}
