/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    /**http://www.lintcode.com/en/problem/search-range-in-binary-search-tree/
     * @param root: The root of the binary search tree.
     * @param k1 and k2: range k1 to k2.
     * @return: Return all keys that k1<=key<=k2 in ascending order.
     */
    public ArrayList<Integer> searchRange(TreeNode root, int k1, int k2) {
        // write your code here
        Stack<TreeNode> stack = new Stack<TreeNode>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        TreeNode curt = root;
        
        
        while(curt !=null || !stack.isEmpty()) {
            // traverse all the way to left;
            while (curt !=null) {
                stack.push(curt);
                curt = curt.left;
            }
            
            curt = stack.pop();
            if (curt.val >= k1 && curt.val <= k2) {
                list.add(curt.val);
            }
            curt = curt.right;
        }
        
        return list;
    }
}