class Solution {
    /**http://www.lintcode.com/en/problem/sqrtx/
     * @param x: An integer
     * @return: The sqrt of x
     */
    public int sqrt(int x) {
        // write your code here
        // Step 1: do a binary search between 1 and x
        // find the first element y such that y * y <= x
        long start = 1, end = x;
        while (start + 1 < end) {
            long mid = (start + end)/2;
            if (mid * mid <= x) {
                // move left, too small, getting larger
                start = mid;
            } else {
                // move right, too large, getting smaller
                end = mid;
            }
        }
        // Step 2: return start or end
        
        // at this point, start + 1 == end, or start == end
        // start or end are cloesest you can get to be Sqrt(x), decide which to return
        if (end * end <= x) {
            return (int) end;
        }
        return (int) start;
    }
}