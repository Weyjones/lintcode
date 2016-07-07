public class Solution {
    /** http://www.lintcode.com/en/problem/search-in-rotated-sorted-array/#
     *@param A : an integer rotated sorted array
     *@param target :  an integer to be searched
     *return : an integer
     */
    public int search(int[] A, int target) {
        if (A == null || A.length == 0) {
            return -1;
        }
        int l = 0;
        int r = A.length -1;
        while (l + 1 < r){
            int m = (l + r) / 2;
            if (A[m] == target){
                return m;
            }
            if (A[m] > A[l]){
                if (target >= A[l] && target <= A[m]) {
                    r = m;
                }else{
                    l = m;
                }
            } else {
                if (target >= A[m] && target <= A[r]) {
                    l = m;
                } else {
                    r = m;
                }
            }
        }
        if (A[l] == target) {
            return l;
        }
        if (A[r] == target) {
            return r;
        }
        return -1;
    }
}
