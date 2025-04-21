/* 
Given an array of integers, 
calculate the ratios of its elements 
that are positive, negative, and zero. 
Print the decimal value of each fraction 
on a new line with places after the decimal. 
 */
class Result {
 public static void plusMinus(List<Integer> arr) {
    // Write your code here
    double pos = 0, neg = 0, zero = 0;
    for (Integer integer : arr) {
            if (integer == 0) {
                zero++;
            } else if (integer < 0) {
                neg++;
            } else {
                pos++;
            }
    }
    System.out.printf("%.6f", pos/arr.size());
    System.out.printf("%.6f", neg/arr.size());
    System.out.printf("%.6f", zero/arr.size());
    } 
}