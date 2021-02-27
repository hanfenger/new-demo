package com.lk.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCodeDemo {

    /**
     * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
     * https://leetcode-cn.com/leetbook/read/data-structure-binary-tree/xefh1i/
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        //遍历法。使用队列作为辅助。先将根节点放入队列。
        List<List<Integer>> resultList = new ArrayList<>();
        if (null == root) {
            return resultList;
        }
        Queue<TreeNode> tempQueue = new LinkedList<>();
        tempQueue.offer(root);
        while (tempQueue.size() > 0) {
            List<Integer> tempList = new ArrayList<>();
            for (int i = 0; i < tempQueue.size(); i++) {
                TreeNode tempNode = tempQueue.poll();
                tempList.add(tempNode.val);
                if (tempNode.left != null) {
                    tempQueue.offer(tempNode.left);
                }
                if (tempNode.right != null) {
                    tempQueue.offer(tempNode.right);
                }
            }

            resultList.add(tempList);
        }
        return resultList;
    }
}
