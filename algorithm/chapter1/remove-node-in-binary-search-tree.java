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
    /**http://www.lintcode.com/en/problem/remove-node-in-binary-search-tree/
     * @param root: The root of the binary search tree.
     * @param value: Remove the node with given value.
     * @return: The root of the binary search tree after removal.
     */
    public TreeNode removeNode(TreeNode root, int value) {
        TreeNode dummy = new TreeNode(-1); 
        TreeNode cur = root; 
        TreeNode pre = dummy;
        dummy.right = root;
        while (cur != null) {
            if (cur.val == value) {
                if (pre.right == cur) {
                    pre.right = makeNew(cur);
                } else {
                    pre.left = makeNew(cur);
                }
                break;
            } else if (cur.val < value) {
                pre = cur;
                cur = cur.right;
            } else {
                pre = cur;
                cur = cur.left;
            }
        }
        return dummy.right;
    }
     
    private TreeNode makeNew(TreeNode node) {
        if (node.left == null && node.right == null) {
            return null;
        }
        if (node.left == null) {
            return node.right;
        } else if (node.right == null) {
            return node.left;
        }
        TreeNode left = node.left.right;
        TreeNode leftMost = node.right; //the left most node of right child
        while (leftMost.left != null) {
            leftMost = leftMost.left;
        }
        leftMost.left = left;//appen left's right tree to right's left most node
        node.left.right = node.right;
        return node.left;
    
    }
}