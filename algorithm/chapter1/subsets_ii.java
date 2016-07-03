class Solution {
    /**http://www.lintcode.com/en/problem/subsets-ii/
     * @param S: A set of numbers.
     * @return: A list of lists. All valid subsets. 
     */
    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> S) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>(); 
        Collections.sort(S);
        result.add(new ArrayList<Integer>());
        for (int i = 0; i < S.size(); i++) {
            int len = result.size();
            for (int j = 0; j < len; j++) {
                ArrayList<Integer> temp = new ArrayList<Integer>(result.get(j));
                temp.add(S.get(i));
                if (!result.contains(temp)){
                    result.add(temp);
                }
            }
        }
        return result;
    }
}
