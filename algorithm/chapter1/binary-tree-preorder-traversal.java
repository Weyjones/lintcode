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
http://www.lintcode.com/en/problem/binary-tree-preorder-traversal/
     * @param root: The root of binary tree.
     * @return: Preorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        // write your code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if (root!=null) {
            stack.push(root);
        }
        
        while(!stack.empty()) {
            TreeNode curt = stack.pop();
            result.add(curt.val);
            // add right child first
            if (curt.right != null) {
                stack.push(curt.right);
            }
            // add left child second
            if (curt.left != null) {
                stack.push(curt.left);
            }
        }
        
        return result;
    }

}