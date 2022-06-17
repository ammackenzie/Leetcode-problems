package medium.treeNode;
//https://leetcode.com/problems/binary-tree-cameras/submissions/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }
    private int cameras = 0;
    private int NOT_MONITORED = 0;
    private int MONITORED_NO_CAM = 1;
    private int MONITORED_WITH_CAM = 2;

    public int minCameraCover(TreeNode root) {
        if(root == null){ return 0; }
        int top = dfs(root);
        return cameras + (top == NOT_MONITORED ? 1 : 0);

    }

    private int dfs(TreeNode node){
        if(node == null){return MONITORED_NO_CAM;}
        int left = dfs(node.left);
        int right = dfs(node.right);
        if (left == MONITORED_NO_CAM && right == MONITORED_NO_CAM) {
            return NOT_MONITORED;
        } else if (left == NOT_MONITORED || right == NOT_MONITORED) {
            cameras++;
            return MONITORED_WITH_CAM;
        } else {
            return MONITORED_NO_CAM;
        }
    }
}