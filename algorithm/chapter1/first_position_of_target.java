class Solution {
    /**http://www.lintcode.com/en/problem/first-position-of-target/
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        int start = 0, end = nums.length;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                end = mid;
            } else if (nums[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if (nums[start] == target) {
            return start;
        } 
        if (nums[end] == target) {
            return end;
        }

        return -1;
    }
}