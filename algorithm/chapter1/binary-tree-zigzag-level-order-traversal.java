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
    /**http://www.lintcode.com/en/problem/binary-tree-zigzag-level-order-traversal/
     * @param root: The root of binary tree.
     * @return: A list of lists of integer include 
     *          the zigzag level order traversal of its nodes' values 
     */
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        // write your code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        
        if (root != null) {
            boolean fromLeftToRight = false;
            LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
            queue.add(root);
            queue.add(null);
            
            ArrayList<Integer> list = new ArrayList<Integer>();
            while (queue.size() > 0) {
                TreeNode current = queue.poll();
                if (current == null) {
                    if (fromLeftToRight) {
                        Collections.reverse(list);
                    }
                    result.add(list);
                    if(queue.size() > 0) {
                        list = new ArrayList<Integer>();
                        queue.add(null);
                        fromLeftToRight = !fromLeftToRight;
                    }
                    
                } else {
                    list.add(current.val);
                    if (current.left != null) {
                        queue.add(current.left);
                    }
                    if (current.right != null) {
                        queue.add(current.right);
                    }
                }
            }
        }
        return result;
    }
}
