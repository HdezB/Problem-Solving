import java.util.*;
class findMedian {

    /*
     * Complete the 'findMedian' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    
    public static int findMedian(List<Integer> arr) {
    // Write your code here
        List<Integer> sorted = quicksort(arr);
        return sorted.get(sorted.size()/2);
    }
    
    public static List<Integer> quicksort(List<Integer> arr) {
        List<Integer> sortedArr = new ArrayList();
        if (arr.size() <= 1) {
            return arr;
        }
            int pivot = arr.get(arr.size()/2);
            List<Integer> arrLess = new ArrayList();
            List<Integer> arrGreater = new ArrayList();
            for (int i = 0; i < arr.size(); i++) {
                if(i == arr.size()/2) continue;
                if (arr.get(i) <= pivot) {
                    arrLess.add(arr.get(i));
                } else {
                    arrGreater.add(arr.get(i));
                }
            }
        sortedArr.addAll(quicksort(arrLess));
        sortedArr.add(pivot);
        sortedArr.addAll(quicksort(arrGreater));

        return sortedArr;
    }

}