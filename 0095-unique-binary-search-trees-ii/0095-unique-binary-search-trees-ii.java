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
    public List<TreeNode> generateTrees(int n) {
        return solve(1,n);
    }
    public List<TreeNode> solve (int start, int end){
        List<TreeNode> ans = new ArrayList<>();
        // int start = 1;
        // int end = n;
        if(start > end){
            ans.add(null);
            return ans;
        }
        if(start == end){
           TreeNode root = new TreeNode (start);
            ans . add(root);
            return ans;
        }
        for(int i = start;i<= end;i++){
            List<TreeNode> left_bst = solve(start,i-1);
            List<TreeNode> right_bst = solve(i+1,end);
            for(TreeNode leftroot : left_bst){
                for(TreeNode rightroot: right_bst){
                    TreeNode root = new TreeNode(i);
                    root.left = leftroot;
                    root.right = rightroot;
                    ans . add(root);
                }
            }
        }
        return ans;
    }
}