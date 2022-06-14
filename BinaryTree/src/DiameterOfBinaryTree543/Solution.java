package DiameterOfBinaryTree543;

class TreeNode {
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

class Solution {

    private int diameter;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter=0;
        depth(root);
        return diameter;
    }

    private int depth(TreeNode node){

        if (node==null){
            return 0;
        }

        int leftDepth = depth(node.left);
        int rightDepth = depth(node.right);
        diameter=Math.max(diameter,leftDepth+rightDepth);
        return Math.max(leftDepth,rightDepth)+1;
    }
}
