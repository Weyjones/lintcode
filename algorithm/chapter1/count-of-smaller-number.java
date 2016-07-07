public class Solution {
   /**http://www.lintcode.com/en/problem/count-of-smaller-number/
     * @param A: An integer array
     * @return: The number of element in the array that 
     *          are smaller that the given integer
     */
    public ArrayList<Integer> countOfSmallerNumber(int[] A, int[] queries) {
        Arrays.sort(A);
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < queries.length; i++) {
            int target = queries[i];
            int l = 0;
            int r = A.length-1;
            int count = 0;
            if(A.length > 0 && target > A[0]){
                while (l + 1 < r){
                    int m = (l + r)/2;
                    if (A[m] >= target) {
                        r = m;
                    } else {
                        l = m;
                    }
                }
                if (A[l] == target) {
                    count = l;
                } else {
                    count = r;
                }
            }
            
            result.add(count);
            
        }
        return result;
    }
}