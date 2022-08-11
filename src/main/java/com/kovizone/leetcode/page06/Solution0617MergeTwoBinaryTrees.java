package com.kovizone.leetcode.page06;

import com.kovizone.leetcode.core.TreeNode;

/**
 * <a href="https://leetcode.cn/problems/merge-two-binary-trees/">617. 合并二叉树</a>
 *
 * @author KV
 * @since 2022/07/12
 */
public class Solution0617MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        TreeNode treeNode = new TreeNode(root1.val + root2.val);
        treeNode.left = mergeTrees(root1.left, root2.left);
        treeNode.right = mergeTrees(root1.right, root2.right);
        return treeNode;
    }
}