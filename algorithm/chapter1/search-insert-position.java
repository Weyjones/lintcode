public class Solution {
    /** http://www.lintcode.com/en/problem/search-insert-position/
     * param A : an integer sorted array
     * param target :  an integer to be inserted
     * return : an integer
     */
    public int searchInsert(int[] A, int target) {
        if (A == null || A.length == 0) {
            return 0;
        }
        int l=0;
        int r=A.length-1;
        while(l<r){
            int m = (l+r)/2;
            if(A[m] == target){
                return m;
            }else if(A[m] < target){
                l = m+1;
            }else {
                r = m-1;
            }
        }   // if did not return, l = r at this moment
        if (A[l] >= target){
            return l;  //move original number backward and insert target into that index
        }
        return l+1;  //insert target to the next index
    }
}
