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
    /**http://www.lintcode.com/en/problem/binary-tree-inorder-traversal/
     * @param root: The root of binary tree.
     * @return: Inorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // write your code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        TreeNode curt = root;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        while (curt != null || !stack.empty()) {
            // step 1: traverse all the way to the left
            while (curt != null) {
                stack.push(curt);
                curt = curt.left;
            }
            
            // curt == null at this point
            // step 2: pop top from stack and add it to result
            curt = stack.pop();
            result.add(curt.val);
            
            // step 3: traverse to the right
            curt = curt.right;
        }
        return result;
    }
}