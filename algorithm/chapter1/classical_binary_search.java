public class Solution {
    /**http://www.lintcode.com/en/problem/classical-binary-search/
     * @param A an integer array sorted in ascending order
     * @param target an integer
     * @return an integer
     */
    public int findPosition(int[] A, int target) {
        // Write your code here
        // base case
        if(A == null || A.length == 0) {
            return -1;
        }

        // A.length == 1?
        int start = 0, end = A.length - 1;
        while(start < end - 1) {
            int mid = (start + end)/2;
            if (A[mid] == target) {
                return mid;
            }
            
            if (A[mid] < target) { //move right
                start = mid + 1;
            } else { //move left
                end = mid - 1;
            }
        }
        
        // start + 1 = end || start == end (only one element)
        if (A[start] == target)
            return start;
        if (A[end] == target)
            return end;
        return -1;
    }
}