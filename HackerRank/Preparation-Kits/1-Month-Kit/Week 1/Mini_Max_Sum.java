/*
Given five positive integers, find the minimum 
and maximum values that can be calculated by 
summing exactly four of the five integers. 
Then print the respective minimum and maximum 
values as a single line of two space-separated long integers. 
*/

class Result {
    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        Collections.sort(arr);
        long max = 0;
        long min = 0;
        for (int i = 0, j = arr.size()-1; i < 4; i++, j--) {
            max += arr.get(j);
            min += arr.get(i);
        }
        System.out.println(min + " " + max);
    }
}