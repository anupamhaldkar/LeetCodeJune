class Solution {
    public int sumNumbers(TreeNode root) {
      return calculate(0, root);
    }
    int calculate(int cur, TreeNode root){
        if(root == null) return 0;
        cur = (10*cur) + root.val;
        if(root.left == null && root.right == null)  return cur;
        return calculate(cur, root.left) + calculate(cur, root.right);        
    }
}
