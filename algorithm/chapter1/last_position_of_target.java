public class Solution {
    /**http://www.lintcode.com/en/problem/last-position-of-target/
     * @param A an integer array sorted in ascending order
     * @param target an integer
     * @return an integer
     * Runtime: O(logN) 
     * Space: O(1)
     */
    public int lastPosition(int[] A, int target) {
        // Write your code here
        // edge cases
        if (A == null || A.length == 0) {
            return -1;
        }
        
        int length = A.length;
        
        // binary search
        int start = 0, end = length - 1;
        while (start + 1 < end) {
            int mid = (start + end)/2;
            if (A[mid] > target) {
                // move left
                end = mid;
            } else {
                // move right
                start = mid;
            }
        }
        
        // start + 1 = end || start == end, single element
        if (A[end] == target)
            return end;
        if (A[start] == target)
            return start;
        return -1;
    }
}