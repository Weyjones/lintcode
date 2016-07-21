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
    /**http://www.lintcode.com/en/problem/insert-node-in-a-binary-search-tree/
     * @param root: The root of the binary search tree.
     * @param node: insert this node into the binary search tree
     * @return: The root of the new binary search tree.
     */
    public TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here
        if (root == null)
            return node;
        TreeNode curt = root;
        TreeNode prev = null;
        while(curt != null) {
            prev = curt;
            if (curt.val > node.val) {
                // go left
                curt = curt.left;
            } else {
                curt = curt.right;
            }
        }
        // curt == null
        if (prev.val > node.val) {
            prev.left = node;
        } else if (prev.val < node.val){
            prev.right = node;
        }
        return root;
    }
}