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
    /**http://www.lintcode.com/en/problem/binary-tree-level-order-traversal/
     * @param root: The root of binary tree.
     * @return: Level order a list of lists of integer
     */
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if (root !=null) {
            queue.offer(root);
            queue.offer(null);
        }
        
        ArrayList<Integer> curtList = new ArrayList<Integer>();
        while (queue.size() > 0) {
            TreeNode node = queue.poll();
            if (node == null) { // end of level
                result.add(curtList);
                if (queue.size() > 0) {
                    curtList = new ArrayList<Integer>();
                    queue.offer(null);// mark end of level
                }
            } else {
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
                curtList.add(node.val);
            }
        }
        
        return result;
    }
}