// Given a sorted array arr consisting of 0s and 1s. The task is to find the index (0-based indexing) of the first 1 in the given array.
// NOTE: If one is not present then, return -1.

// Input : arr[] = [0, 0, 0, 0, 0, 0, 1, 1, 1, 1]
// Output : 6
// Explanation: The index of first 1 in the array is 6.

// Input : arr[] = [0, 0, 0, 0]
// Output : -1
// Explanation: 1's are not present in the array.

// Expected Time Complexity: O(log (n))
// Expected Auxiliary Space: O(1)

class Solution {

    public long firstIndex(int arr[]) {
        int left = 0, right = arr.length-1, firstIndex = -1;
        while (left <= right) { 
            int mid = (left+right)/2;
            if(arr[mid] == 1) {
                firstIndex = mid;
                right = mid-1;
            } else if (arr[mid] < 1) {
                left = mid + 1;
            }
        }
        return firstIndex;
    }
}
