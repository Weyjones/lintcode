public class Solution {
    /**http://www.lintcode.com/en/problem/climbing-stairs/
     * @param n: An integer
     * @return: An integer
     */
    public int climbStairs(int n) {
        if (n < 4) {
            return n;
        }
        int a = 2, b = 3, c = 5;  
        for (int i = 5; i <= n; i++)  
        {  
            a = c;  
            c = b+c;  
            b = a;  
        }  
        return c;  
    }
}