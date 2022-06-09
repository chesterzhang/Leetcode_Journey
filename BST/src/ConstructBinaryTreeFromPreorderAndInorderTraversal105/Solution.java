package ConstructBinaryTreeFromPreorderAndInorderTraversal105;


import java.util.HashMap;
import java.util.Map;

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
    private int preorderIdx;
    private HashMap<Integer, Integer> inorderIdxMap;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preorderIdx = 0;// 起始根节点

        inorderIdxMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderIdxMap.put(inorder[i], i);
        }

        return arrToTree(preorder, 0, preorder.length - 1);
    }

    //根据preorder[left, right] 创建二叉树
    //并返回 preorder[left, right] 中的根节点
    private TreeNode arrToTree(int[] preorder, int left, int right){
        if (left>right){
            return  null;
        }
        int nodeValue = preorder[preorderIdx];
        preorderIdx++;
        TreeNode node = new TreeNode(nodeValue);

        node.left = arrToTree(preorder, left, inorderIdxMap.get(nodeValue) - 1);
        node.right = arrToTree(preorder, inorderIdxMap.get(nodeValue) + 1, right);
        return node;
    }
}
