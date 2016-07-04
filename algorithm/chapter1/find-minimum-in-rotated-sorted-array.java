public class Solution {
    /**http://www.lintcode.com/en/problem/find-minimum-in-rotated-sorted-array/
     * @param num: a rotated sorted array
     * @return: the minimum number in the array
     * runtime: O(n)
     * space: O(1)
     */
    public int findMin(int[] num) {
        int l = 0;
        int r = num.length-1;
        while(l < r){
            int m = (l+r)/2;
            if(num[l] < num[r]){
                return num[l];
            }else if(num[m]>num[r]){
                l = m+1;
            }else if(num[m]<num[r]){
                r = m;
            }
        }
        return Math.min(num[l], num[r]);
    }
}