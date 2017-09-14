package com.refresher.tress.binarytrees;

import com.refresher.tress.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    public TreeNode root;

    Queue<TreeNode> queue = new LinkedList<>();
    Stack<TreeNode> stack = new Stack<>();

    public BinaryTree(){
        root = null;
    }

    public void insertNode(int value){

        if ( root == null)
            root = new TreeNode(value);
        else
            root.insert(value);
    }

    public void preorderTraversal(){
        preorder(root);
    }

    public void postorderTraversal(){
        postorder(root);
    }

    public void inorderTraversal(){
        inorder(root);
    }

    public void levelorderTraversal(){
        levelorder(root);
    }

    public void depthfirstTraversal(){

        //stack.push(root);
        depthFirstTraversal(root);
        System.out.printf("%d ", root.getData());
    }

    private void preorder(TreeNode node){

        if (node == null)
            return;

        System.out.printf("%d ", node.getData());
        preorder(node.getLeftNode());
        preorder(node.getRightNode());

    }

    private void postorder(TreeNode node){

        if (node == null)
            return;

        postorder(node.getLeftNode());
        postorder(node.getRightNode());
        System.out.printf("%d ", node.getData());

    }

    private void inorder(TreeNode node){

        if (node == null)
            return;

        inorder(node.getLeftNode());
        System.out.printf("%d ", node.getData());
        inorder(node.getRightNode());


    }



    private void levelorder(TreeNode node){
        if (node == null)
            return;

        if (node == root)
            queue.offer(node);

        if (node.getLeftNode() != null)
            queue.offer(node.getLeftNode());
        if (node.getRightNode() != null)
            queue.offer(node.getRightNode());

        System.out.printf("%d ", ((TreeNode)queue.poll()).getData());

        levelorder((TreeNode)queue.peek());
    }

    private void depthFirstTraversal(TreeNode node) {
        if (node == null)
            return;

        if (node.getRightNode() != null)
            stack.push(node.getRightNode());

        if (node.getLeftNode() != null)
            stack.push(node.getLeftNode());

        if(!stack.isEmpty()) {
            System.out.printf("%d ", ((TreeNode) stack.peek()).getData());
            depthFirstTraversal((TreeNode) stack.pop());
        } else {
            return;
        }
    }

}
