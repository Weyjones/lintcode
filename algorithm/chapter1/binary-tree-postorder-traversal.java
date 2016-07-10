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
    /**http://www.lintcode.com/en/problem/binary-tree-postorder-traversal/#
     * @param root: The root of binary tree.
     * @return: Postorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        // write your code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if (root!=null) {
            stack.push(root);
        }
        
        while(!stack.empty()) {
            TreeNode curt = stack.pop();
            result.add(curt.val);
            // add left child first
            if (curt.left != null) {
                stack.push(curt.left);
            }
            // add right child second
            if (curt.right != null) {
                stack.push(curt.right);
            }
        }
        Collections.reverse(result);
        
        return result;
    }
}