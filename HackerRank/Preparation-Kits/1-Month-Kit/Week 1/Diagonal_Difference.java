/*
 * Given a square matrix, calculate the absolute difference between the sums of its diagonals. 
 */
import java.util.*;
 class Result {
    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        int ltr_Diagonal = 0;
        int rtl_Diagonal = 0;
        for (int i = 0; i < arr.size(); i++) {
            ltr_Diagonal += arr.get(i).get(i);
        }
        for (int i = 0; i < arr.size(); i++) {
            rtl_Diagonal += arr.get(i).get(arr.size()-1-i);
        }
        return Math.abs(ltr_Diagonal - rtl_Diagonal);
    }
}
