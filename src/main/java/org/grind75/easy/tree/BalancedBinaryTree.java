package org.grind75.easy.tree;

public class BalancedBinaryTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

//    static boolean balanced = true;
//    public boolean isBalanced(TreeNode root) {
//        balanced = true;
//        height(root);
//        return balanced;
//    }
//
//
//
//    public int height(TreeNode root) {
//        if (root == null)
//            return 0;
//        int l =0, r =0;
//        if (root.right != null)
//            l = height(root.right)+1;
//        if (root.left != null)
//            r = height(root.left)+1;
//        balanced &= !(Math.abs(l - r) > 1);
//        return Math.max(l,r);
//    }


    boolean isBalanced = true;
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int lh = height(root.left);
        int rh = height(root.right);
        return isBalanced && Math.abs(lh - rh) <= 1;
    }

    int height(TreeNode root){
        if(root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        if (Math.abs(lh - rh) > 1){
            isBalanced = false;
        }
        return Math.max(lh, rh) + 1;
    }
}
