package FlattenBinaryTreeToLinkedList114;

import java.util.ArrayList;
import java.util.List;

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
    public void flatten(TreeNode root) {
        if (root==null){
            return ;
        }
        List<TreeNode> list=new ArrayList<>();
        preOrder(root,list);
        TreeNode curNode=root;
        for (int i=1;i<list.size();i++){
            TreeNode rightNode=list.get(i);
            curNode.left=null;
            curNode.right=rightNode;
            curNode=rightNode;
        }

    }

    private  void preOrder(TreeNode node, List<TreeNode> list){
        if (node==null) {
            return;
        }
        list.add(node);
        preOrder(node.left,list);
        preOrder(node.right,list);
    }

}
