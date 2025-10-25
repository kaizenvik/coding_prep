package org.grind75.easy.tree;

public class DiameterBinaryTree {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh + rh, Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right)));
    }

    int height(TreeNode root){
        if(root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }


//    class Solution {
//        int diameter = 0;
//        public int diameterOfBinaryTree(TreeNode root) {
//            if(root == null) return 0;
//            int lh = height(root.left);
//            int rh = height(root.right);
//            diameter = Math.max(diameter, lh + rh);
//            return diameter;
//        }
//
//        int height(TreeNode root){
//            if(root == null) return 0;
//            int lh = height(root.left);
//            int rh = height(root.right);
//            diameter = Math.max(diameter, lh + rh);
//            return Math.max(lh, rh) + 1;
//        }
//    }
}
