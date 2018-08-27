package com.example.stan.demo.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Stan on 2018/8/27.
 */

public class Tree {
    private TreeNode root;

    public static class TreeNode {

        Object data;
        TreeNode left;
        TreeNode right;
        TreeNode parent;

        public TreeNode() {

        }

        public TreeNode(Object data) {
            this.data = data;
        }

        public TreeNode(Object data, TreeNode left, TreeNode right, TreeNode parent) {
            this.data = data;
            this.left = left;
            this.right = right;
            this.parent = parent;
        }

    }

    // 这是一个递归方法：每一棵子树的深度为其所有子树的最大深度 + 1
    private int deep(TreeNode node) {
        if (node == null) {
            return 0;
        }
        // 没有子树
        if (node.left == null && node.right == null) {
            return 1;
        } else {
            int leftDeep = deep(node.left);
            int rightDeep = deep(node.right);
            // 记录其所有左、右子树中较大的深度
            int max = leftDeep > rightDeep ? leftDeep : rightDeep;
            // 返回其左右子树中较大的深度 + 1
            return max + 1;
        }
    }

    // 实现先序遍历
    // 1、访问根节点
    // 2、递归遍历左子树
    // 3、递归遍历右子树
    public List<TreeNode> preIterator() {
        return preIterator(root);
    }

    private List<TreeNode> preIterator(TreeNode node) {

        List<TreeNode> list = new ArrayList<TreeNode>();
        // 处理根节点
        list.add(node);

        // 递归处理左子树
        if (node.left != null) {
            preIterator(node.left);
        }

        // 递归处理右子树
        if (node.right != null) {
            preIterator(node.right);
        }

        return list;

    }

    // 实现中序遍历
    // 1、递归遍历左子树
    // 2、访问根节点
    // 3、递归遍历右子树
    public List<TreeNode> inIterator() {
        return inIterator(root);
    }

    private List<TreeNode> inIterator(TreeNode node) {

        List<TreeNode> list = new ArrayList<TreeNode>();

        // 递归处理左子树
        if (node.left != null) {
            inIterator(node.left);
        }

        // 处理根节点
        list.add(node);

        // 递归处理右子树
        if (node.right != null) {
            inIterator(node.right);
        }

        return list;

    }

    // 实现后序遍历
    // 1、递归遍历左子树
    // 2、递归遍历右子树
    // 3、访问根节点
    public List<TreeNode> postIterator() {
        return postIterator(root);
    }

    private List<TreeNode> postIterator(TreeNode node) {

        List<TreeNode> list = new ArrayList<TreeNode>();

        // 递归处理左子树
        if (node.left != null) {
            postIterator(node.left);
        }

        // 递归处理右子树
        if (node.right != null) {
            postIterator(node.right);
        }

        // 处理根节点
        list.add(node);

        return list;

    }

    // 实现广度优先遍历
    // 广度优先遍历又称为按层遍历，整个遍历算法先遍历二叉树的第一层（根节点），再遍历根节点的两个子节点（第二层），以此类推
    public List<TreeNode> breadthFirst() {

        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        List<TreeNode> list = new ArrayList<TreeNode>();
        if (root != null) {
            // 将根元素加入“队列”
            queue.offer(root);
        }
        while (!queue.isEmpty()) {
            // 将该队列的“队尾”的元素添加到List中
            list.add(queue.peek());
            TreeNode p = queue.poll();
            // 如果左子节点不为null，将它加入“队列”
            if (p.left != null) {
                queue.offer(p.left);
            }
            // 如果右子节点不为null，将它加入“队列”
            if (p.right != null) {
                queue.offer(p.right);
            }
        }
        return list;
    }

}
