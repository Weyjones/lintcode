class Solution {
    /**http://www.lintcode.com/en/problem/subsets/
     * @param S: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
    public ArrayList<ArrayList<Integer>> subsets(int[] nums) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>(); 
        Arrays.sort(nums);
        result.add(new ArrayList<Integer>());
        for (int i = 0; i < nums.length; i++) {
            int len = result.size();
            for (int j = 0; j < len; j++) {
                ArrayList<Integer> temp = new ArrayList<Integer>(result.get(j));
                temp.add(nums[i]);
                result.add(temp);
            }
        }
        return result;
    }
}