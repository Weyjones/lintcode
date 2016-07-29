class Solution {
    /**http://www.lintcode.com/en/problem/fibonacci/
     * @param n: an integer
     * @return an integer f(n)
     */
    public int fibonacci(int n) {
        int p1 = 0, p2 = 1;
        if (n == 1) {
            return p1;
        }
        if (n == 2) {
            return p2;
        }
        
        // write your code here
        int i = 3;
        
        while (i <= n) {
            int tmp = p1 + p2;
            p1 = p2;
            p2 = tmp;
            i++;
        }
        return p2;
    }
}
